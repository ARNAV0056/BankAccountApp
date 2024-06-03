package arnav.bankaccountapp
/*Account holder ,transactions,balances,message*/
class  Bank(var accholder:String, var balance: Double){
    private val transactionhistory= mutableListOf<String>()//private class can not be used outside the main class file
    fun deposit(amount:Double){
        balance+=amount
        transactionhistory.add("$accholder deposited $$amount")

    }
    fun withdraw(amount: Double){
        if(balance<=amount){
        balance-=amount
            println("do not have suffiecient balance") }
        else{
            transactionhistory.add("$accholder withdrew $$amount")}
    }
    fun displaytransactions(){
        println("transaction history of $accholder")
        for(transaction in transactionhistory){
            println(transaction)
        }



    }
    fun ACCbalance():Double{
        return(balance)

    }
}