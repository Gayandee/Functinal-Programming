object temperature {
    def main(args: Array[String]): Unit = {
        val temperatures = getTempListInput()
        println ("Average Fahrenheit temperature: "+ calculateAverage(temperatures))
    }

    def getTempListInput(): List[Int] = {
        println("Enter the temperatures of the list separated by one space:")
        val input = scala.io.StdIn.readLine()
        val tempList = input.split(" ").map(_.toInt).toList
        tempList
    }

    def calculateAverage(temperatures: List[Int]): Double = {
        val fahrenheitTemperatures = temperatures.map(t => (t * 9 / 5) + 32)
        val sum = fahrenheitTemperatures.reduce((a, b) => a + b)
        sum / fahrenheitTemperatures.length
    }
}