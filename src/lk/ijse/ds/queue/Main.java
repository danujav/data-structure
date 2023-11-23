package lk.ijse.ds.queue;

/*
    @author DanujaV
    @created 11/23/23 - 10:48 AM   
*/

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        queue.enQueue(60);

        System.out.println("size: " + queue.size());

        queue.printQueue(); //[10, 20, 30]

        System.out.println("deQueued: " + queue.deQueue());
        queue.printQueue(); //[20, 30]

        System.out.println("Peeked: " + queue.peek()); //20

        queue.clear();
        queue.printQueue(); //[Empty queue]
    }
}
