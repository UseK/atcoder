import main.Solver
import org.scalatest.FunSuite

class CTest extends  FunSuite {
  test("debug") {
    assert(Solver.countAC("ACTAC") == 2)
    assert(Solver.countAC("ACACTACG") == 3)
  }

  test("1") {
    val input =
      """|8 3
        |ACACTACG
        |3 7
        |2 3
        |1 8""".stripMargin.split("\n")
    assert(Solver.solve(input) == "2\n0\n3")
  }

  test("cliceByLine") {
    assert(Solver.sliceByLine("ACACTACG", "3 7") == "ACTAC")
    assert(Solver.sliceByLine("ACACTACG", "2 3") == "CA")
    assert(Solver.sliceByLine("ACACTACG", "1 8") == "ACACTACG")
    assert(Solver.sliceByLine("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "10 20") == "A" * 11)
  }
}
