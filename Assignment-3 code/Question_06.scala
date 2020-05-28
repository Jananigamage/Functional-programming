

object Question_06 {
  
   def main(args: Array[String]){
  
     def fibonacci(n:Int):Int= n match{
       
       case n if n==0 => 0
       case n if n==1 => 1
       case n => fibonacci(n-1) + fibonacci(n-2)
       
       
     }
  
     def fibonacciSeq(n:Int):Any= { 
       if (n > 0)  fibonacciSeq(n-1) 
       println(fibonacci(n)) 
       } 
     
    fibonacciSeq(10)
     
   }
}