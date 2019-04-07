package main

import abc123.C


object Main {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines().toArray
    println(C.solve(lines))
  }
}



