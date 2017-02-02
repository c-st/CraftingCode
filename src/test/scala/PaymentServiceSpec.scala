import org.scalamock.clazz.Mock
import org.scalamock.scalatest.MockFactory
import org.scalatest.{BeforeAndAfterEach, Matchers, WordSpec}

class PaymentServiceSpec extends WordSpec with Matchers with MockFactory with BeforeAndAfterEach {
    "PaymentService" should {
        val userService = stub[UserService]
        val paymentGateway = stub[PaymentGateway]
        val paymentService = new PaymentService(userService, paymentGateway)
        val user = User()
        val details = PaymentDetails()

        "throw exception if user is not valid" in {
            userService.isValid _ when user returns false

            assertThrows[Exception] {
                paymentService.processPayment(user, details)
            }
        }

        "should not forward request if user is invalid" in {
            userService.isValid _ when user returns false

            assertThrows[Exception] {
                paymentService.processPayment(user, details)
            }

            (paymentGateway.payWith _).verify(*).never
        }

        "should forward the request to payment gateway when user is valid" in {
            userService.isValid _ when user returns true

            paymentService.processPayment(user, details)

            (paymentGateway.payWith _).verify(details)
        }
    }
}
