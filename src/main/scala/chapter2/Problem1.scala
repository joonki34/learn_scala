package chapter2

object Problem1 {
  def fib(total: Int): Int = {
    @annotation.tailrec
    def go(n: Int, first:Int, second:Int): Int = {
      if(n == total) first
      else go(n+1, second, first + second)
    }
    go(1, 0, 1)
  }
  def main(args: Array[String]): Unit = {
    println(fib(1))
    println(fib(2))
    println(fib(3))
    println(fib(4))
    println(fib(5))
    println(fib(6))
    println(fib(7))
    println(fib(8))
  }
}
