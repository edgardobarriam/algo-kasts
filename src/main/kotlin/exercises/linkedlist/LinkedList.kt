package exercises.linkedlist

class LinkedList<T> {
  var head : Node<T>? = null

  fun insertFirst(value : T) {
    this.head = Node(value, this.head)
  }

  fun size(): Int {
    var node = this.head
    var size = 0
    while (node != null) {
      size++
      node = node.next
    }
    return size
  }

  fun getFirst() : Node<T>? {
    return this.head
  }

  fun getLast() : Node<T>? {
    var node = this.head
    while (node?.next != null) {
      node = node.next
    }
    return node
  }

  fun clear() {
    this.head = null
  }

  fun removeFirst() {
    if (this.head != null) {
      this.head = this.head?.next
    }
  }

  fun removeLast() {
    var node = this.head
    if (node != null) {
      while (node?.next?.next != null) {
          node = node.next
      }
      if (node?.next != null) {
        node.next = null
      } else {
        this.head = null
      }
    }
  }

  fun insertLast(value : T) {
    if (this.getLast() != null) {
      this.getLast()?.next = Node(value, null)
    } else {
      this.head = Node(value, null)
    }
  }

  fun getAt(value : Int) : Node<T>? {
    var node = this.head
    var index = 0
    while (node != null && index != value) {
      node = node.next
      index++
    }
    return node
  }

  fun removeAt(index : Int) {
    if (index < 0) {return}
    if (this.head != null && index == 0) {
      this.head = this.head?.next
      return
    }
    val node = this.getAt(index - 1)
    if (node != null) {
      node.next = this.getAt(index + 1)
    }
  }

  fun insertAt(index : Int, value : T) {
    if (index < 0) {return}
    if (index == 0) {
      this.head = Node(value, this.head)
      return
    }
    val node = this.getAt(index - 1)
    if (node != null) {
      node.next = Node(value, this.getAt(index))
    } else {
      this.getLast()?.next = Node(value, null)
    }
  }

  fun forEach(action : (Node<T>, Int) -> Unit) {
    var node = this.head
    var index = 0
    while (node != null) {
      action(node, index)
      node = node.next
      index++
    }
  }
}