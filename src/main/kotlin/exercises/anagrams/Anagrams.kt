package exercises.anagrams

class Anagrams {

  /* --- Directions
  Check to see if two provided strings are anagrams of eachother.
  One string is an anagram of another if it uses the same characters
  in the same quantity. Only consider characters, not spaces
  or punctuation.  Consider capital letters to be the same as lower case
  --- Examples
  anagrams('rail safety', 'fairy tales') --> True
  anagrams('RAIL! SAFETY!', 'fairy tales') --> True
  anagrams('Hi there', 'Bye there') --> False */
  fun anagrams(string1: String, string2: String): Boolean {
    val str1 = string1.replace(Regex("\\W"), "").toCharArray().sorted()
    val str2 = string2.replace(Regex("\\W"), "").toCharArray().sorted()
    return str1 == str2
  }
}