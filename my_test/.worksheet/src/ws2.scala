object ws2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(56); 
  def abs(x: Double) = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(131); 

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x);System.out.println("""sqrtIter: (guess: Double, x: Double)Double""");$skip(88); 

  def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x) / x < 0.001;System.out.println("""isGoodEnough: (guess: Double, x: Double)Boolean""");$skip(72); 

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2;System.out.println("""improve: (guess: Double, x: Double)Double""");$skip(43); 

  def sqrt(x: Double) = sqrtIter(1.0, x);System.out.println("""sqrt: (x: Double)Double""");$skip(358); 

  def sqrt1(x: Double) = {
    def sqrtIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess, x), x)

    def isGoodEnough(guess: Double, x: Double) =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double, x: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0, x)
  };System.out.println("""sqrt1: (x: Double)Double""");$skip(321); 

  
  def sqrt2(x: Double) = {

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0)

  };System.out.println("""sqrt2: (x: Double)Double""");$skip(12); val res$0 = 

  sqrt(2);System.out.println("""res0: Double = """ + $show(res$0));$skip(10); val res$1 = 
  sqrt(4);System.out.println("""res1: Double = """ + $show(res$1));$skip(13); val res$2 = 
  sqrt(1e-6);System.out.println("""res2: Double = """ + $show(res$2));$skip(14); val res$3 = 
  sqrt(1e+60);System.out.println("""res3: Double = """ + $show(res$3));$skip(13); val res$4 = 

  sqrt1(2);System.out.println("""res4: Double = """ + $show(res$4));$skip(11); val res$5 = 
  sqrt1(4);System.out.println("""res5: Double = """ + $show(res$5));$skip(14); val res$6 = 
  sqrt1(1e-6);System.out.println("""res6: Double = """ + $show(res$6));$skip(15); val res$7 = 
  sqrt1(1e+60);System.out.println("""res7: Double = """ + $show(res$7));$skip(13); val res$8 = 

  sqrt2(2);System.out.println("""res8: Double = """ + $show(res$8));$skip(11); val res$9 = 
  sqrt2(4);System.out.println("""res9: Double = """ + $show(res$9));$skip(14); val res$10 = 
  sqrt2(1e-6);System.out.println("""res10: Double = """ + $show(res$10));$skip(15); val res$11 = 
  sqrt2(1e+60);System.out.println("""res11: Double = """ + $show(res$11))}

}
