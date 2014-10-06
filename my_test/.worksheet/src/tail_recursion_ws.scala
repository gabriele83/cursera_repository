object tail_recursion_ws {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(107); 
  def factorial(n: Int): Int = {
    if (n == 0) 1 else n * factorial(n - 1)
  };System.out.println("""factorial: (n: Int)Int""");$skip(18); val res$0 = 

  factorial(10);System.out.println("""res0: Int = """ + $show(res$0));$skip(150); 

  def factorialTL(n: Int): Int = {
    def loop(acc: Int, n: Int): Int = {
      if (n == 0) acc else loop(acc * n, n - 1)
    }
    loop(1, n)
  };System.out.println("""factorialTL: (n: Int)Int""");$skip(22); val res$1 = 
  
   factorialTL(30);System.out.println("""res1: Int = """ + $show(res$1))}
}
