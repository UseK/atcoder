package main

import abc122.D


object Main {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines().toArray
    println(D.solve(lines))
  }
}




