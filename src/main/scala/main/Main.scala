package main

object Main {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines().toList
    println(solve(lines.head))
  }
  /**
    * """
    * 問題文
    * AtCoder 星には四種類の塩基 A, C, G, T が存在し、A と T、C と G がそれぞれ対になります。
    * 文字 b が入力されます。これは A, C, G, T のいずれかです。塩基
    * b と対になる塩基を表す文字を出力するプログラムを書いてください。
    * 制約 b は文字 A, C, G, T のいずれかである。
    *
    * @param src
    * @return
    */
  def solve(src: String) = {
    val helixPairs = Map(
      "A" -> "T",
      "T" -> "A",
      "C" -> "G",
      "G" -> "C"
    )
    helixPairs(src)
  }
}
