object PatternMatching {
    def main(args: Array[String]): Unit = {
        val check: Int => String = num => num match {
        case num if num <= 0 => "Negative/Zero is input"
        case num if num % 2 == 0 => "Even number is given"
        case _ => "Odd number is given"
        }

        println(check(-1))
        println(check(2))
        println(check(3))
    }
}
