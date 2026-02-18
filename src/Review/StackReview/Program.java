package Review.StackReview;

import java.util.Scanner;
import java.util.Stack;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<String> stack = new Stack<>();

        stack.push("Harry");
        stack.push("Hermione");
        stack.push("Rone");
        stack.push("Draco");
        stack.push("Luna");

        System.out.println("Minha Stack Atual: " + stack);

        //System.out.println(stack.pop());

        sc.close();
    }
}
