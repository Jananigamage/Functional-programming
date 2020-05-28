

object Question_05 {
  
  def main(args: Array[String]){
  
    def isEven(n:Int):Boolean= n match{
     
     case n if(n==0) => true
     case n if(n==1) => false
     case _=> isEven(n-2)
     
     
   }
    
    def sumForEven(a:Int):Int = a match{
      
      case a if (a!=0) => a + sumForEven(a-2)
      
      case a if (a==0) => a 
      
    }
    
    def sumForOdd(a:Int):Int = a match{
      
      case a if (a!=0) => a + sumForOdd(a-2)
      
      case a if (a==0) => a 
      
    }
    
    def sum(k:Int):Int = if (isEven(k)==true) sumForEven(k-2) else sumForOdd(k-1)
    
    print(sum(7))
    
  }
}