package interviewquestions.salesForce;

public class IntersectionOfLinkedLists {

  static class Node {
    Node next;
    int data;

    Node(int data) {
      this.data = data;
      next = null;
    }
  }

  public static int getIntersectionOfLists(Node head1, Node head2) {
    Node current1 = head1, current2 = head2;
    if (current1 == null || current2 == null) {
      return -1;
    }
    while (current1 != null && current2 != null && current1 != current2) {
      current1 = current1.next;
      current2 = current2.next;
      if (current1 == current2) {
        return current1.data;
      }
      if (current1 == null) {
        current1 = head2;
      }
      if (current2 == null) {
        current2 = head1;
      }
    }
    return current1.data;
  }

  public static void main(String[] args) {
    /*   1st 3.6.9.15.30
        2nd 10.15.30
    */
    // Addition of new nodes
    Node head1 = new Node(10);
    Node head2 = new Node(3);
    head2.next = new Node(6);
    head2.next.next = new Node(9);

    head1.next = new Node(15);
    head2.next.next.next = head1.next;
    head1.next.next = new Node(30);
    head1.next.next.next = null;

    System.out.print(getIntersectionOfLists(head1, head2));//15
  }
}
