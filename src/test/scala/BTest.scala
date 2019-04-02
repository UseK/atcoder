import main.Solver
import org.scalatest.FunSuite

class BTest extends FunSuite {
  def compare(input: String, output: String): Unit = {
    assert(Solver.solve(input) == output)
  }

  test("debug") {
    print(Solver.solve("HATAGAYA"))
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
