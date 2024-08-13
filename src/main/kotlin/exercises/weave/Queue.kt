package exercises.weave

class Queue<T> {

  // --- Directions
  // Implement a 'peek' method in this Queue class.
  // Peek should return the last element (the next
  // one to be returned) from the queue *without*
  // removing it.
  private val queue = mutableListOf<T>()
  fun add(element: T) {
    queue.addFirst(element)
  }

  fun remove(): T {
    return queue.removeLast()
  }

  fun peek(): T? {
    return queue.lastOrNull()
  }
}