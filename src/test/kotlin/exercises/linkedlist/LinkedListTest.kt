package exercises.linkedlist

import org.junit.jupiter.api.assertDoesNotThrow
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class LinkedListTest {

  private val list = LinkedList<String>()

  @Test
  fun linkedListTest() {
    list.insertFirst("1")
    assertEquals("1", list.head?.data)
    list.insertFirst("2")
    assertEquals("2", list.head?.data)
    list.insertFirst("tres")
    assertEquals(3, list.size())
    assertEquals("tres", list.getFirst()?.data)
    assertEquals("1", list.getLast()?.data)

    list.clear()
    assertEquals(0, list.size())
    assertNull(list.getFirst())
    assertNull(list.getLast())

    list.insertLast("uno")
    list.insertLast("dos")
    list.insertLast("tres")
    list.removeFirst()
    assertEquals(2, list.size())
    assertEquals("dos", list.getFirst()?.data)
    list.removeLast()
    assertEquals(1, list.size())
    assertEquals("dos", list.getFirst()?.data)
    list.removeLast()
    assertEquals(0, list.size())
    assertNull(list.getFirst())
    assertNull(list.getLast())
    assertDoesNotThrow { list.removeFirst() }
    assertDoesNotThrow { list.removeLast() }

    list.clear()
    list.insertLast("uno")
    list.insertLast("dos")
    list.insertLast("tres")
    assertEquals("dos", list.getAt(1)?.data)
    assertEquals("tres", list.getAt(2)?.data)
    assertEquals("uno", list.getAt(0)?.data)
    assertNull(list.getAt(10))
    assertDoesNotThrow { list.removeAt(10) }
    assertDoesNotThrow { list.removeAt(2) }
    assertEquals("dos", list.getLast()?.data)
    list.insertAt(1, "cuatro")
    assertEquals("cuatro", list.getAt(1)?.data)
    
    list.clear()
    list.insertLast("1")
    list.insertLast("2")
    list.insertLast("3")
    list.insertLast("4")
    list.forEach { node, i -> node.data += "0" }
    assertEquals("10",list.getAt(0)?.data)
    assertEquals("20",list.getAt(1)?.data)
    assertEquals("30",list.getAt(2)?.data)
    assertEquals("40",list.getAt(3)?.data)
  }
}