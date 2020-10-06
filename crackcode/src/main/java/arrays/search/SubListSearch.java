package arrays.search;

public class SubListSearch {
    static class Node {
        int data;
        Node next;
    }

    public static void printList(Node current) {
        while (current != null) {
            System.out.println("%d" + current.data);
            current = current.next;
        }
    }

    static Node createNode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.next = null;
        return temp;
    }

    public static boolean findList(Node first, Node second) {
        if (first == null && second == null) {
            return true;
        }
        if (first == null || (first != null && second == null)) {
            return false;
        }
        Node ptr1 = first, ptr2 = second;
        while (second != null) {
            // Initialize ptr2 with current node of second
            ptr2 = second;
            // Start matching first list with second list
            while (ptr1 != null) {
                // If second list becomes empty and first not then return false
                if (ptr2 == null) {
                    return false;
                }
                // If data part is same, go to next of both lists
                else if (ptr1.data == ptr2.data) {
                    ptr1 = ptr1.next;
                    ptr2 = ptr2.next;
                }
                // If not equal then break the loop
                else {
                    break;
                }
            }
            // Return true if first list gets traversed completely that means it is matched.
            if (ptr1 == null) {
                return true;
            }
            // Initialize ptr1 with first again
            ptr1 = first;
            // And go to next node of second list
            second = second.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node a = createNode(1);
        a.next = createNode(2);
        a.next.next = createNode(3);
        a.next.next.next = createNode(4);

        Node b = createNode(1);
        b.next = createNode(2);
        b.next.next = createNode(1);
        b.next.next.next = createNode(2);
        b.next.next.next.next = createNode(3);
        b.next.next.next.next.next = createNode(4);
        if (findList(a, b)) {
            System.out.println("LIST FOUND");
        } else {
            System.out.println("LIST NOT FOUND");
        }
    }
}

