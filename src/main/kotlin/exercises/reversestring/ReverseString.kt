package exercises.reversestring

class ReverseString {

  /*
  --- Directions
  Given a string, return a new string with the reversed
  order of characters
  --- Examples
  reverse('apple') === 'leppa'
  reverse('hello') === 'olleh'
  reverse('Greetings!') === '!sgniteerG'
  */
  fun reverse(string: String): String {
    var reversed = ""
    string.forEach { reversed = it + reversed }
    return reversed
  }
}
