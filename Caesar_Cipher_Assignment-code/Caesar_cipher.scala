

object Caesar_cipher {
  
  def main(args : Array[String]){
  
	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
 
	val shift = (scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size) % alphabet.size

	val s = scala.io.StdIn.readLine("Enter the Message: ")	
	
	val E=(c:Char,key:Int,a:String)=>
a((a.indexOf(c.toUpper)+key)%a.size)

  val D=(c:Char,key:Int,a:String)=>
a((a.indexOf(c.toUpper)-key)%a.size)

	val cipher=(algo:(Char,Int,String)=>
Char,s:String,key:Int,a:String)=>
s.map(algo(_,key,a))

val ct=cipher(E,s,shift,alphabet)

val pt=cipher(D,ct,shift,alphabet)

	println("The encryption: ");
	println(ct);
	
	println("The decryption: ");
	println(pt);
	
  
  }
}