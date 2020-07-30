

object MyApp extends App {
  
var bank:List[Account]=List()
  
}

class Account(id:String,n: Int, b: Double) {
  val nic:String=id
  val acnumber: Int = n
  var balance: Double = b
  
  def withdraw(a:Double) =
  this.balance=this.balance-a
  
  def deposit(a:Double) =
  this.balance=this.balance+a
  
  def transfer(a:Account,b:Double)= 
  a.deposit(b);
  this.withdraw(b)
  
  override def toString =
   "["+nic+":"+acnumber +":"+ balance+"]"
}