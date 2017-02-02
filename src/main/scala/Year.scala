class Year(year: Int) {
    def isLeapYear(): Boolean = {
        isDivisibleBy(400) &&
            (!(isDivisibleBy(100) &&
                !isDivisibleBy(400))) && isDivisibleBy(4)
    }

    def isDivisibleBy(divisor: Integer): Boolean = this.year % divisor == 0
}
