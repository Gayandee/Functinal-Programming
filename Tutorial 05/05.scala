import scala.io.StdIn.readInt

object EvenSum{
    def main(args:Array[String]):Unit={
        println("Enter a number: ")
        var num = readInt()
        println(evenSum(num))
    }
    
    def evenSum(n:Int):Int={
        if(n==0) 0
        else if(n%2==0) n+evenSum(n-1)
        else evenSum(n-1)
    }
}