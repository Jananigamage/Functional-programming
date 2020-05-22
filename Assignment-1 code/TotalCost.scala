

object TotalCost {
  
    def main(args: Array[String]){
      
      def bookPrice(x:Int):Double = x*24.95
      
      def discount(amount:Double):Double = amount*40/100
      
      def shippingCost(x:Int):Double = if(x<=50) 3*x else 3*50 + (x-50)*0.75
      
      val cost= bookPrice(60) + shippingCost(60) - discount(bookPrice(60))
      
      print(cost)
      
    }

}