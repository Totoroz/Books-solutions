package collections;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> pancakes = new Stack<String>();
        pancakes.push("A");
        pancakes.push("B");
        pancakes.push("C");
        while (pancakes.size() > 0) {
            System.out.println(pancakes.pop());
        }
    }
}
