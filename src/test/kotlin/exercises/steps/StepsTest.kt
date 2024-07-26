package exercises.steps

import kotlin.test.Test
import kotlin.test.assertEquals

class StepsTest {
  private val steps = Steps()
  @Test
  fun stepsTest() {
    assertEquals(listOf("#"), steps.steps(1))
    assertEquals(listOf("#  ","## ","###"), steps.steps(3))
    assertEquals(listOf("#    ","##   ","###  ", "#### ", "#####"), steps.steps(5))
  }
}