package linkedList;

public class DeleteNode {
    LinkedListNode head;

    /**
     * @param head
     * @param position
     * @return
     */
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

    /**
     * @param head
     * @param k
     * @return
     */
    public LinkedListNode deleteNodeRecursive(LinkedListNode head, int k) {
        if (k < 1) {
            return head;
        }
        if (head == null) {
            return null;
        }
        if (k == 1) {
            LinkedListNode res = head.next;
            return res;
        }
        head.next = deleteNodeRecursive(head.next, k - 1);
        return head;
    }

    /**
     * This will help to delete the node from linkedlist which matching with Given data.
     *
     * @param key
     */
    public void deleteNode(int key) {
        LinkedListNode cuurent = head, prev = null;
        //If the key is present at the head.
        if (cuurent != null && cuurent.data == key) {
            head = cuurent.next;
            return;
        }

        //Search for the key to be deleted, keep track of the previous node as we need to change temp.next
        while (cuurent != null && cuurent.data != key) {
            prev = cuurent;
            cuurent = cuurent.next;
        }
        //If key is not present in linkedlist
        if (cuurent == null) {
            return;
        }
        prev.next = cuurent.next;
    }

    /**
     * This method helps to delete the node from the given position.
     * @param position
     */
    public void dleteNodeFromPosition(int position) {
        if (position == 0) {
            return;
        }
        LinkedListNode current = head;
        if (position == 1) {
            head = current.next;
            return;
        }

        for (int i = 0; current != null && i < position - 1; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            return;
        }
        LinkedListNode next = current.next.next;
        current.next = next;
    }

    public void deleteList(){
        head=null;
    }

}
