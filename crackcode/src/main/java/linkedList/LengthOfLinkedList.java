package linkedList;

public class LengthOfLinkedList {

    public static int length(LinkedListNode head){
        LinkedListNode current=head;
        int count=0;
        while (current.next!=null){
            count++;
            current=current.next;
        }
        return count;
    }

    public static int lengthRecursive(LinkedListNode head){
        if(head==null){
            return 0;
        }else{
            return 1+lengthRecursive(head.next);
        }
    }

}
