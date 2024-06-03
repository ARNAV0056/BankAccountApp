package arnav.bankaccountapp
fun main(){
 val ArnavBankAcc=Bank(accholder = "Arnav", balance =13000.00)
  val SarahBankAcc=Bank(accholder = "Sarah",balance = 0.00)
   println(" WELCOME!!! USER")
    println("Enter your name")
    val NAME= readln()
   println("Enter the password to continue ")
    val Password= readln().toInt()
    val Apassword=123
    val Spassword=456
    if(NAME=="Arnav"){
    if(Password==Apassword){
        println(" WELCOME!!! ${ArnavBankAcc.accholder}")
        ArnavBankAcc.deposit(60000.00)
        ArnavBankAcc.withdraw(1.00)
        ArnavBankAcc.displaytransactions()
        println("now ${ArnavBankAcc.accholder}'s account has a balance of ${ArnavBankAcc.ACCbalance()}")

    }
    else {
        println("PASSWORD IS WRONG TRY AGAIN")
    }
    }
    else if(NAME=="Sarah"){
    if (Password==Spassword){

        println("WELCOME!!! ${SarahBankAcc.accholder}")
   SarahBankAcc.deposit(100.50)
        SarahBankAcc.deposit(15000.95)
      SarahBankAcc.withdraw(2004.00)
   SarahBankAcc.displaytransactions()
   println("now ${SarahBankAcc.accholder}'s account has a balance of ${SarahBankAcc.ACCbalance()}")
  }

    else {
        println("PASSWORD IS WRONG TRY AGAIN")
    }}

}