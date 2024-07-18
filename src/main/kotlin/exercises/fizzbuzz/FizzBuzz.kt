package exercises.fizzbuzz

class FizzBuzz {

  fun fizzBuzz(n: Int) : List<String> {
    val values = mutableListOf<String>()
    for (i in 1..n) {
      var msg = if (i%3 == 0) "fizz" else ""
      msg += if (i%5 == 0) "buzz" else ""
      values += msg.ifEmpty { i.toString() }
    }
    return values
  }
}