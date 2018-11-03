package com.practice.datastructure.stack;

/**
 * Created by George Fouche on 10/16/18.
 */
public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int stackSize) {
         this.maxSize = stackSize;
         this.stackArray = new int[maxSize];
         this.top = -1;

    }

    public void push(int data) {
        if(isFull()){
            System.out.println("this stack is already full");
        }else {
            top++;
            stackArray[top] = data;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("this stack is empty");
            return -1;
        }else{
            int old_top = top;
            top--;
            return stackArray[old_top];
        }
    }


    public int peak(){return stackArray[top];}
    private boolean isEmpty() {return (top == -1);}
    private boolean isFull() { return (maxSize -1 == top);}
}
