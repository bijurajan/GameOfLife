package com.biju

import org.scalatest._

class CellSpec extends FunSpec with Matchers {

  describe("alive cells") {
     it("should die with zero neighbors"){
       val cell = new Cell("ALIVE", 0)

       cell.nextGeneration() shouldEqual "DEAD"
     }

     it("should die with one neighbor"){
       val cell = new Cell("ALIVE", 1)

       cell.nextGeneration() shouldEqual "DEAD"
     }

    it("should not die with two neighbors"){
      val cell = new Cell("ALIVE", 2)

      cell.nextGeneration() shouldEqual "ALIVE"
    }
  }
}