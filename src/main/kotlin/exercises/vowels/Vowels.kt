package exercises.vowels

import java.util.*

class Vowels {

  // --- Directions
  // Write a function that returns the number of vowels
  // used in a string.  Vowels are the characters 'a', 'e'
  // 'i', 'o', and 'u'.
  // --- Examples
  //   vowels('Hi There!') --> 3
  //   vowels('Why do you ask?') --> 4
  //   vowels('Why?') --> 0
  fun vowels(str: String): Int {
    val vowels = listOf('a', 'e', 'i', 'o', 'u')

    var vowelCount = 0;
    for (c in str.lowercase()) {
      if (vowels.contains(c)) {vowelCount++}
    }
    return vowelCount;
  }
}