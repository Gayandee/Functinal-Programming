class Account{
    var balance: Int = 0
    def deposit(x: Int): Unit = {
        balance += x
    }
    def withdraw(x: Int): Unit = {
        balance -= x
    }
    def transfer(x: Int, y: Account): Unit = {
        withdraw(x)
        y.deposit(x)
    }
}

object Main{
    def main(args: Array[String]){
        var a = new Account()
        var b = new Account()
        a.deposit(100)
        a.withdraw(50)
        a.transfer(25, b)
        println("a.balance = " + a.balance)
        println("b.balance = " + b.balance)
    }
}