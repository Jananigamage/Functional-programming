//Question04: invert should switch the x and y coordinates.


object MyApp extends App {
  
 val p1= Point(4,10)
 val p2= p1.copy()
 
 
 println(p1 invert p2)

 
 
}

case class Point (a:Int, b:Int) {
  
  def x: Int = a
  def y: Int = b
  
  def invert(that: Point) = {
     this.y -> that.x
  }
  
}