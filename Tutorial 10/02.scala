object temperature{
    def main(args: Array[String]): Unit = {
        val words = getWordListInput()
        println(s"Total count of letter occurrences: ${countLetterOccurrences(words)}")
    }

    def getWordListInput(): List[String] = {
        println("Enter the words of the list separated by one space:")
        val input = scala.io.StdIn.readLine()
        val wordList = input.split(" ").toList
        wordList
    }


    def countLetterOccurrences(words: List[String]): Int = {
        val wordLengths = words.map(w => w.length)
        wordLengths.reduce((a, b) => a + b)
    }
}