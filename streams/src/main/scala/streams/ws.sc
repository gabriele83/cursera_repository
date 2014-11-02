package streams
import streams._

object ws {

  case class Pos(x: Int, y: Int) {
    /** The position obtained by changing the `x` coordinate by `d` */
    def dx(d: Int) = copy(x = x + d)

    /** The position obtained by changing the `y` coordinate by `d` */
    def dy(d: Int) = copy(y = y + d)
  }


  val v = Vector(Vector('S', 'T'), Vector('o', 'o'), Vector('o', 'o'))
                                                  //> v  : scala.collection.immutable.Vector[scala.collection.immutable.Vector[Cha
                                                  //| r]] = Vector(Vector(S, T), Vector(o, o), Vector(o, o))
  
   val ys = v map ( _ indexOf 'o')                //> ys  : scala.collection.immutable.Vector[Int] = Vector(-1, 0, 0)
   val x = ys indexWhere (_ >= 0)                 //> x  : Int = 1
   
   
   (for{
      row <- v
    } yield row.indexOf('o')) indexWhere (_ >= 0) //> res0: Int = 1

}