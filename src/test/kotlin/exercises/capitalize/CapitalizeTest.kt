package exercises.capitalize

import kotlin.test.Test
import kotlin.test.assertEquals

class CapitalizeTest {

  private val capitalize = Capitalize()

  @Test
  fun capitalizeTest() {
    assertEquals("I Love Breakfast At A Bill Miller Bbq", capitalize.capitalize("i love breakfast at a bill miller bbq") )
  }
}