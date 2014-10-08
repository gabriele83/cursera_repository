package my_test

object ws_rational {

  val x = new Rational(1, 3)                      //> x  : my_test.Rational = 1/3
  val y = new Rational(5, 7)                      //> y  : my_test.Rational = 5/7
  val z = new Rational(3, 2)                      //> z  : my_test.Rational = 3/2
  x - y - z                                       //> res0: my_test.Rational = -79/42
  y + y                                           //> res1: my_test.Rational = 10/7
  x < y                                           //> res2: Boolean = true
  x max y                                         //> res3: my_test.Rational = 5/7

  // val strange = new Rational(1, 0)
  val r1 = new Rational(2)                        //> r1  : my_test.Rational = 2/1

}

class Rational(x: Int, y: Int) {

  // secondo costruttore
  def this(x: Int) = this(x, 1)
  // require fa un test prima che l aclasse venga inizializzata
  require(y != 0, "denominator must me non zero")

  def numer = x
  def denom = y

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def + (r: Rational): Rational = new Rational(numer * r.denom + r.numer * denom, denom * r.denom)
  def unary_- : Rational = new Rational(-numer, denom)
  def - (r: Rational): Rational = this + -r
  def < (r: Rational): Boolean = numer * r.denom < denom * r.numer
  def max(r: Rational): Rational = if (this < r) r else this

  override def toString = {
    val g = gcd(numer, denom)
    numer / g + "/" + denom / g
  }

}