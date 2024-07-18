package exercises.maxchar

import kotlin.test.Test
import kotlin.test.assertEquals

class MaxCharTest {

  private val maxChar = MaxChar()

  @Test
  fun maxChar() {
    assertEquals('a', maxChar.maxChar("aaaaaaaaabcffghfsw"))
    assertEquals(' ', maxChar.maxChar("sedfwesdf     vsdfcv      32165"))
    assertEquals('1', maxChar.maxChar("111111111111111111"))
    assertEquals('5', maxChar.maxChar("38451951215589741652555555"))
    assertEquals('n', maxChar.maxChar("n3423242sdsdcntyunnnedwsnnnn"))
  }
}