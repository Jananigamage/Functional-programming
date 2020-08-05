//Question02: move should move a point by a given distance dx and dy

object MyApp extends App {
  
 val p1= Point(2,3)
 
 
 val p3= p1.move(5,6)
 
 println(p3)
 
}

case class Point (a:Int, b:Int) {
  
  def x: Int = a
  def y: Int = b
  
  def move (dx: Int, dy:Int) = Point (this.x + dx , this.y + dy)
  
  
  
}