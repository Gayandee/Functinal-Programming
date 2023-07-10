object PrimeSeq{
    def main(args:Array[String]):
    Unit={
        println(primeSeq(10))
    }

    def isPrime(num:Int,divisor:Int=2):Boolean= num match{
        case x if (num < 2) => false
        case x if (num == 2) => true
        case x if (num % divisor == 0) => false
        case x if (divisor * divisor > num) => true
        case x => isPrime(num, divisor + 1)

    }
    def primeSeq(n:Int):
    Unit={
        if(n>2) primeSeq(n-1)
        if(isPrime(n)) println(n)
    }
}
