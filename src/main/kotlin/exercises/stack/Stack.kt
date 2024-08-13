package exercises.stack

class Stack<T> {

  // --- Directions
  // Create a stack data structure.  The stack
  // should be a class with methods 'push', 'pop', and
  // 'peek'.  Adding an element to the stack should
  // store it until it is removed.
  // --- Examples
  //   const s = new Stack();
  //   s.push(1);
  //   s.push(2);
  //   s.pop(); // returns 2
  //   s.pop(); // returns 1

  private val stack = mutableListOf<T>()

  fun push(item: T) {
    stack.add(item)
  }

  fun pop(): T? {
    return stack.removeAt(stack.lastIndex)
  }

  fun peek(): T? {
    return stack.lastOrNull()
  }
}