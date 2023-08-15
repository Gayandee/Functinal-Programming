object Interest {
    def main(args: Array[String]): Unit = {
        val interestFunc: Double => Double = deposit => deposit match {
        case deposit if deposit <= 20000 => deposit * 0.02
        case deposit if deposit <= 200000 => deposit * 0.04
        case deposit if deposit <= 2000000 => deposit * 0.035
        case _ => deposit * 0.065
        }

        println("Interest for 10000: " + interestFunc(10000))
        println("Interest for 100000: " + interestFunc(100000))
        println("Interest for 1000000: " + interestFunc(1000000))
        println("Interest for 10000000: " + interestFunc(10000000))
    }
}
