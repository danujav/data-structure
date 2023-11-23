package lk.ijse.ds.stack;

/*
    @author DanujaV
    @created 11/23/23 - 9:12 AM   
*/

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printStack();

        System.out.println("Popped: " + stack.pop());
        stack.printStack();

        System.out.println("Popped: " + stack.pop());
        stack.printStack();
    }
}
