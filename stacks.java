import java.io.*;
import java.util.*;

class Test {

    // Push elements onto the stack
    static void stackPush(Stack<Integer> stack) {
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
    }

    // Pop elements from the stack
    static void stackPop(Stack<Integer> stack) {
        System.out.println("Pop operation");
        for (int i = 0; i < 10; i++) {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }

    // Display element on top of stack
    static void stackPeek(Stack<Integer> stack) {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on top of stack: " + element);
    }

    // Search for an element in the stack
    static void stackSearch(Stack<Integer> stack, int element) {
        int pos = (Integer) stack.search(element);

        if (pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at position: " + pos);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stackPush(stack);
        stackPop(stack);
        stackPush(stack);
        stackPeek(stack);
        stackSearch(stack, 7);
        stackSearch(stack, 4);
    }
}
