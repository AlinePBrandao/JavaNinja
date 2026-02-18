package Review.StackReview;

import java.util.Stack;

public class Program {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Harry");
        stack.push("Hermione");
        stack.push("Rone");
        stack.push("Draco");
        stack.push("Luna");

        System.out.println("Minha Stack Atual: " + stack);

        //System.out.println(stack.pop());
    }
}
