package exercises.queue

class Queue<T> {

  // --- Description
// Create a queue data structure.  The queue
// should be a class with methods 'add' and 'remove'.
// Adding to the queue should store an element until
// it is removed
// --- Examples
//     const q = new Queue();
//     q.add(1);
//     q.remove(); // returns 1;
  private val queue = mutableListOf<T>()
  fun add(element: T) {
    queue.addFirst(element)
  }

  fun remove(): T {
    return queue.removeLast()
  }
}