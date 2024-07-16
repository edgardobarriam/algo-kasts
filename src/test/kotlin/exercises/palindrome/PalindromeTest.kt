package exercises.palindrome

import kotlin.test.Test
import kotlin.test.assertEquals

class PalindromeTest {

  private val palindrome = Palindrome()

  @Test
  fun palindrome() {
    assertEquals(true, palindrome.isPalindrome("abba"))
    assertEquals(true, palindrome.isPalindrome("EdgdE"))
    assertEquals(true, palindrome.isPalindrome(""))
    assertEquals(false, palindrome.isPalindrome("  abba"))
    assertEquals(false, palindrome.isPalindrome("abba     "))
    assertEquals(false, palindrome.isPalindrome("greetings"))
  }
}