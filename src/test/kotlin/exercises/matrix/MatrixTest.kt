package exercises.matrix


import kotlin.test.Test

class MatrixTest {

  private val matrix = Matrix()

  @Test
  fun matrixTest() {
    matrix.matrix(4) // I'm too lazy to write a real test for this, so just enjoy the console output
    println("--------------------------")
    matrix.matrix(5)
    println("--------------------------")
    matrix.matrix(10)
    println("--------------------------")
    matrix.matrix(20)
  }
}