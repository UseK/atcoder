import main.Solver
import org.scalatest.FunSuite

class CTest extends  FunSuite {
  test("1") {
    val input =
      """|8 3
        |ACACTACG
        |3 7
        |2 3
        |1 8""".stripMargin.split("\n")
    assert(Solver.solve(input) == "2\n0\n3")
  }

  test("accumulate") {
    val result = Solver.accumulate("ACACTACG", 8)
    val expected = Array(0, 1, 1, 2, 2, 2, 3, 3)
    assert(result.toList == expected.toList)
  }
}
