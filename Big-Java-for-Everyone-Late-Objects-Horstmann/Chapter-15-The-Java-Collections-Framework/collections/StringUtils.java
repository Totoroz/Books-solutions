package collections;

import java.util.Stack;

public class StringUtils {
    public static String reverseByPeriod(String string) {
        String outputString = "";
        String[] subsentences = string.split("\\.");
        Stack<String> stack = new Stack<String>();
        for (String sentence : subsentences) {
            for (String word : sentence.split("\\s+")) {
                stack.push(word);
            }
            int initStackSize = stack.size();
            while (stack.size() > 0) {
                String word = stack.pop();
                if (stack.size() + 1 == initStackSize) {
                    outputString += word.substring(0, 1).toUpperCase() + word.substring(1);
                    outputString += " ";
                } else if (stack.size() == 1) {
                    outputString += word + " ";
                } else if (stack.size() == 0) {
                    outputString += word.substring(0, 1).toLowerCase() + word.substring(1) + ".";
                } else {
                    outputString += word + " ";
                }
            }
        }
        return outputString;
    }

    public static void main(String[] args) {
        String string = "Mary had a little lamb.Its fleece was white as snow.";
        System.out.println(reverseByPeriod(string));
    }
}
