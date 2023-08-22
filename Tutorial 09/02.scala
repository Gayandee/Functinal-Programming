
object RationalSubtraction {
  class Rational(numer: Int, denom: Int) {
    
    private val gcdVal = gcd(numer.abs, denom.abs)

    val numerator: Int = numer / gcdVal
    val denominator: Int = denom / gcdVal
    
    private def gcd(a: Int, b: Int): Int = {
        if (b == 0) a else gcd(b, a % b)
    }
    
    def -(other: Rational): Rational =
      new Rational(numerator * other.denominator - other.numerator * denominator, denominator * other.denominator)
    
    override def toString: String = s"$numerator/$denominator"
  }
  
  def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)
    
    val result = x - y - z
    println(result)
    }
}