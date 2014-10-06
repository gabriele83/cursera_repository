object tail_recursion_ws {
  def factorial(n: Int): Int = {
    if (n == 0) 1 else n * factorial(n - 1)
  }                                               //> factorial: (n: Int)Int

  factorial(10)                                   //> res0: Int = 3628800

  def factorialTL(n: Int): Int = {
    def loop(acc: Int, n: Int): Int = {
      if (n == 0) acc else loop(acc * n, n - 1)
    }
    loop(1, n)
  }                                               //> factorialTL: (n: Int)Int
  
   factorialTL(30)                                //> res1: Int = 1409286144
}