package linkedList;

public class DeleteNode {
    LinkedListNode head;

    public LinkedListNode deleteNode(LinkedListNode head, int position) {
        if (LengthOfLinkedList.lengthRecursive(head) < position || position < 1) {
            return null;
        }
        if (position == 1) {
            LinkedListNode current = head;
            head = head.next;
            current.next = null;
            return current;
        } else {
            LinkedListNode prev = head;
            int count = 1;
            while (count < position - 1) {
                prev = prev.next;
                count++;
            }
            LinkedListNode current = prev.next;
            prev.next = current.next;
            current.next = null;
            return current;
        }

    }

}
