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

  test("mod") {
    println(D.modulus)
  }

  test("solve(3)") {
    val input = Array("3")
    assert(D.solve(input) == 61)
  }

  test("solve(4)") {
    val input = Array("4")
    assert(D.solve(input) == 230)
  }

  test("solve(100)") {
    val input = Array("100")
    assert(D.solve(input) == 388130742)
  }
}
