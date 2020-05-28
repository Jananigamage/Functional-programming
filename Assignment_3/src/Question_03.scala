

object Question_03 {
  
  def main(args: Array[String]){
    
    
    def sum(a:Int):Int = if(a==1) 1 else a + sum(a-1)

      
    print(sum(5))
    
  }   
}