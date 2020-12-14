package linkedList;

public class RevereLinkedList {
  static Node head;

  static class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  public static Node reverseLinkedLis(Node head) {
    Node currentNode = head, nextNode = null, prevNode = null;
    if (head == null) {
      return null;
    }
    while (currentNode != null) {
      nextNode = currentNode.next;
      currentNode.next = prevNode;
      prevNode = currentNode;
      currentNode = nextNode;
    }
    head = prevNode;
    return head;
  }

  void printList(Node node) {
    while (node != null) {
      System.out.print(node.data + " ");
      node = node.next;
    }
  }

  public static void main(String[] args) {
    RevereLinkedList list = new RevereLinkedList();
    list.head = new Node(85);
    list.head.next = new Node(15);
    list.head.next.next = new Node(4);
    list.head.next.next.next = new Node(20);
    System.out.println("Given Linked list");
    list.printList(head);
    head = list.reverseLinkedLis(head);
    System.out.println("");
    list.printList(head);
  }
}
