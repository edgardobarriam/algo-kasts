package exercises.weave

import org.junit.jupiter.api.assertThrows
import kotlin.test.Test
import kotlin.test.assertEquals

class WeaveTest {

  private val weave = Weave()

  @Test
  fun weaveTest() {
    val q1 = Queue<String>()
    q1.add("1")
    q1.add("2")
    q1.add("3")
    q1.add("4")

    val q2 = Queue<String>()
    q2.add("one")
    q2.add("two")
    q2.add("three")
    q2.add("four")

    val result = weave.weave(q1, q2)

    assertEquals("1", result.remove())
    assertEquals("one", result.remove())
    assertEquals("2", result.remove())
    assertEquals("two", result.remove())
    assertEquals("3", result.remove())
    assertEquals("three", result.remove())
    assertEquals("4", result.remove())
    assertEquals("four", result.remove())

    assertThrows<NoSuchElementException> { result.remove() }
  }
}