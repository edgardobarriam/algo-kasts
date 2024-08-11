package exercises.vowels
import kotlin.test.Test
import kotlin.test.assertEquals


class VowelsTest {
  private val vowels = Vowels()

  @Test
  fun vowelsTest() {
    assertEquals(3, vowels.vowels("Hi There!"))
    assertEquals(3, vowels.vowels("HI THERE!"))
    assertEquals(4, vowels.vowels("Why do you ask?"))
    assertEquals(0, vowels.vowels("Why?"))
  }
}