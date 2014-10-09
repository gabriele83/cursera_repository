package funsets
import FunSets._

object ws {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(90); 
  println("Welcome to the Scala worksheet");$skip(51); 

  // set
  var s = Set(-1000, -1, 0, 1, 2, 1000);System.out.println("""s  : scala.collection.immutable.Set[Int] = """ + $show(s ));$skip(36); 
  var sC = Set(1, 3, 4, 5, 7, 1000);System.out.println("""sC  : scala.collection.immutable.Set[Int] = """ + $show(sC ));$skip(28); 
  var s14 = Set(1, 2, 3, 4);System.out.println("""s14  : scala.collection.immutable.Set[Int] = """ + $show(s14 ));$skip(28); 
  var s36 = Set(3, 4, 5, 6);System.out.println("""s36  : scala.collection.immutable.Set[Int] = """ + $show(s36 ));$skip(48); 

  // function
  def f_true = (x: Int) => true;System.out.println("""f_true: => Int => Boolean""");$skip(34); 
  def f_false = (x: Int) => false;System.out.println("""f_false: => Int => Boolean""");$skip(33); 
  def f_eq2 = (x: Int) => x == 2;System.out.println("""f_eq2: => Int => Boolean""");$skip(51); 
  def f_gt5_lt10 = (x: Int) => (x >= 5 && x <= 10);System.out.println("""f_gt5_lt10: => Int => Boolean""");$skip(38); 
  def f_even = (x: Int) => x % 2 == 0;System.out.println("""f_even: => Int => Boolean""");$skip(14); val res$0 = 
  
  f_eq2(3);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(11); val res$1 = 
  f_eq2(2);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(25); 

  printSet(f_gt5_lt10);$skip(41); 

  // union
  printSet(union(s14, s36));$skip(30); 
  printSet(union(s, f_false));$skip(30); 
  printSet(union(s36, f_eq2));$skip(35); 
  printSet(union(s14, f_gt5_lt10));$skip(50); 

  // intersect
  printSet(intersect(s, f_true));$skip(36); 
  printSet(intersect(s14, f_false));$skip(34); 
  printSet(intersect(s14, f_eq2));$skip(39); 
  printSet(intersect(s36, f_gt5_lt10));$skip(35); 
  printSet(intersect(s14, f_even));$skip(44); 

  // filter
  printSet(filter(s, f_true));$skip(33); 
  printSet(filter(s14, f_false));$skip(31); 
  printSet(filter(s14, f_eq2));$skip(36); 
  printSet(filter(s36, f_gt5_lt10));$skip(32); 
  printSet(filter(s14, f_even));$skip(43); 

  // diff
  printSet(diff(s14, f_false));$skip(29); 
  printSet(diff(s14, f_eq2));$skip(34); 
  printSet(diff(s36, f_gt5_lt10));$skip(34); val res$2 = 

  // forall
  forall(s, f_true);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(23); val res$3 = 
  forall(s14, f_false);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(21); val res$4 = 
  forall(s14, f_eq2);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(26); val res$5 = 
  forall(s36, f_gt5_lt10);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(22); val res$6 = 
  forall(s14, f_even);System.out.println("""res6: Boolean = """ + $show(res$6));$skip(34); val res$7 = 

  // exists
  exists(s, f_true);System.out.println("""res7: Boolean = """ + $show(res$7));$skip(23); val res$8 = 
  exists(s14, f_false);System.out.println("""res8: Boolean = """ + $show(res$8));$skip(21); val res$9 = 
  exists(s14, f_eq2);System.out.println("""res9: Boolean = """ + $show(res$9));$skip(26); val res$10 = 
  exists(s36, f_gt5_lt10);System.out.println("""res10: Boolean = """ + $show(res$10));$skip(22); val res$11 = 
  exists(s14, f_even);System.out.println("""res11: Boolean = """ + $show(res$11));$skip(33); val res$12 = 
  
util.Properties.versionString;System.out.println("""res12: String = """ + $show(res$12))}


}
