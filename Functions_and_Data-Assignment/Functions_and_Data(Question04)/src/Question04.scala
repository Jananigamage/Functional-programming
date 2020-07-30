
object MyApp extends App {
  
var bank:List[Account]=List()
  
}

  class Account(id:String,no: Int, bal: Double) {
    val nic:String=id
    val accountNo: Int = no
    var balance: Double = bal
    override def toString = "["+nic+":"+accountNo +":"+ balance+"]"
    def transfer(account: Account,amount:Double) = {
      this.balance-=amount
      account.balance+=amount
    }

  }
  var bank:List[Account]=List()
  
  val overdraft = (b:List[Account])=> b.filter(p=> p.balance<0)
  println(overdraft(bank))
  
  val total = (b:List[Account])=> b.reduce((x,y)=> (new Account(x.nic,x.accountNo,x.balance+y.balance)))
  println(total(bank).balance)
  
  val interest = (b: List[Account])=> b.map(x=> {
    if(x.balance<0)  (new Account(x.nic,x.accountNo,x.balance*1.05)) else (new Account(x.nic,x.accountNo,x.balance*1.1))})
  println(interest(bank))



}
