class Stack {
    var containedObjects: List[Object] = List()

    def pop(): Object = {
        if (this.containedObjects != null) {
            this.containedObjects
        } else {
            throw new NoSuchElementException
        }
    }

    def push(stackableObject: Object) {
        this.containedObjects = stackableObject :: this.containedObjects
    }
}
