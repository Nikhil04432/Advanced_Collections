package Stack;

import java.util.Stack;

public class StackDemo{
    public static void main(String[] args) {

        // Create a Stack
        Stack<Integer> stack = new Stack<>();

        // 1. Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("After pushing: " + stack);  // [10, 20, 30]

        // 2. Peek the top element
        System.out.println("Top element (peek): " + stack.peek());  // 30

        // 3. Pop the top element
        int popped = stack.pop();
        System.out.println("Popped element: " + popped);  // 30
        System.out.println("After popping: " + stack);    // [10, 20]

        // 4. Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());  // false

        // 5. Check the size
        System.out.println("Stack size: " + stack.size());  // 2

        // 6. Search an element (returns 1-based index from top)
        System.out.println("Position of 10 from top: " + stack.search(10));  // 2
        System.out.println("Position of 100 from top: " + stack.search(100));  // -1

        // 7. Clear the stack
        stack.clear();
        System.out.println("After clearing: " + stack);  // []
    }
}


