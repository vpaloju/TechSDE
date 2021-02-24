package interviewquestions.salesForce;

public class InsertMiddleOfList {
  static Node head;

  static class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  public static void displayList(Node head) {
    Node current = head;
    while (current != null) {
      System.out.println(current.data);
      current = current.next;
    }
  }

  public static void insertMiddle(Node head, int x) {
    Node newNode = new Node(x);
    if (head == null) {
      head = newNode;
    }
    Node slow = head;
    Node fast = head.next;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    newNode.next = slow.next;
    slow.next = newNode;
  }

  public static void main(String[] args) {
    head = null;
    head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(4);
    head.next.next.next = new Node(5);
    System.out.println("Linked list before" + " insertion: ");
    displayList(head);
    int x = 3;
    insertMiddle(head, x);
    System.out.println("\nLinked list after" + " insertion: ");
    displayList(head);
  }
}
