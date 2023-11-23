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

        ll.insertAtPosition(32, 0);
        ll.insertAtPosition(25, 2);
        ll.traverse(); //
    }
}
