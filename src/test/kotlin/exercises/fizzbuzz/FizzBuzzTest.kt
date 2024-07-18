package exercises.fizzbuzz

import kotlin.test.Test
import kotlin.test.assertEquals

class FizzBuzzTest {
  private val fizzBuzz = FizzBuzz()

  @Test
  fun fizzBuzzTest() {
    assertEquals(listOf("1","2","fizz","4","buzz"), fizzBuzz.fizzBuzz(5))
    assertEquals(listOf("1","2","fizz","4","buzz","fizz","7","8","fizz","buzz","11","fizz","13","14","fizzbuzz"), fizzBuzz.fizzBuzz(15))
  }
}