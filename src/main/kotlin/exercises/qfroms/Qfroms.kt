package exercises.qfroms

import exercises.stack.Stack

class Qfroms {

  // Implement a Queue datastructure using two stacks.
  // *Do not* create an array inside of the 'Queue' class.
  // Queue should implement the methods 'add', 'remove', and 'peek'.
  // For a reminder on what each method does, look back
  // at the Queue exercise.
  // --- Examples
  //     const q = new Queue();
  //     q.add(1);
  //     q.add(2);
  //     q.peek();  // returns 1
  //     q.remove(); // returns 1
  //     q.remove(); // returns 2
  private val stack1 = Stack<Int>()
  private val stack2 = Stack<Int>()

  fun add(value: Int) {
    stack1.push(value)
  }

  fun remove(): Int? {
    while (stack1.peek() != null) {
      stack2.push(stack1.pop()!!)
    }

    val element = stack2.pop()

    while (stack2.peek() != null) {
      stack1.push(stack2.pop()!!)
    }

    return element
  }

  fun peek(): Int? {
    while (stack1.peek() != null) {
      stack2.push(stack1.pop()!!)
    }

    val element = stack2.peek()

    while (stack2.peek() != null) {
      stack1.push(stack2.pop()!!)
    }

    return element
  }

}