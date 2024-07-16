package exercises.reverseint

import kotlin.math.absoluteValue

/* --- Directions
Given an integer, return an integer that is the reverse
ordering of numbers.
--- Examples
reverseInt(15) === 51
reverseInt(981) === 189
reverseInt(500) === 5
reverseInt(-15) === -51
reverseInt(-90) === -9
*/
class ReverseInt {

  fun reverseInt(n: Int) : Int {
    val rev = n.absoluteValue.toString().reversed().toInt()
    return if (n < 0)  rev * -1 else rev
  }
}