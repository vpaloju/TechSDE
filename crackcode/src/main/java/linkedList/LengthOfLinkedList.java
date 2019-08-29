package linkedList;

public class LengthOfLinkedList {

    /**
     * @param head
     * @return
     */
    public static int length(LinkedListNode head) {
        LinkedListNode current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    /**
     * @param head
     * @return
     */
    public static int lengthRecursive(LinkedListNode head) {
        if (head == null) {
            return 0;
        } else {
            return 1 + lengthRecursive(head.next);
        }
    }

}
