

object MyApp extends App {
  
  var bank:List[Account]=List()
  
  val find=(n:String,b:List[Account])=>
  b.filter(x=>x.nic.equals(n))
  
  //List of Accounts with negative balances (Question 4.1)
  val overdraft=(b:List[Account])=> b.filter(_<0)
  
  //Total of all account balances (Question 4.2)
  val balance=(b:List[Account])=> b.reduce(_+_)
  
  //If balance is positive deposit interest is .05
  //If balance is negative overdraft interest is .1 (Question 4.3)
  
  val b= some1(b+b*0.5)
  val b= some2(b-b*0.1)
  val interest=(b:List[Account])=>b.map(if (b>0) some1 else some2)
  val balance=(b:List[Account])=> b.reduce(_+_)
  
}