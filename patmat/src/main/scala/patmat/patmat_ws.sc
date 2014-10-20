package patmat
import patmat.Huffman._

object patmat_ws {

  val sampleTree = makeCodeTree(makeCodeTree(Leaf('x', 1), Leaf('e', 1)), Leaf('t', 2))
                                                  //> sampleTree  : patmat.Huffman.Fork = Fork(Fork(Leaf(x,1),Leaf(e,1),List(x, e)
                                                  //| ,2),Leaf(t,2),List(x, e, t),4)
 weight(sampleTree)                               //> res0: Int = 4
 chars(sampleTree)                                //> res1: List[Char] = List(x, e, t)

}