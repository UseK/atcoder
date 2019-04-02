import abc122.B
import org.scalatest.FunSuite

class BTest extends FunSuite {
  def compare(input: String, output: String): Unit = {
    assert(B.solve(input) == output)
  }

  test("debug") {
    print(B.solve("HATAGAYA"))
  }

  test("1") {
    compare("ATCODER", "3")
  }

  test("2") {
    compare("HATAGAYA", "5")
  }

  test("ZZZ") {
    compare("HATAGAYAZZZZZZZ", "5")
  }

  test("3") {
    compare("SHINJUKU", "0")
  }

  test("last") {
    compare("SHINJUKUA", "1")
  }
}
