import org.scalatest.{Matchers, WordSpec}

class LeapYearSpec extends WordSpec with Matchers {

    "Year" should {
        "be a leap year if it is divisible by 400" in {
            assert(new Year(400).isLeapYear())
            assert(!new Year(500).isLeapYear())
        }

        "not be a leap year if it is divisible by 100 but not by 400" in {
            assert(!new Year(1805).isLeapYear())
            assert(!new Year(1800).isLeapYear())
        }

        "be a leap year if it is also divisible by 4" in {
            assert(new Year(1600).isLeapYear())
            assert(!new Year(1700).isLeapYear())
        }

    }


}
