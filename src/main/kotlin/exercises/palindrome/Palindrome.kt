package exercises.palindrome

class Palindrome {

  fun isPalindrome(str: String): Boolean {
    return str == str.reversed()
  }
}