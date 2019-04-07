package abc123

import org.scalatest.FunSuite

class CTest extends FunSuite {
  test("solve1") {
    assert(C.solve("5\n3\n2\n4\n3\n5".split("\n".toArray)) == 7)
  }
  test("solve2") {
    assert(C.solve("10\n123\n123\n123\n123\n123".split("\n".toArray)) == 5)
  }
  test("solve3") {
    assert(C.solve("10000000007\n2\n3\n5\n7\n11".split("\n".toArray)) == 5000000008L)
  }
}
