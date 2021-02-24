package interviewquestions.salesForce;

public class MergeSortedLinkedLists {

  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node sortedMerge(Node headA, Node headB) {
    Node dymmuNode = new Node(0);
    Node tail = dymmuNode;
    while (true) {
      if (headA == null) {
        tail.next = headB;
        break;
      }
      if (headB == null) {
        tail.next = headA;
        break;
      }
      if (headA.data <= headB.data) {
        tail.next = headA;
        headA = headA.next;
      } else {
        tail.next = headB;
        headB = headB.next;
      }
      tail = tail.next;
    }
    return dymmuNode.next;
  }

  public static void printList(Node head) {
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
  }

  public static void main(String[] args) {
    Node headA = new Node(5);
    headA.next = new Node(10);
    headA.next.next = new Node(15);

    Node headB = new Node(2);
    headB.next = new Node(3);
    headB.next.next = new Node(20);

    Node sortedListHead = sortedMerge(headA, headB);
    printList(sortedListHead);
  }
}
