package linkedList;

public class FindNode {

    LinkedListNode head;

    /**
     * @param position
     * @return
     */
    public LinkedListNode getNthNode(int position) {
        LinkedListNode current = head;
        int count = 0;
        while (current != null) {
            count++;
            if (count == position) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    /**
     * @param head
     * @param position
     * @return
     */
    public int getNthNode(LinkedListNode head, int position) {
        int count = 1;
        if (count == position) {
            return head.data;
        }
        return getNthNode(head.next, position - 1);
    }

    public LinkedListNode getNthNodeFromEnd(LinkedListNode head, int position) {
        int length = LengthOfLinkedList.lengthRecursive(head);
        if (length < position) {
            return null;
        }
        LinkedListNode current = head;
        int count = 0;
        while (current != null) {
            count++;
            if (count == length - position + 1) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public int getNthNodeFromLast(int position) {
        int length = 0;
        LinkedListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        if (length < position) {
            return -1;
        }
        current = head;
        for (int i = 0; i < length - position + 1; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int getMiddleNode() {
        LinkedListNode current = head;
        int length = 0;
        while (current != null) {
            length++;
            current = current.next;
        }
        current = head;
        for (int i = 0; i < length / 2 - 1; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int getMiddleNode(LinkedListNode head) {
        LinkedListNode slower = head;
        LinkedListNode faster = head;
        if (head!=null){
            while (faster!=null&&faster.next!=null){
                slower=slower.next;
                faster=faster.next.next;
            }
        }
        return slower.data;
    }
}
