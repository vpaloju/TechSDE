package queue;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueWithLinkedList<T> implements Iterable {

  LinkedList<T> list = new LinkedList<T>();

  public QueueWithLinkedList() {

  }

  public QueueWithLinkedList(T firstElement) {
    offer(firstElement);
  }

  public int size() {
    return list.size();
  }

  public boolean isEmpty() {
    return list.size() == 0;
  }

  //Returns the element at the front of Queue.
  public T peek() {
    if (isEmpty()) {
      throw new RuntimeException("Queue is Empty");
    }
    return list.peekFirst();
  }

  //Remove the element from the front of Queue.
  public T pop() {
    if (isEmpty()) {
      throw new RuntimeException("Queue is Empty");
    }
    return list.removeFirst();
  }

  //Add element to the back of Queue.
  public void offer(T element) {
    list.addLast(element);
  }

  @Override
  public Iterator iterator() {
    return list.iterator();
  }

  public static void main(String[] args) {
    QueueWithLinkedList queue = new QueueWithLinkedList();
    queue.offer(1);
    queue.offer(2);
    queue.offer(3);
    queue.offer(4);
    queue.offer(5);

    System.out.println(queue.pop()); // 1
    System.out.println(queue.pop()); // 2
    System.out.println(queue.pop()); // 3
    System.out.println(queue.pop()); // 4

    System.out.println(queue.isEmpty()); // false

    queue.offer(1);
    queue.offer(2);
    queue.offer(3);

    System.out.println(queue.pop()); // 5
    System.out.println(queue.pop()); // 1
    System.out.println(queue.pop()); // 2
    System.out.println(queue.pop()); // 3

    System.out.println(queue.isEmpty()); // true
  }
}
