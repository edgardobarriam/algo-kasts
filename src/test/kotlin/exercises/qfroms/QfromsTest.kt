package exercises.qfroms

import org.junit.jupiter.api.assertDoesNotThrow
import kotlin.test.Test
import kotlin.test.assertEquals

class QfromsTest {

  private val qfroms = Qfroms()

  @Test
  fun qfromsTest() {
    assertDoesNotThrow { qfroms.add(1) }
    assertDoesNotThrow { qfroms.remove() }

    qfroms.add(1)
    qfroms.add(2)
    qfroms.add(3)
    assertEquals(1, qfroms.remove())
    assertEquals(2, qfroms.remove())
    assertEquals(3, qfroms.remove())

    qfroms.add(1)
    qfroms.add(2)
    assertEquals(1, qfroms.peek())
    assertEquals(1, qfroms.peek())
    assertEquals(1, qfroms.remove())
    assertEquals(2, qfroms.remove())
  }
}