package main

import abc123.C

import scala.collection.mutable


object Main {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines().toArray
    println(C.solve(lines))
    val aiee = List(
      2
    )
  }
}


object D {
  def solve(input: Array[String]) = {
    val valuesLines = input.map(line => line.split(' ').map(_.toInt))
    val Array(x, y, z, k) = valuesLines(0)
  }

  def diffs(values: Array[Int], len: Int) = {
    val sorted = values.sorted.reverse
    sorted.map(v => v - sorted(0))
  }
}


class DiffsList(val aDiffs: Array[Int],
                val bDiffs: Array[Int],
                val cDiffs: Array[Int])


class GreedyTree(diffsList: DiffsList, x:Int, y: Int, z: Int) {
  val firstNode = new GreedyNode(0, 0, 0)
  var addedPatterns: Set[GreedyNode] = Set()
  val activeNodes: mutable.PriorityQueue[GreedyNode] = mutable.PriorityQueue(firstNode)(
    Ordering.by { n: GreedyNode => n.value})

  def nextList(k: Int): List[GreedyNode] = {
    (0 until k).map(_ => next()).toList
  }

  def next() = {
    val topNode = activeNodes.dequeue()
    topNode.children().foreach {node =>
      addedPatterns += node
      activeNodes.enqueue(node)
    }
    topNode
  }


  case class GreedyNode(aIdx: Int,
                        bIdx: Int,
                        cIdx: Int) {
    val value = diffsList.aDiffs(aIdx) + diffsList.bDiffs(bIdx) + diffsList.cDiffs(cIdx)

    def toStringWithValue(): String = {
      toString + s"value=${value}"
    }

    def children(): List[GreedyNode] = {
      List(
        GreedyNode.genInValid(aIdx+1, bIdx, cIdx),
        GreedyNode.genInValid(aIdx, bIdx+1, cIdx),
        GreedyNode.genInValid(aIdx, bIdx, cIdx+1)
      ).flatten
    }
  }

  object GreedyNode {
    def isValidToBirth(aIdx: Int, bIdx: Int, cIdx: Int): Boolean = {
      aIdx < x &&
        bIdx < y &&
        cIdx < z &&
        !addedPatterns.contains(GreedyNode(aIdx, bIdx, cIdx))
    }
    def genInValid(aIdx: Int, bIdx: Int, cIdx: Int): Option[GreedyNode] = {
      if (isValidToBirth(aIdx, bIdx, cIdx)) {
        Option(GreedyNode(aIdx, bIdx, cIdx))
      } else {
        None
      }
    }
  }


}



