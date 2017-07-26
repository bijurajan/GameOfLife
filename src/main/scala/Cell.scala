package com.biju

class Cell(state: String, numberOfNeighbors: Int) {

  def nextGeneration(): String = {
    if(numberOfNeighbors < 2) return "DEAD"
    "ALIVE"
  }
}

