import org.scalatest._

class HelloSpec extends WordSpec with Matchers {

  "A Set" when {
    "empty" should {
      "have size 0" in {
        assert(Set.empty.size === 0)
      }

      "produce NoSuchElementException when head is invoked" in {
        assertThrows[NoSuchElementException] {
          Set.empty.head
        }
      }
    }
  }

}
