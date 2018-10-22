package com.practice.datastructure.queue;

/**
 * Created by George Fouche on 10/18/18.
 */
public class App {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.insert(100);
        queue.insert(10);
        queue.insert(25);
        queue.remove();
        System.out.println(queue.peekFront());
        queue.view();
    }
}
