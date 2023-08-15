object UpperAndLower {
    def main(args: Array[String]): Unit = {
        println(formatNames("Benny", str => str.toUpperCase))
        println(formatNames("Niroshan", str => str.toUpperCase))
        println(formatNames("Saman", str => str.toLowerCase))
        println(formatNames("Kumara", str => str.toUpperCase))
    }

    val toUpper: String => String = _.toUpperCase
    val toLower: String => String = _.toLowerCase

    val formatNames: (String, String => String) => String = (name, modifyFunction) => {
        println(s"Enter the character position, you need to change in $name (separate by spaces and First character = 1): ")
        val input = scala.io.StdIn.readLine()
        val indexes = input.split(" ").map(_.toInt).toList
        updateAtIndexes(name, indexes, modifyFunction)
    }


    val updateAtIndexes: (String, List[Int], String => String) => String = (name, indexes, modifyFunction) => {
        indexes match {
            case Nil => name
            case index :: rest => {
                val updatedChar = modifyFunction(name.charAt(index - 1).toString).charAt(0)
                val updatedName = name.updated(index - 1, updatedChar)
                updateAtIndexes(updatedName, rest, modifyFunction)
            }
        }
    }
}
