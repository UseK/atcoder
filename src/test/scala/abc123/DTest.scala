package abc123

import main.{D, DiffsList, GreedyTree}
import org.scalatest.FunSuite

class DTest extends FunSuite{
  test("debug") {
    D.solve("2 2 2 8\n4 6\n1 5\n3 8".split('\n'))
  }
  test("diffs") {
    assert(D.diffs(Array(200, 20, 2), 3).toList == Array(0, -180, -198).toList)
  }
  test("GreedyTree") {
    val dTree = new GreedyTree(new DiffsList(
      Array(0, -90, -99),
      Array(0, -180, -198),
      Array(0, -90, -99)
    ), 3, 3, 3)
    assert(dTree.firstNode.value == 0)
    assert(dTree.firstNode.children().map(_.value) == List(-90, -180, -90))
    val results = dTree.nextList(10)
    results.map(_.toStringWithValue()).foreach(println)
    results.map(400 + _.value).foreach(println)
  }
}
