package linkedList;

public class LinkedListIsCircular {
  static Node head;

  static class Node {
    Node next;
    int data;

    Node(int data) {
      this.data = data;
      next = null;
    }
  }

  public static boolean isCircular(Node head) {
    if (head == null) {
      return true;
    }
    Node current = head.next;
    while (current != null && current != head) {
      current = current.next;
    }
    return current == head ? true : false;
  }

  public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);

    System.out.println(isCircular(head) ? "Yes\n" : "No\n");
    // Making linked list circular
    head.next.next.next.next = head;
    System.out.println(isCircular(head) ? "Yes\n" : "No\n");
  }
}
