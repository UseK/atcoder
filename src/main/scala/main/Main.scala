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
    val results = lines.drop(2).map(line => line.split(" ")).map {t =>
      val sliced = input.slice(t(0).toInt-1, t(1).toInt)
      countAC(sliced)
    }
    results.map(_.toString).mkString("\n")
  }

  def countAC(input: String) = {
    input.sliding(2).count(_ == "AC")
  }
}

