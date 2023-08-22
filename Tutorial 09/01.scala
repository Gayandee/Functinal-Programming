class Rational(val numer: Int, val denom: Int) {
  
    private def gcd(a: Int, b: Int): Int = {
        if (b == 0) a else gcd(b, a % b)
    }
  
    private val g = gcd(numer, denom)
    
    val numerator: Int = numer / g
    val denominator: Int = denom / g
    
    def neg: Rational = {
        new Rational(-numerator, denominator)
    }
    
    override def toString: String = s"$numerator/$denominator"
    }

object Main {
    def main(args: Array[String]): Unit = {
        println(s"Enter the numerator: ")
        val num = scala.io.StdIn.readInt()
        println(s"Enter the denominator: ")
        val den = scala.io.StdIn.readInt()

        if (den != 0) {
            val x = new Rational(num, den)
            println(x.neg)
        } else {
            println("Denominator cannot be zero.")
        }
    }
}