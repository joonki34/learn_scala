package chapter2

object Problem2 {
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop(n: Int): Boolean = {
      if(as.length - 1 == n) true
      else if(!ordered(as(n), as(n+1))) false
      else loop(n+1)
    }

    loop(0)
  }

  def main(args: Array[String]): Unit = {
    println(isSorted(Array(1, 2, 3), (x: Int, y: Int) => x < y)) // true
    println(isSorted(Array(1, 2, 3, 4, 5), (x: Int, y: Int) => x < y)) // true
    println(isSorted(Array(1, 2, 3), (x: Int, y: Int) => x > y)) // false
    println(isSorted(Array("a", "c", "b"), (x: String, y: String) => x < y)) // false
    println(isSorted(Array(1, 3, 2, 4, 5), (x: Int, y: Int) => x < y)) // false
    println(isSorted(Array(5, 4, 3, 2, 1), (x: Int, y: Int) => x < y)) // false
    println(isSorted(Array(5, 4, 3, 2, 1), (x: Int, y: Int) => x > y)) // true
  }
}
