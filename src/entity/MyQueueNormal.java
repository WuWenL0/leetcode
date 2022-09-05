package entity;

import java.util.Stack;

public class MyQueueNormal {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;


    public MyQueueNormal() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int temp = stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return temp;
    }

    public int peek() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int temp = stack2.peek();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return temp;
    }

    public boolean empty() {
        return stack1.isEmpty();
    }
}