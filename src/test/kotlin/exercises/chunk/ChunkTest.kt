package exercises.chunk

import kotlin.test.Test
import kotlin.test.assertEquals

class ChunkTest {

  private val chunk = Chunk()

  @Test
  fun chunkTest() {
    assertEquals(listOf(listOf(1,2), listOf(3,4), listOf(5)), chunk.chunk(listOf(1,2,3,4,5),2))
    assertEquals(listOf(listOf(1,2)), chunk.chunk(listOf(1,2),10))
    assertEquals(listOf(listOf(1,2,3,4), listOf(5,6,7)), chunk.chunk(listOf(1,2,3,4,5,6,7),4))
    assertEquals(listOf(listOf(1,2,3,4), listOf(5)), chunk.chunk(listOf(1,2,3,4,5),4))
  }
}