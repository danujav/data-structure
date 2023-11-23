package lk.ijse.ds.linkedlist;

/*
    @author DanujaV
    @created 11/23/23 - 12:41 PM   
*/

/*class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }
}*/
public class LinkedList {
    private static class Node {
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
        }

    }
    private Node head;

    public void insertAtBeginning(int data) {
        Node node = new Node(data);

        node.next = head;
        head = node;
    }

    public void insertAtEnding(int data) {
        Node node = new Node(data);

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }
}
