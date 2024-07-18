package exercises.maxchar

class MaxChar {

  fun maxChar(string: String): Char {
    val charCounts = hashMapOf<Char, Int>()
    string.forEach {
      val count = charCounts.getOrDefault(it, 0) + 1
      charCounts[it] = count
    }
    return charCounts.maxByOrNull { it.value }?.key!!
  }
}