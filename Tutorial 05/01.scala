object Prime{
    def main(args: Array[String]):
    Unit={
        println(prime(5))
        println(prime(8))
    }

    def prime(n: Int): Boolean = {
        if (n <= 1)
            false
        else if (n == 2)
            true
        else
            !(2 to (n-1)).exists(x => n % x == 0)
    }
}