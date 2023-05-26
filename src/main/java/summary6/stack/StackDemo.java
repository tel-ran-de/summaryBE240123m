package summary6.stack;

import java.util.Stack;

// LIFO - last In first OUT

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        System.out.println(stack.isEmpty());


        stack.push("I");
        stack.push("love");
        stack.push("Java");

        System.out.println(stack);

        String str = stack.peek();

        System.out.println(str);
        System.out.println(stack);

        while (!stack.isEmpty()) {

        str = stack.pop();
        System.out.println(str);
        System.out.println(stack);
        }





    }
}
