package exercises.steps

class Steps {

  /* --- Directions
  Write a function that accepts a positive number N.
  The function should console log a step shape
  with N levels using the # character.  Make sure the
  step has spaces on the right hand side!
  --- Examples
  steps(2)
  '# '
  '##'
  steps(3)
  '#  '
  '## '
  '###'
  steps(4)
  '#   '
  '##  '
  '### '
  '####' */
  fun steps(n: Int) : List<String> {
    val stepsList = mutableListOf<String>()
    for (i in 1..n) {
      val step = "".padStart(i,'#').padEnd(n, ' ')
      println(step)
      stepsList += step
    }
    return stepsList
  }
}