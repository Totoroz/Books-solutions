package collections;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);
        System.out.println("Enter an expression with { [ ( ) ] }: ");
        String expression = consoleIn.nextLine();
        consoleIn.close();
        Stack<Character> parenthesis = new Stack<Character>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                parenthesis.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if (parenthesis.size() == 0) {
                    System.out.println("Not balanced!");
                    return;
                }
                char open = parenthesis.pop();
                if (!(open == '(' || ch == ')' || open == '[' && ch == ']' || open == '{' && ch == '}')) {
                    System.out.println("Not balanced");
                    return;
                }
            }
        }
        if (parenthesis.size() == 0) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not balanced");
        }
    }
}
