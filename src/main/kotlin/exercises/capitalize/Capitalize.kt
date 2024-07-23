package exercises.capitalize

class Capitalize {

  fun capitalize(input: String): String {
    return input.split(" ").joinToString(" ") { word -> word.replaceFirstChar {it.uppercaseChar() }}
  }
}