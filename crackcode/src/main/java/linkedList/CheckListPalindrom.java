package linkedList;

import java.util.Stack;

public class CheckListPalindrom {

    public boolean isListPalindrom(LinkedListNode head) {
        LinkedListNode current = head;
        boolean isPalindrom = false;
        Stack<Integer> stack = new Stack();
        while (current != null) {
            stack.push(current.data);
            current = current.next;
        }
        current = head;
        while (current != null) {
            if (current.data == stack.pop()) {
                isPalindrom = true;
            } else {
                isPalindrom = false;
                break;
            }
            current = current.next;
        }
        return isPalindrom;
    }
}
