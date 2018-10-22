package com.practice.datastructure.stack;

/**
 * Created by George Fouche on 10/16/18.
 */
public class App {

    public static void main(String[] args) {
        Stack theStack = new Stack(3);
        theStack.push(20);
        System.out.println(theStack.pop());
        theStack.push(10);
        System.out.println(theStack.peak());
    }
}
