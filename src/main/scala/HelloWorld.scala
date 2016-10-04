/**
  * Created by ganeshchand on 10/4/16.
  */
object HelloWorld {
  def sayHello(x: Any) = x match {
    case arr: Array[String] if arr.length > 0 => s"Hello, ${arr(0)}!"
    case str: String => s"Hello, ${str}!"
    case _ => s"Hello, World!"
  }
  def main(args: Array[String]): Unit = {
    println(sayHello(args))
  }
}
