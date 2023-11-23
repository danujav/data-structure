package lk.ijse.ds.queue;

/*
    @author DanujaV
    @created 11/23/23 - 10:48 AM   
*/

public class Queue {
    private int[] elementData;
    private int front;
    private int rear;

    public Queue(final int initialCapacity){
        elementData = new int[initialCapacity];
        front = -1;
        rear = -1;
    }

    public void enQueue(int data) {
        if(front == -1)
            front = 0;
        elementData[++rear] = data;
    }

    public void printQueue() {
        System.out.print("[");
        for (int i = front; i <= rear; i++) {
            System.out.print(elementData[i] + ", ");
        }
        System.out.print("\b\b]");
    }
}
