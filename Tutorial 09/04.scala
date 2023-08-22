class Account(val accountId: Int, var balance: Double)

class Bank(val accounts: List[Account]) {
    def getAccountsWithNegativeBalances: List[Account] = {
        accounts.filter(_.balance < 0)
    }
    
    def calculateTotalBalance: Double = {
        accounts.map(_.balance).sum
    }
    
    def applyInterest(): Unit = {
        for (account <- accounts) {
        if (account.balance > 0) {
            account.balance += account.balance * 0.05
        } else {
            account.balance += account.balance * 0.1
        }
        }
    }
    }

object Main {
    def main(args: Array[String]): Unit = {
        val accounts = List(new Account(1, 100.0), new Account(2, -50.0), new Account(3, 0.0))
        val bank = new Bank(accounts)

        println("Accounts with negative balances:")
        val accountsWithNegativeBalances = bank.getAccountsWithNegativeBalances
        accountsWithNegativeBalances.foreach(account => println(s"Account: ${account.accountId}, : Balance: ${account.balance}"))
        
        println("\nTotal balance: " + bank.calculateTotalBalance)
        bank.applyInterest()
        println("\nBalances after applying interest:")
        bank.accounts.foreach(account => println(s"Account ${account.accountId}: ${account.balance}"))    }
}
