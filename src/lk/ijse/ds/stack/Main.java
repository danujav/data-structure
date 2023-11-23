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
        stack.push(40);
        stack.push(50);
        stack.push(60);

        System.out.println("Peeked: " + stack.peek());
        System.out.println("size: " + stack.size()); //3

        stack.printStack();

        System.out.println("Popped: " + stack.pop());
        stack.printStack();

        System.out.println("Popped: " + stack.pop());
        stack.printStack();

        System.out.println("Peeked: " + stack.peek());
        System.out.println("size: " + stack.size()); //3

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.printStack();

        stack.pop();

        stack.push(100);
        stack.push(200);

        stack.printStack(); //[100, 200]

        stack.clear();
        stack.printStack(); //[Empty stack]
    }
}
