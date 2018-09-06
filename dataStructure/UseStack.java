package dataStructure;

import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("New York");
        stack.push("Boston");
        stack.push("Seattle");
        stack.push("Los Anglos");

/*
        if(stack.peek().equalsIgnoreCase("Boston")) {
            System.out.println(stack.pop());

        }
*/

        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
