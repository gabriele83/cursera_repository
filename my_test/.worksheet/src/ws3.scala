object ws3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(58); 

  def abs(x: Double) = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(359); 

  def sqrt1(x: Double) = {
    def sqrtIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess, x), x)

    def isGoodEnough(guess: Double, x: Double) =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double, x: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0, x)
  };System.out.println("""sqrt1: (x: Double)Double""");$skip(318); 

  def sqrt2(x: Double) = {

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0)

  };System.out.println("""sqrt2: (x: Double)Double""");$skip(11); val res$0 = 
  sqrt1(2);System.out.println("""res0: Double = """ + $show(res$0));$skip(11); val res$1 = 
  sqrt1(4);System.out.println("""res1: Double = """ + $show(res$1));$skip(14); val res$2 = 
  sqrt1(1e-6);System.out.println("""res2: Double = """ + $show(res$2));$skip(15); val res$3 = 
  sqrt1(1e+60);System.out.println("""res3: Double = """ + $show(res$3));$skip(13); val res$4 = 

  sqrt2(2);System.out.println("""res4: Double = """ + $show(res$4));$skip(11); val res$5 = 
  sqrt2(4);System.out.println("""res5: Double = """ + $show(res$5));$skip(14); val res$6 = 
  sqrt2(1e-6);System.out.println("""res6: Double = """ + $show(res$6));$skip(15); val res$7 = 
  sqrt2(1e+60);System.out.println("""res7: Double = """ + $show(res$7))}
}
