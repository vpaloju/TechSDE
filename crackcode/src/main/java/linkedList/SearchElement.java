package linkedList;

public class SearchElement {

    LinkedListNode head;

    /**
     *
     * @param key
     * @return
     */
    public boolean search(int key) {
        LinkedListNode current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     *
     * @param head
     * @param key
     * @return
     */
    public boolean searchRecursive(LinkedListNode head, int key) {
        if (head == null) {
            return false;
        }
        if (head.data == key) {
            return true;
        }
        return searchRecursive(head.next, key);
    }
}
