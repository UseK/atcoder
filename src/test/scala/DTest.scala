import main.D
import org.scalatest.FunSuite
class DTest extends FunSuite {
  test("debug") {
    assert(!D.isOK("AGCX"))
    assert(!D.isOK("AGXC"))
  }

  test("swapAdjacent") {
    assert(D.swapAdjacent("ABCD", 0) == "BACD")
    assert(D.swapAdjacent("ABCD", 1) == "ACBD")
    assert(D.swapAdjacent("ABCD", 2) == "ABDC")
  }
}
