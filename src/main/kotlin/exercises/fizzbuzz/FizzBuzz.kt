package exercises.fizzbuzz

class FizzBuzz {

  /*
  --- Directions
  Write a program that console logs the numbers
  from 1 to n. But for multiples of three print
  “fizz” instead of the number and for the multiples
  of five print “buzz”. For numbers which are multiples
  of both three and five print “fizzbuzz”.
  --- Example
  fizzBuzz(5);
  1
  2
  fizz
  4
  buzz
  */
  fun fizzBuzz(n: Int): List<String> {
    val values = mutableListOf<String>()
    for (i in 1..n) {
      var msg = if (i % 3 == 0) "fizz" else ""
      msg += if (i % 5 == 0) "buzz" else ""
      values += msg.ifEmpty { i.toString() }
    }
    return values
  }
}