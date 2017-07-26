package com.biju

import org.scalatest._

class CellSpec extends FunSpec {

  describe("alive cells") {
     it("should die with zero neighbors"){
       val cell = new Cell("ALIVE", 0)

       assert(cell.nextGeneration() == "DEAD")
     }

     it("should die with one neighbor"){
       val cell = new Cell("ALIVE", 1)

       assert(cell.nextGeneration() == "DEAD")
     }

    it("should not die with two neighbors"){
      val cell = new Cell("ALIVE", 2)

      assert(cell.nextGeneration() == "ALIVE")
    }
  }
}