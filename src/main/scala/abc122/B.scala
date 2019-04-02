package abc122

object B {
  val ACGT = Set('A', 'C', 'G', 'T')
  def solve(input: String): String = {
    var subCounter = 0
    var maxCache = 0
    for (s <- input) {
      if (ACGT.contains(s)) {
        subCounter += 1
      } else {
        maxCache = List(maxCache, subCounter).max
        subCounter = 0
      }
    }
    List(maxCache, subCounter).max.toString
  }
}
