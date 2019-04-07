package abc122

object D {
  val ACGT = List('A', 'C', 'G', 'T')
  val modulus = 1000 * 1000 * 1000 + 7


  def solve(input: Array[String]) = {
    var memo = initMemo()
    val N = input(0).toInt
    (3 to N).foreach { n =>
      memo  = memo ++ Array(forward(memo(n-1)))
    }
    memo(N).values.reduce { (src, dst) =>
      (src + dst) % modulus
    }
  }

  def initMemo() = {
    var memo: Array[Map[String, Int]] = Array(Map.empty, Map.empty, Map.empty)
    memo(2) = ACGT.flatMap { c1 =>
      ACGT.map { c2 =>
        f"$c1$c2" -> 1
      }
    }.toMap
    memo
  }


  def forward(currentMemo: Map[String, Int]) = {
    var nextMemo = Map[String, Int]().withDefaultValue(0)
    currentMemo.keys.foreach { last =>
      ACGT.foreach { c =>
        if (isOK(last + c)) {
          val nextLast = last.takeRight(2) + c
          val added = (nextMemo(nextLast) + currentMemo(last)) % modulus
          val newItem = (nextLast) -> added
          nextMemo += newItem
        } else {
          //println(s"out!${last + c}")
        }
      }
    }
    nextMemo
  }

  def isOK(last: String) = {
    unContainsAGC(last) &&
      (0 until last.length-1).forall { i =>
        unContainsAGC(swapAdjacent(last, i))
      }
  }

  def unContainsAGC(s: String) = {
    !s.contains("AGC")
  }

  def swapAdjacent(last: String, idx: Int) = {
    val sArray = last.toArray
    val tmp = sArray(idx)
    sArray.update(idx, sArray(idx+1))
    sArray.update(idx+1, tmp)
    sArray.mkString("")
  }
}
