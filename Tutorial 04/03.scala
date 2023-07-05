import scala.io.StdIn

object UpperAndLower{
    def main(args: Array[String]):
    Unit={
        println(formatNames("Benny", toUpper))
        println(formatNames("Niroshan", toUpper))
        println(formatNames("Saman", toLower))
        println(formatNames("Kumara", toUpper))
    }

    def toUpper(str:String):String=str.toUpperCase()
    def toLower(str:String):String=str.toLowerCase()

    def formatNames(name: String, modifyFunction: String => String): String = {
        println("Enter the character position, you need to change in "+ name + " (seperate by spaces and First character = 1): ")
        val input = StdIn.readLine()
        val indexes = input.split(" ").map(_.toInt).toList
        updateAtIndexes(name, indexes, modifyFunction)
    }

    def updateAtIndexes(name: String, indexes: List[Int], modifyFunction: String => String): String = {
    indexes match {
        case Nil => name
        case index :: rest => {
        val updatedChar = modifyFunction(name.charAt(index-1).toString).charAt(0)
        val updatedName = name.updated(index-1, updatedChar)
        updateAtIndexes(updatedName, rest, modifyFunction)
        }
    }
}

}
