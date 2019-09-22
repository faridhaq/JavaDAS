package com.faridhaque;

import java.util.Stack;

public class QueueStack {
    private Stack<Integer> Stack1 = new Stack<>();
    private Stack<Integer> Stack2 = new Stack<>();

    public void StackEnque(int item) {
        Stack1.push(item);
    }

    public int StackDeque() {
       if(Stack1.empty() && Stack2.empty())
           throw new IllegalStateException();
        if (Stack2.empty()) {
            while (!Stack1.empty()) {
                Stack2.push(Stack1.pop());
            }

        }return Stack2.pop();

    }

}