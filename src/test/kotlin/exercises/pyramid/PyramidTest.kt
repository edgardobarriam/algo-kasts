package exercises.pyramid

import kotlin.test.Test
import kotlin.test.assertEquals

class PyramidTest {
  private val pyramid = Pyramid()
  @Test
  fun pyramidTest() {
    assertEquals(listOf("#"), pyramid.pyramid(1))
    assertEquals(listOf(" # ","###"), pyramid.pyramid(2))
    assertEquals(listOf("  #  "," ### ", "#####"), pyramid.pyramid(3))
    assertEquals(listOf("   #   ","  ###  ", " ##### ", "#######"), pyramid.pyramid(4))
  }
}