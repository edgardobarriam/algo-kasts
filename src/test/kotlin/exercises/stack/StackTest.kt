package exercises.stack

import kotlin.test.Test
import kotlin.test.assertEquals

class StackTest {

  private val stack = Stack<Int>()

  @Test
  fun stackTest() {
    stack.push(1)
    assertEquals(stack.pop(), 1)
    stack.push(2)
    assertEquals(stack.pop(), 2)
    stack.push(1)
    stack.push(2)
    stack.push(3)
    assertEquals(stack.pop(), 3)
    assertEquals(stack.pop(), 2)
    assertEquals(stack.pop(), 1)
    stack.push(1)
    assertEquals(stack.peek(), 1)
    stack.push(2)
    assertEquals(stack.peek(), 2)
    stack.push(3)
    assertEquals(stack.peek(), 3)
    assertEquals(stack.pop(), 3)
    assertEquals(stack.peek(), 2)
  }
}