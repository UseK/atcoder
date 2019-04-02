package abc122

object C {
  def solve(lines: Array[String]) = {
    val N = lines(0).split(' ')(0).toInt
    //println(N)
    val input = lines(1)
    val accmulated = accumulate(input, N)
    //println(accmulated.toList)
    lines.drop(2).map { line =>
      val splited = line.split(' ')
      val start = splited(0).toInt
      val end = splited(1).toInt
      accmulated(end-1) - accmulated(start-1)
    }.mkString("\n")
  }

  def accumulate(input: String, N: Int) = {
    var accumulated = new Array[Int](N)
    accumulated(0) = 0
    (1 to N-1).map {i=>
      val current = if (input.slice(i-1, i+1) == "AC") 1 else 0
      accumulated(i) = accumulated(i-1) + current
    }
    accumulated
  }
}
