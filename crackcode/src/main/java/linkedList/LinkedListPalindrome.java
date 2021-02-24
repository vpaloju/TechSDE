package linkedList;

import java.util.Stack;

public class LinkedListPalindrome {

  static class LinkedListNode {
    int data;
    LinkedListNode next;

    LinkedListNode(int d) {
      data = d;
      next = null;
    }
  }

  public static boolean isLinkedListPalindrome(LinkedListNode head) {
    if (head == null) {
      return true;
    }
    LinkedListNode current = head;
    Stack<Integer> stack = new Stack<>();
    while (current != null) {
      stack.push(current.data);
      current = current.next;
    }
    while (head != null) {
      int i = stack.pop();
      if (head.data == i) {
        head = head.next;
        continue;
      } else {
        return false;
      }
    }
    return true;
  }

  public static boolean isPalindrome(LinkedListNode head) {
    if (head == null) {
      return true;
    }
    LinkedListNode current = head, fastPointer = head;
    while (fastPointer != null && fastPointer.next != null) {
      current = current.next;
      fastPointer = fastPointer.next.next;
    }
    if (fastPointer != null) {
      current = current.next;
      current = reverse(current);
    }
    while (current != null) {
      if (head.data != current.data) {
        return false;
      }
      head = head.next;
      current = current.next;
    }
    return true;
  }

  public static LinkedListNode reverse(LinkedListNode head) {
    LinkedListNode current = head, prev = null, next;
    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    return prev;
  }

  public static void main(String[] args) {
    LinkedListNode head = new LinkedListNode(1);
    head.next = new LinkedListNode(2);
    head.next.next = new LinkedListNode(3);
    head.next.next.next = new LinkedListNode(4);
    head.next.next.next.next = new LinkedListNode(3);
    head.next.next.next.next.next = new LinkedListNode(2);
    head.next.next.next.next.next.next = new LinkedListNode(1);
    System.out.println(isLinkedListPalindrome(head));
  }
}
