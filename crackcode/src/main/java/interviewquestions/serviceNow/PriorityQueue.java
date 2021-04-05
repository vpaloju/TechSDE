package interviewquestions.serviceNow;

public class PriorityQueue {

  private int[] priorityQueueArray;
  private int size;
  private int numberOfElements;

  PriorityQueue(int size) {
    this.size = size;
    this.priorityQueueArray = new int[this.size];
    this.numberOfElements = 0;
  }

  public void insert(int value) {
    int i;
    if (isFull()) {
      System.out.println("The Queue is full not able to add element!");
    }
    if (numberOfElements == 0) {
      priorityQueueArray[numberOfElements++] = value;
    } else {
      for (i = numberOfElements - 1; i >= 0; i--) {
        if (value > priorityQueueArray[i]) {
          priorityQueueArray[i + 1] = priorityQueueArray[i];
        } else {
          break;
        }
      }
      priorityQueueArray[++i] = value;
      numberOfElements++;
    }
  }

  public int remove() {
    if (isEmpty()) {
      return -1;
    }
    return priorityQueueArray[--numberOfElements];
  }

  public boolean isFull() {
    return numberOfElements == size ? true : false;
  }

  public boolean isEmpty() {
    return numberOfElements == 0 ? true : false;
  }

  public static void main(String[] args) {
    PriorityQueue priorityQueue = new PriorityQueue(10); // Priority Queue holds 10 elements

    priorityQueue.insert(81);
    priorityQueue.insert(72);
    priorityQueue.insert(52);
    priorityQueue.insert(61);

    System.out.print("Deleted elements from queue: ");
    System.out.print(priorityQueue.remove() + " ");
    System.out.print(priorityQueue.remove() + " ");
    System.out.print(priorityQueue.remove() + " ");
    System.out.print(priorityQueue.remove() + " ");
  }
}
