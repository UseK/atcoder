package main

object Main {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines().toArray
    println(Solver.solve(lines))
  }
}

object Solver {
  def solve(lines: Array[String]) = {
    val input = lines(1)
    val results = lines.drop(2).map { line =>
        val sliced = sliceByLine(input, line)
        countAC(sliced)
    }
    results.mkString("\n")
  }

  def sliceByLine(input: String, line: String) = {
    val splited = line.split(' ')
    val start = splited(0).toInt
    val end = splited(1).toInt
    input.slice(start-1, end)
  }

  def countAC(input: String) = {
    input.sliding(2).count(_ == "AC")
  }
}
