package main

import abc122.C

object Main {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines().toArray
    println(D.solve(lines))
  }
}

object D {
  def solve(input: Array[String]) = {

  }

  def isOK(last4: String) = {
    unContainsAGC(last4) &&
      unContainsAGC(swapAdjacent(last4, 0)) &&
      unContainsAGC(swapAdjacent(last4, 1)) &&
      unContainsAGC(swapAdjacent(last4, 2))
  }

  def unContainsAGC(s: String) = {
    !s.contains("AGC")
  }

  def swapAdjacent(last4: String, idx: Int) = {
    val sArray = last4.toArray
    val tmp = sArray(idx)
    sArray.update(idx, sArray(idx+1))
    sArray.update(idx+1, tmp)
    sArray.mkString("")
  }
}


