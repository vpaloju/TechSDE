package linkedList;

import java.util.HashMap;

public class OccuranceOfElement {

    LinkedListNode head;

    /**
     *
     * @param element
     * @return
     */
    public int occuranceOfElement(int element) {
        int count = 0;
        LinkedListNode current = head;
        while (current != null) {
            if (current.data == element) {
                count++;
            }
            current = current.next;
        }
        return count;
    }

    /**
     *
     * @param head
     * @param element
     * @return
     */
    public int occuranceRecursive(LinkedListNode head, int element) {
        if (head == null) {
            return 0;
        }
        if (head.data == element) {
            return 1 + occuranceRecursive(head.next, element);
        }
        return occuranceRecursive(head.next, element);
    }
}
