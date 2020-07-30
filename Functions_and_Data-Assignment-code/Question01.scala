

object MyApp extends App {
  
  var x= new Rational(2,3)
  println(x.neg)
  
}

class Rational(n:Int,d:Int){
  
  def numer=n
  def denom=d
  
  def neg=new Rational(-this.numer,this.denom)
  
  override def toString = numer +"/"+denom
  
}