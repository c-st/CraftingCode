import org.scalatest._

class StackSpec extends WordSpec with Matchers {
    "A Stack" when {
        "empty" should {
            "throw an exception if popped" in {
                val stack = new Stack()
                pending
                assertThrows[NoSuchElementException] {
                    stack.pop()
                }
            }

            "pop the last pushed object" in {
                pending
                val stack = new Stack()
                val stackableObject = new Object()

                stack.push(stackableObject)

                assert(stack.pop() equals stackableObject)
            }
        }

        "non-empty" should {
            "pop objects in the reverse order than they were pushed" in {
                pending
                val firstObject = new Object()
                val secondObject = new Object()
                val stack = new Stack()

                stack.push(firstObject)
                stack.push(secondObject)

                assert(stack.pop() equals secondObject)
                assert(stack.pop() equals firstObject)
            }
        }
    }
}
