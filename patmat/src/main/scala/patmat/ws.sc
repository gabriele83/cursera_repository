package patmat

import patmat.Huffman._
import scala.util.Random

object ws {
  decode(Huffman.frenchCode, Huffman.secret)      //> res0: List[Char] = List(h, u, f, f, m, a, n, e, s, t, c, o, o, l)
  decode(Huffman.frenchCode, encode(Huffman.frenchCode)("huffmanestcool".toList))
                                                  //> res1: List[Char] = List(h, u, f, f, m, a, n, e, s, t, c, o, o, l)
  decode(Huffman.frenchCode, quickEncode(Huffman.frenchCode)("huffmanestcool".toList))
                                                  //> res2: List[Char] = List(h, u, f, f, m, a, n, e, s, t, c, o, o, l)
  val ct2: CodeTree = createCodeTree(List.fill(10000000)(Random.nextPrintableChar))
                                                  //> ct2  : patmat.Huffman.CodeTree = Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(For
                                                  //| k(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork
                                                  //| (Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(
                                                  //| Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(F
                                                  //| ork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fo
                                                  //| rk(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(For
                                                  //| k(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Fork(Leaf(.,105431),Leaf(8,105486),List
                                                  //| (., 8),210917),Leaf(_,105516),List(., 8, _),316433),Leaf({,105611),List(., 8
                                                  //| , _, {),422044),Leaf(},105693),List(., 8, _, {, }),527737),Leaf(O,105780),Li
                                                  //| st(., 8, _, {, }, O),633517),Leaf(i,105788),List(., 8, _, {, }, O, i),739305
                                                  //| ),Leaf(w,105932),List(., 8, _, {, }, O, i, w),845237),Leaf(`,105960),List(.,
                                                  //|  8, _, {, }, O, i, w, `),951197),Leaf(t,105978),List(., 8, _, {, }, O, i, w,
                                                  //|  `, t),1057175),Leaf(z,1
                                                  //| Output exceeds cutoff limit.


  
}