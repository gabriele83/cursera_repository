package my_test.pm

trait Expr {
  def eval: Int = this match {
    case Number(n) => n
    case Sum(e1, e2) => e1.eval + e2.eval
  }

  def show: String = this match {
    case Number(n) => n.toString
    case Sum(e1, e2) => "(" + e1.show + "+" + e2.show + ")"
  }

}

case class Number(n: Int) extends Expr
case class Sum(e1: Expr, e2: Expr) extends Expr

// definito implicitamente x tutte e due le case class
//object Number{
//  def apply(n : Int) = new Number(n)
//}