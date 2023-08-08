import scala.io.StdIn

object Prime{
  def main(args: Array[String]): Unit = {
    println("Enter a list of integers separated by commas:")
    val inputLine = StdIn.readLine()
    val inputList = inputLine.split(",").map(_.toInt).toList

    val outputList = filterPrime(inputList)
    println("Prime numbers: " + outputList.mkString(", "))
  }

  def isPrime(number: Int): Boolean = {
    if (number <= 1) false
    else if (number <= 3) true
    else if (number % 2 == 0 || number % 3 == 0) false
    else {
      var i = 5
      while (i * i <= number) {
        if (number % i == 0 || number % (i + 2) == 0) return false
        i += 6
      }
      true
    }
  }

  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(isPrime)
  }
}
