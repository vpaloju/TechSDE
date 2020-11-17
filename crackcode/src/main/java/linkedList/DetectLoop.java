package linkedList;

import java.util.HashSet;
import java.util.Set;

public class DetectLoop {

    public boolean detectLoop(LinkedListNode head) {
        LinkedListNode slowPointer = head;
        LinkedListNode fastPointer = head;
        while (slowPointer != null && fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer) {
                System.out.println("Found loop");
                return true;
            }
        }
        return false;
    }

    public boolean detectLoopHashing(LinkedListNode head) {
        Set<LinkedListNode> set = new HashSet<>();
        if (head != null) {
            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }
}
