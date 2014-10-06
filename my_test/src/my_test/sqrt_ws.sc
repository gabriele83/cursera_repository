object ws2 {
  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x: Double)Double

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)           //> sqrtIter: (guess: Double, x: Double)Double

  def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x) / x < 0.001            //> isGoodEnough: (guess: Double, x: Double)Boolean

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2                       //> improve: (guess: Double, x: Double)Double

  def sqrt(x: Double) = sqrtIter(1.0, x)          //> sqrt: (x: Double)Double

  def sqrt1(x: Double) = {
    def sqrtIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess, x), x)

    def isGoodEnough(guess: Double, x: Double) =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double, x: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0, x)
  }                                               //> sqrt1: (x: Double)Double

  
  def sqrt2(x: Double) = {

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0)

  }                                               //> sqrt2: (x: Double)Double

  sqrt(2)                                         //> res0: Double = 1.4142156862745097
  sqrt(4)                                         //> res1: Double = 2.000609756097561
  sqrt(1e-6)                                      //> res2: Double = 0.0010000001533016628
  sqrt(1e+60)                                     //> res3: Double = 1.0000788456669446E30

  sqrt1(2)                                        //> res4: Double = 1.4142156862745097
  sqrt1(4)                                        //> res5: Double = 2.000609756097561
  sqrt1(1e-6)                                     //> res6: Double = 0.0010000001533016628
  sqrt1(1e+60)                                    //> res7: Double = 1.0000788456669446E30

  sqrt2(2)                                        //> res8: Double = 1.4142156862745097
  sqrt2(4)                                        //> res9: Double = 2.000609756097561
  sqrt2(1e-6)                                     //> res10: Double = 0.0010000001533016628
  sqrt2(1e+60)                                    //> res11: Double = 1.0000788456669446E30

}