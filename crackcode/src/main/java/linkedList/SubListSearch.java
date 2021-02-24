package linkedList;

/**
 * Sublist Search (Search a linked list in another list)
 * Difficulty Level : Easy
 * Last Updated : 15 Sep, 2020
 * Given two linked lists, the task is to check whether the first list is present in 2nd list or not.
 * Examples:
 * <p>
 * Input  : list1 =  10->20
 * list2  = 5->10->20
 * Output : LIST FOUND
 * <p>
 * Input  : list1 =  1->2->3->4
 * list2  = 1->2->1->2->3->4
 * Output : LIST FOUND
 * <p>
 * Input  : list1 =  1->2->3->4
 * list2  = 1->2->2->1->2->3
 * Output : LIST NOT FOUND
 */
public class SubListSearch {
  Node head;

  static class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  public static boolean findList(Node first, Node second) {
    Node ptr1 = first, ptr2 = second;
    // If both linked lists are empty,return true
    if (first == null && second == null) {
      return true;
    }
    // Else If one is empty and other is not, return false
    if (first == null || (first != null && second == null)) {
      return false;
    }
    while (second != null) {
      ptr2 = second;
      while (ptr1 != null) {
        if (ptr2 == null) {
          return false;
        } else if (ptr1.data == ptr2.data) {
          ptr1 = ptr1.next;
          ptr2 = ptr2.next;
        } else {
          break;
        }
      }
      if (ptr1 == null) {
        return true;
      }
      ptr1 = first;
      second = second.next;
    }
    return false;
  }

  public static void printList(Node node) {
    while (node != null) {
      System.out.print(node.data + " ");
      node = node.next;
    }
  }

  public static void main(String[] args) {
    /* Let us create two linked lists to test
    the above functions. Created lists shall be
        a: 1->2->3->4
        b: 1->2->1->2->3->4
    */
    Node a = new Node(1);
    a.next = new Node(2);
    a.next.next = new Node(3);
    a.next.next.next = new Node(4);

    Node b = new Node(1);
    b.next = new Node(2);
    b.next.next = new Node(1);
    b.next.next.next = new Node(2);
    b.next.next.next.next = new Node(3);
    b.next.next.next.next.next = new Node(4);

    if (findList(a, b) == true)
      System.out.println("LIST FOUND");
    else
      System.out.println("LIST NOT FOUND");
  }
}
