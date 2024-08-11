package exercises.queue

import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows
import kotlin.test.Test
import kotlin.test.assertEquals

class QueueTest {

  @Test
  fun queueTest() {
    val queue = Queue<Int>()
    assertDoesNotThrow { queue.add(1) }
    assertDoesNotThrow { queue.remove() }

    queue.add(1)
    queue.add(2)
    queue.add(3)

    assertEquals(1, queue.remove())
    assertEquals(2, queue.remove())
    assertEquals(3, queue.remove())

    assertThrows<NoSuchElementException> { queue.remove() }
  }

}