package linkedList;

/**
 * A node can be added in three ways
 * 1) At the front of the linked list. push()
 * 2) After a given node. insertAfter()
 * 3) At the end of the linked list. append()
 */
public class InsertNode {
    LinkedListNode head;

    public void push(int dataToInsert) {
        //Allocate the TreeNode & Put in the data
        LinkedListNode nodeToInsert = new LinkedListNode(dataToInsert);
        //Make next of new TreeNode as head
        nodeToInsert.next = head;
        //Move the head to point to new TreeNode
        head = nodeToInsert;
    }

    public void insertAfter(LinkedListNode prev_node,int dataToInsert){
        if(prev_node==null){
            System.out.println("The given previous node cannot be null");
            return;
        }
        //Allocate the TreeNode & Put in the data
        LinkedListNode nodeToInsert = new LinkedListNode(dataToInsert);
        //Make next of new TreeNode as next of prev_node
        nodeToInsert.next=prev_node.next;
        //make next of prev_node as new_node
        prev_node.next=nodeToInsert;
    }

    public void append(int dataToInsert ){
        //Allocate the TreeNode & Put in the data
        LinkedListNode nodeToInsert = new LinkedListNode(dataToInsert);
        //If the Linked List is empty, then make the new node as head
        if(head==null){
            head=new LinkedListNode(dataToInsert);
            return;
        }
        //This new node is going to be the last node, so make next of it as null
        nodeToInsert.next=null;
        //Else traverse till the last node
        LinkedListNode current=head;
        while (current.next!=null) {
            current = current.next;
        }
            current.next=nodeToInsert;
            return;
    }

    public void printList() {
        LinkedListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        /* Start with the empty list */
        InsertNode llist = new InsertNode();

        // Insert 6.  So linked list becomes 6->NUllist
        llist.append(6);

        // Insert 7 at the beginning. So linked list becomes
        // 7->6->NUllist
        llist.push(7);

        // Insert 1 at the beginning. So linked list becomes
        // 1->7->6->NUllist
        llist.push(1);

        // Insert 4 at the end. So linked list becomes
        // 1->7->6->4->NUllist
        llist.append(4);

        // Insert 8, after 7. So linked list becomes
        // 1->7->8->6->4->NUllist
        llist.insertAfter(llist.head.next, 8);

        System.out.println("\nCreated Linked list is: ");
        llist.printList();
    }

}
