package exercises.reversestring

class ReverseString {

  fun reverse(string: String): String {
    var reversed = ""
    string.forEach { reversed = it + reversed }
    return reversed
  }
}
