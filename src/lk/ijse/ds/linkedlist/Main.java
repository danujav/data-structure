package lk.ijse.ds.linkedlist;

/*
    @author DanujaV
    @created 11/23/23 - 12:41 PM   
*/

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtBeginning(10);
        ll.insertAtBeginning(20);
        ll.insertAtBeginning(30);

        ll.insertAtEnding(40);

        ll.traverse();

        ll.insertAtPosition(25, 2);
        ll.traverse(); //

        ll.deleteAtBeginning();
        ll.traverse();

        ll.deleteAtEnding();
        ll.traverse(); //[20, 25, 40]

        ll.deleteAtPosition(1);
        ll.traverse(); //[20, 10]

        System.out.println("size: " + ll.size());

        ll.insertAtEnding(100);

        ll.traverse();  //[20, 10, 100]

        int data = ll.get(0);
        System.out.println("data: " + data); //10

        ll.clear();
        ll.traverse(); //[Empty list]
    }
}

// Singly linked-list
// Doubly linked-list
// Circular linked-list