object Interest{
    def main(args: Array[String]):
    Unit={ 
        println("Interest for 10000: "+interest(10000))
        println("Interest for 100000: "+interest(100000))
        println("Interest for 1000000: "+interest(1000000))
        println("Interest for 10000000: "+interest(10000000))
    }

    def interest(deposit:Double): Double = deposit match{
        case deposit if(deposit<=20000)=>deposit*0.02
        case deposit if(deposit<=200000)=>deposit*0.04
        case deposit if(deposit<=2000000)=>deposit*0.035
        case _=>deposit*0.065


  }
}
