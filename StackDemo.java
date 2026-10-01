import java.util.Stack;

class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("Stack: " + stack);

        stack.pop(); // removes top element (C)
        System.out.println("After pop: " + stack);

        System.out.println("Top element: " + stack.peek());
    }
}