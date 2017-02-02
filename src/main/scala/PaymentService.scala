class UserService {
    def isValid(user: User): Boolean = { ??? }
}
class PaymentGateway {
    def payWith(details: PaymentDetails): Unit = { ??? }
}
case class User()
case class PaymentDetails()

class PaymentService(userService: UserService, paymentGateway: PaymentGateway) {
    def processPayment(user: User, paymentDetails: PaymentDetails) = {
        if (!userService.isValid(user)) {
            throw new Exception()
        }
        paymentGateway.payWith(paymentDetails)
    }
}
