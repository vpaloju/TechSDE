package queue;

/**
 * you need to know an upper bound on the number of elements that will be inside the queue at any
 * given time for this queue to work.
 */
public class Queue {

  private int[] array;
  private int front, end, size;

  private Queue(int maxSize) {
    front = end = 0;
    size = maxSize + 1;
    array = new int[size];
  }

  public boolean isEmpty() {
    return front == end;
  }

  public int size() {
    if (front > end) {
      return end + size - front;
    }
    return end - front;
  }

  public int peek() {
    return array[front];
  }

  public void enqueue(int element) {
    array[end] = element;
    if (++end == size) {
      end = 0;
    }
    if (end == front) {
      throw new RuntimeException("Queue is too small!");
    }
  }

  public int dequeue() {
    int elementToRemove = array[front];
    if (++front == size) {
      front = 0;
    }
    return elementToRemove;
  }

  public static void main(String[] args) {
    Queue queue = new Queue(5);
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    queue.enqueue(5);

    System.out.println(queue.dequeue()); // 1
    System.out.println(queue.dequeue()); // 2
    System.out.println(queue.dequeue()); // 3
    System.out.println(queue.dequeue()); // 4

    System.out.println(queue.isEmpty()); // false

    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);

    System.out.println(queue.dequeue()); // 5
    System.out.println(queue.dequeue()); // 1
    System.out.println(queue.dequeue()); // 2
    System.out.println(queue.dequeue()); // 3

    System.out.println(queue.isEmpty()); // true

  }

}
