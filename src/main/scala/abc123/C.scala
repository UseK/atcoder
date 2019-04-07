package abc123

object C {
  def solve(input: Array[String]) = {
    val N = input(0).toDouble
    val weights = input.drop(0).toList.map(_.toLong)
    val bottleNeck = weights.min
    val bottleNeckWeight = (N / bottleNeck).ceil.toLong
    4 + bottleNeckWeight
  }
}
