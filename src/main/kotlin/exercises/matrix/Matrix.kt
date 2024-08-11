package exercises.matrix

class Matrix {

  // --- Directions
  // Write a function that accepts an integer N
  // and returns a NxN spiral matrix.
  // --- Examples
  //   matrix(2)
  //     [[1, 2],
  //     [4, 3]]
  //   matrix(3)
  //     [[1, 2, 3],
  //     [8, 9, 4],
  //     [7, 6, 5]]
  //  matrix(4)
  //     [[1,   2,  3, 4],
  //     [12, 13, 14, 5],
  //     [11, 16, 15, 6],
  //     [10,  9,  8, 7]]

  fun matrix(n: Int): MutableList<MutableList<Int>> {
    val maxNum = n * n
    val matrixArray = mutableListOf<MutableList<Int>>()
    for (i in 1..n) {
      matrixArray += mutableListOf<Int>()
    }
    matrixArray.forEach {
      for (i in 1..n) {
        it += 0
      }
    }

    var coordinates = Pair(0, 0)
    var direction = "RIGHT"

    for (i in 1..maxNum) {
      matrixArray[coordinates.first][coordinates.second] = i
      direction = calcDirection(matrixArray, coordinates, direction)
      coordinates = calcNextCoordinates(coordinates, direction)
    }

    matrixArray.forEach { println(it) }
    return matrixArray
  }

  private fun calcDirection(
    matrixArray: MutableList<MutableList<Int>>, coordinates: Pair<Int, Int>, direction: String
  ): String {
    // If I'm going right and what's next to me is out of bounds or already defined...
    if (direction == "RIGHT") {
      try {
        val toRight = matrixArray[coordinates.first][coordinates.second + 1]
        return if (toRight != 0) "DOWN" else "RIGHT"
      } catch (e: IndexOutOfBoundsException) {
        return "DOWN"
      }
    }

    if (direction == "DOWN") {
      try {
        val below = matrixArray[coordinates.first + 1][coordinates.second]
        return if (below != 0) "LEFT" else "DOWN"
      } catch (e: IndexOutOfBoundsException) {
        return "LEFT"
      }
    }

    if (direction == "LEFT") {
      try {
        val toLeft = matrixArray[coordinates.first][coordinates.second - 1]
        return if (toLeft != 0) "UP" else "LEFT"
      } catch (e: IndexOutOfBoundsException) {
        return "UP"
      }
    }

    if (direction == "UP") {
      try {
        val above = matrixArray[coordinates.first - 1][coordinates.second]
        return if (above != 0) "RIGHT" else "UP"
      } catch (e: IndexOutOfBoundsException) {
        return "RIGHT"
      }
    }

    throw Exception("could not calculate direction")
  }

  private fun calcNextCoordinates(coordinates: Pair<Int, Int>, direction: String): Pair<Int, Int> {
    if (direction == "RIGHT") {
      return Pair(coordinates.first, coordinates.second + 1)
    }

    if (direction == "DOWN") {
      return Pair(coordinates.first + 1, coordinates.second)
    }

    if (direction == "LEFT") {
      return Pair(coordinates.first, coordinates.second - 1)
    }

    if (direction == "UP") {
      return Pair(coordinates.first - 1, coordinates.second)
    }

    throw Exception("could not calculate next coordinates")
  }
}