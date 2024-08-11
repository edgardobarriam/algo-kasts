package exercises.fib

import kotlin.test.Test
import kotlin.test.assertEquals


class FibTest {

  private val fib = Fib()

  @Test
  fun fibTest() {
    assertEquals(1, fib.fib(1))
    assertEquals(1, fib.fib(2))
    assertEquals(2, fib.fib(3))
    assertEquals(3, fib.fib(4))
    assertEquals(63245986, fib.fib(39))
  }
}