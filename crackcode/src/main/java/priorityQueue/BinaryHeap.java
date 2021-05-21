package priorityQueue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class BinaryHeap<T> {

  private final int d = 2;
  private int heapSize;
  private int[] heap;

  public BinaryHeap(int capacity) {
    heapSize = 0;
    heap = new int[capacity + 1];
    Arrays.fill(heap, -1);
  }

  public boolean isEmpty() {
    return heapSize == 0;
  }

  public boolean isFull() {
    return heapSize == heap.length;
  }

  //Return the pare
  public int parent(int i) {
    return (i - 1) / d;
  }

  public int kthChild(int i, int k) {
    return d * i + k;
  }

  /**
   * This will insert new element in to heap
   * Complexity: O(log N)
   * As worst case scenario, we need to traverse till the root
   */
  public void insert(int element) {
    if (isFull()) {
      throw new NoSuchElementException("Heap is full, No space to insert new element");
    }
    heap[heapSize++] = element;
    hepifyUp(heapSize - 1);
  }

  /**
   * This will delete element at index x
   * Complexity: O(log N)
   */
  public int delete(int i) {
    if (isEmpty()) {
      throw new NoSuchElementException("Heap is full, No space to insert new element");
    }
    int key = heap[i];
    heap[i] = heap[heapSize - 1];
    heapSize--;
    heapifyDown(i);
    return key;
  }


  public void hepifyUp(int i) {
    int temp = heap[i];
    while (i > 0 && temp > heap[parent(i)]) {
      heap[i] = heap[parent(i)];
      i = parent(i);
    }
    heap[i] = temp;
  }

  public void heapifyDown(int i) {
    int child;
    int temp = heap[i];
    while (kthChild(i, 1) < heapSize) {
      child = maxChild(i);
      if (temp < heap[child]) {
        heap[i] = heap[child];
      } else break;
      i = child;
    }
    heap[i] = temp;
  }

  private int maxChild(int i) {
    int leftChild = kthChild(i, 1);
    int rightChild = kthChild(i, 2);
    return heap[leftChild] > heap[rightChild] ? leftChild : rightChild;
  }

  /**
   * This method used to print all element of the heap
   */
  public void printHeap() {
    System.out.print("nHeap = ");
    for (int i = 0; i < heapSize; i++)
      System.out.print(heap[i] + " ");
    System.out.println();
  }

  /**
   * This method returns the max element of the heap.
   * complexity: O(1)
   */
  public int findMax() {
    if (isEmpty())
      throw new NoSuchElementException("Heap is empty.");
    return heap[0];
  }

  public static void main(String[] args) {
    BinaryHeap maxHeap = new BinaryHeap(10);
    maxHeap.insert(10);
    maxHeap.insert(4);

    maxHeap.insert(1);
    maxHeap.insert(7);
    maxHeap.insert(5);
    maxHeap.insert(3);

    maxHeap.printHeap();
    maxHeap.delete(5);
    maxHeap.printHeap();
  }
}
