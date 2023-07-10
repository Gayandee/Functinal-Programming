import scala.io.StdIn.readInt

object evenOrOdd{
    def main(args:Array[String]):
    Unit={
        println("Enter a number: ")
        var num = readInt()
        println(evenOrOdd(num))
    }
    
    def evenOrOdd(n:Int):String={
        if(n==0) "Even"
        else if(n==1) "Odd"
        else evenOrOdd(n-2)
    }
}