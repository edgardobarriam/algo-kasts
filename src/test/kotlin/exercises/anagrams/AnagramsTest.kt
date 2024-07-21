package exercises.anagrams

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class AnagramsTest {

  private val anagrams = Anagrams()

  @Test
  fun anagramsTest() {
    assertTrue {anagrams.anagrams("asd asd", "dsadsa")}
    assertTrue {anagrams.anagrams("hello", "llohe")}
    assertTrue {anagrams.anagrams("Whoa! Hi!", "Hi! Whoa!")}
    assertFalse {anagrams.anagrams("One one", "One one c")}
    assertFalse {anagrams.anagrams("asd asd 123", "dsadsa")}
    assertFalse {anagrams.anagrams("A tree, a life, a bench", "A tree, a fence, a yard")}
  }
}