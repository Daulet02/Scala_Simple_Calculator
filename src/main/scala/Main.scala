import scala.io.StdIn.readLine
import scala.io.StdIn.readInt
import scala.io.StdIn.readFloat

import Calc.Calculus

object Main extends App {
  println("example: 5 [Enter] / [Enter] 2 [Enter] = 2.5")

  val x = readInt()
  val action = readLine()
  val y = readInt()

  val calc = new Calculus()

  if (action == "+")
    println("= " + calc.sum(x, y))
  else if (action == "-")
    println("= " + calc.minus(x, y))
  else if (action == "*")
    println("= " + calc.mult(x, y))
  else if (action == "/")
    println("= " + calc.div(x, y))
}

