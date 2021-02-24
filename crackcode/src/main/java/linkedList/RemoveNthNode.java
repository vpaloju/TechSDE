package linkedList;

/**
 * Delete Nth node from the end of the given linked list
 * Given a linked list and an integer N, the task is to delete the Nth node from the end of the given linked list.
 * <p>
 * Examples:
 * <p>
 * Input: 2 -> 3 -> 1 -> 7 -> NULL, N = 1
 * Output:
 * Created Linked list is:
 * 2 3 1 7
 * Linked List after Deletion is:
 * 2 3 1
 * <p>
 * Input: 1 -> 2 -> 3 -> 4 -> NULL, N = 4
 * Output:
 * Created Linked list is:
 * 1 2 3 4
 * Linked List after Deletion is:
 * 2 3 4
 */
public class RemoveNthNode {
  static LinkedListNode head;

  static class LinkedListNode {
    int data;
    LinkedListNode next;

    LinkedListNode(int d) {
      data = d;
      next = null;
    }
  }

  public static void removeNthNode(int n) {
    //Node point to Head.
    LinkedListNode first = head;
    //Node points to the nth Node.
    LinkedListNode second = head;
    for (int i = 0; i < n; i++) {
      if (second != null && second.next == null) {
        if (i == n - 1) {
          head = head.next;
          return;
        }
      }
      if (second != null) {
        second = second.next;
      } else {
        System.out.println("Invalid input " + n + " length of the list is " + i + " less than the given input " + n);
        return;
      }
    }
    while (second.next != null) {
      first = first.next;
      second = second.next;
    }
    first.next = first.next.next;
  }

  public static void displayList(LinkedListNode head) {
    LinkedListNode current = head;
    while (current != null) {
      System.out.println(current.data);
      current = current.next;
    }
  }

  public static void main(String[] args) {
    head = new LinkedListNode(1);
    head.next = new LinkedListNode(2);
    head.next.next = new LinkedListNode(3);
    head.next.next.next = new LinkedListNode(4);
    head.next.next.next.next = new LinkedListNode(5);

    System.out.println("\nCreated Linked list is:");
    displayList(head);

    int N = 3;
    removeNthNode(N);

    System.out.println("\nLinked List after Deletion is:");
    displayList(head);
  }

}
