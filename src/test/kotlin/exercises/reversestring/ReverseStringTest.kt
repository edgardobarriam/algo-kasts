package exercises.reversestring

import kotlin.test.Test
import kotlin.test.assertEquals

class ReverseStringTest {

  private val reverseString = ReverseString()

  @Test
  fun reverseString() {
    assertEquals("abcde", reverseString.reverse("edcba"))
  }

  @Test
  fun reverseStringWithSpaces() {
    assertEquals("abcde     ", reverseString.reverse("     edcba"))
  }

  @Test
  fun reverseEmptyString() {
    assertEquals("", reverseString.reverse(""))
  }
}