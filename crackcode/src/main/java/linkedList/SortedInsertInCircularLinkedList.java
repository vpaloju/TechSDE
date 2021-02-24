package linkedList;

/**
 * Algorithm:
 * Allocate memory for the newly inserted node and put data in the newly allocated node. Let the pointer to the new node be new_node. After memory allocation, following are the three cases that need to be handled.
 *
 *
 * 1) Linked List is empty:
 *     a)  since new_node is the only node in CLL, make a self loop.
 *           new_node->next = new_node;
 *     b) change the head pointer to point to new node.
 *           head_ref = new_node;
 * 2) New node is to be inserted just before the head node:
 *   (a) Find out the last node using a loop.
 *          while(current->next != head_ref)
 *             current = current->next;
 *   (b) Change the next of last node.
 *          current->next = new_node;
 *   (c) Change next of new node to point to head.
 *          new_node->next = head_ref;
 *   (d) change the head pointer to point to new node.
 *          head_ref = new_node;
 * 3) New node is to be  inserted somewhere after the head:
 *    (a) Locate the node after which new node is to be inserted.
 *          while ( current->next!= head_ref &&
 *              current->next->data data)
 *          {   current = current->next;   }
 *    (b) Make next of new_node as next of the located pointer
 *          new_node->next = current->next;
 *    (c) Change the next of the located pointer
 *          current->next = new_node;
 */
public class SortedInsertInCircularLinkedList {

  static CircularLinkedListNode head;

  static class CircularLinkedListNode {
    CircularLinkedListNode next;
    int data;

    CircularLinkedListNode(int data) {
      this.data = data;
      next = null;
    }
  }

  public static void sortedInsert(CircularLinkedListNode newNode) {
    CircularLinkedListNode current = head;
    //Linked List is empty:
    if (current == null) {
      newNode.next = newNode;
      head = newNode;
    } else if (current.data > newNode.data) {
      // If value is smaller than head's value then we need to change next of last node
      while (current.next != head) {
        current = current.next;
      }
      current.next = newNode;
      newNode.next = head;
      head = newNode;
    } else {
      /* Locate the node before the point of insertion */
      while (current.next != head &&
        current.next.data < newNode.data) {
        current = current.next;
      }
      newNode.next = current.next;
      current.next = newNode;
    }
  }

  public static void printList() {
    if (head != null) {
      CircularLinkedListNode current = head;
      do {
        System.out.println(current.data + " ");
        current = current.next;
      } while (current != head);
    }
  }

  public static void main(String[] args) {
    int arr[] = new int[]{12, 56, 2, 11, 1, 90,2};
    CircularLinkedListNode newNode = null;
    for (int i = 0; i < arr.length; i++) {
      newNode = new CircularLinkedListNode(arr[i]);
      sortedInsert(newNode);
    }
    printList();
  }
}
