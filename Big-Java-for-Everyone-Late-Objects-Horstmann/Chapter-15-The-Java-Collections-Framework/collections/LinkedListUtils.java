package collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class LinkedListUtils {
    public static void downSize(LinkedList<String> list, int size) {
        LinkedList<String> outputList = new LinkedList<String>();
        int i = 0;
        while (i <= size) {
            outputList.add(list.pollFirst());
            i += 1;
        }
        list = outputList;
    }

    public static void reverse(LinkedList<String> list) {
        LinkedList<String> outputList = new LinkedList<String>();
        Stack<String> stack = new Stack<String>();
        for (String string : list) {
            stack.push(string);
        }
        list.clear();
        while (stack.size() > 0) {
            list.add(stack.pop());
        }
        list = outputList;
    }

    public static void main(String[] args) {
        LinkedList<String> fullList = new LinkedList<String>(Arrays.asList("Potato", "Tomato", "Apple"));
        System.out.println(fullList);
        reverse(fullList);
        System.out.println(fullList);


    }
}
