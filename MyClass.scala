```scala
class MyClass[T](val value: T) {
  def myMethod(x: T)(implicit ev: Ordering[T]): T = {
    if (ev.compare(x, value) > 0) x
    else value
  }
}

object Main extends App {
  implicit val intOrdering = Ordering.Int
  val myIntInstance = new MyClass(5)
  println(myIntInstance.myMethod(10))  // Output: 10

  // This will not compile because there is no implicit Ordering[String] in scope.
  //val myStringInstance = new MyClass("hello")
  //println(myStringInstance.myMethod("world"))
}
```