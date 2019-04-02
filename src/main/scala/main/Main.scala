package main

import abc122.B

object Main {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines().toList
    println(B.solve(lines.head))
  }
}


