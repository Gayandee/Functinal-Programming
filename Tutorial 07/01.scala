import scala.io.StdIn

object filterEven {
    def main(args: Array[String]): Unit = {
        println("Enter a list of integers separated by commas:")
        val inputLine = StdIn.readLine()
        val inputList = inputLine.split(",").map(_.toInt).toList

        val outputList = inputList.filter(_ % 2 == 0)
        println("Filtered even numbers: " + outputList.mkString(", "))
    }

    def filterEvenNumbers(numbers: List[Int]): List[Int] = {
        numbers.filter(number => number % 2 == 0)
  }

}