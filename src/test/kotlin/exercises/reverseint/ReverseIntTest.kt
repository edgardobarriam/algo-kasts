package exercises.reverseint

import kotlin.test.assertEquals
import kotlin.test.Test

class ReverseIntIntTest {

  private val reverseInt = ReverseInt()

  @Test
  fun reverseIntInt() {
    assertEquals(0, reverseInt.reverseInt(0))

    assertEquals(5, reverseInt.reverseInt(5))
    assertEquals(51, reverseInt.reverseInt(15))
    assertEquals(9, reverseInt.reverseInt(90))
    assertEquals(9532, reverseInt.reverseInt(2359))

    assertEquals(-5, reverseInt.reverseInt(-5))
    assertEquals(-51, reverseInt.reverseInt(-15))
    assertEquals(-9, reverseInt.reverseInt(-90))
    assertEquals(-9532, reverseInt.reverseInt(-2359))

  }
}