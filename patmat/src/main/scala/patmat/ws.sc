package patmat

import patmat.Huffman._

object ws {

  val sampleTree = makeCodeTree(makeCodeTree(Leaf('x', 1), Leaf('e', 1)), Leaf('t', 2))
                                                  //> sampleTree  : patmat.Huffman.Fork = Fork(Fork(Leaf(x,1),Leaf(e,1),List(x, e)
                                                  //| ,2),Leaf(t,2),List(x, e, t),4)
  weight(sampleTree)                              //> res0: Int = 4
  chars(sampleTree)                               //> res1: List[Char] = List(x, e, t)
  val ct: CodeTree = createCodeTree("casa".toList)//> ct  : patmat.Huffman.CodeTree = Fork(Fork(Leaf(c,1),Leaf(s,1),List(c, s),2),
                                                  //| Leaf(a,2),List(c, s, a),4)
  val bar: List[Bit] = List(0, 0, 1, 0, 1, 1)     //> bar  : List[patmat.Huffman.Bit] = List(0, 0, 1, 0, 1, 1)
  decode(ct, bar)                                 //> res2: List[Char] = List(c, a, s, a)
  encode(ct)("casa".toList)                       //> res3: List[patmat.Huffman.Bit] = List(0, 0, 1, 0, 1, 1)

  decode(Huffman.frenchCode, Huffman.secret)      //> res4: List[Char] = List(h, u, f, f, m, a, n, e, s, t, c, o, o, l)
  decode(Huffman.frenchCode, encode(Huffman.frenchCode)("huffmanestcool".toList))
                                                  //> res5: List[Char] = List(h, u, f, f, m, a, n, e, s, t, c, o, o, l)

  decode(Huffman.frenchCode, quickEncode(Huffman.frenchCode)("huffmanestcool".toList))
                                                  //> res6: List[Char] = List(h, u, f, f, m, a, n, e, s, t, c, o, o, l)

}