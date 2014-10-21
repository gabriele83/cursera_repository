package patmat

import patmat.Huffman._

object ws {

  val sampleTree = makeCodeTree(makeCodeTree(Leaf('x', 1), Leaf('e', 1)), Leaf('t', 2))
                                                  //> sampleTree  : patmat.Huffman.Fork = Fork(Fork(Leaf(x,1),Leaf(e,1),List(x, e)
                                                  //| ,2),Leaf(t,2),List(x, e, t),4)
  weight(sampleTree)                              //> res0: Int = 4
  chars(sampleTree)                               //> res1: List[Char] = List(x, e, t)
  val ct: CodeTree = createCodeTree("abc".toList) //> ct  : patmat.Huffman.CodeTree = Fork(Fork(Leaf(c,1),Leaf(a,1),List(c, a),2),
                                                  //| Leaf(b,1),List(c, a, b),3)
  val bar: List[Bit] = List(0, 1, 1, 1, 0, 0, 0, 1, 0, 1)
                                                  //> bar  : List[patmat.Huffman.Bit] = List(0, 1, 1, 1, 0, 0, 0, 1, 0, 1)

  decode(ct, bar)                                 //> res2: List[Char] = List(a, b, c, a)

}