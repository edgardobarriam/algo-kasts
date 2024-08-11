package exercises.fib

class Fib {
  // --- Directions
  // Print out the n-th entry in the fibonacci series.
  // The fibonacci series is an ordering of numbers where
  // each number is the sum of the preceeding two.
  // For example, the sequence
  //  [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
  // forms the first ten entries of the fibonacci series.
  // Example:
  //   fib(4) === 3
  fun fib(n: Int): Int {
    val fibArray = mutableListOf(0,1)

    for (i in 1..<n) {
      fibArray += fibArray[i] + fibArray[i-1]
    }

    return fibArray[n]
  }
}