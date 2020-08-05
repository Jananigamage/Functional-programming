//Question03: distance should return the distance between two given points

import math.{ sqrt, pow }

object MyApp extends App {
  
 val p1= Point(3,4)
 val p2= Point(7,7)
 
 
 println(p1 distance p2)
 
 
}

case class Point (a:Int, b:Int) {
  
  def x: Int = a
  def y: Int = b
  
   def distance(that: Point): Double = {
    sqrt(pow(this.x - that.x,2) + pow(this.y - that.y,2)) 
  }
  
  
  
}