package exercises.pyramid

class Pyramid {

  // --- Directions
  // Write a function that accepts a positive number N.
  // The function should console log a pyramid shape
  // with N levels using the # character.  Make sure the
  // pyramid has spaces on both the left *and* right hand sides
  // --- Examples
  //   pyramid(1)
  //       '#'
  //   pyramid(2)
  //       ' # '
  //       '###'
  //   pyramid(3)
  //       '  #  '
  //       ' ### '
  //       '#####'
  fun pyramid(n: Int): MutableList<String> {
    val pyramidList = mutableListOf<String>()
    val baseSize = 2*n - 1

    for (i in 0..<n) {
      val numBlocks = 1 + (i * 2)
      val padding = baseSize - numBlocks
      var blocks = ""

      for (j in 0..<numBlocks) {
        blocks += "#"
      }

      val line = blocks.padStart(numBlocks + padding / 2, ' ').padEnd(baseSize, ' ')
      println(line)
      pyramidList.add(line)
    }

    return pyramidList
  }
}