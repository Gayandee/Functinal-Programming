import scala.io.StdIn

object Square {
    def main(args: Array[String]): Unit = {
        println("Enter a list of integers separated by commas:")
        val inputLine = StdIn.readLine()
        val inputList = inputLine.split(",").map(_.toInt).toList

        val outputList = calculateSquare(inputList)
        println("Squares of numbers: " + outputList.mkString(", "))
    }

    def calculateSquare(numbers: List[Int]): List[Int] = {
        numbers.map(number => number * number)
  }
}
