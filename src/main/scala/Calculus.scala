package Calc

class Calculus {
  def sum(x: Int, y: Int): Float = x + y

  def minus(x: Int, y: Int): Float = x - y

  def mult(x: Int, y: Int): Float = x * y

  def div(x: Int, y: Int): AnyVal = {
    if (y != 0) x.toFloat / y.toFloat
    else println("Wrong function")
  }
}
