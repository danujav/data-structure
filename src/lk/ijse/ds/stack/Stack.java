package lk.ijse.ds.stack;

/*
    @author DanujaV
    @created 11/23/23 - 9:12 AM   
*/

public class Stack {
    private int[] elementData;
    private int top;    // points to the top of the stack(last element)

    public Stack(final int initialCapacity) {
        elementData = new int[initialCapacity];
        top = -1;
    }

    public void push(int data) {
        elementData[++top] = data;
    }

    public int pop() {
        return elementData[top--];
    }

    public int peek() { //top
        return elementData[top];
    }

    public void printStack() {
        System.out.print("[");
        for (int i = 0; i <= top; i++) {
            System.out.print(elementData[i] + ", ");
        }
        System.out.println("\b\b]");
    }
}
