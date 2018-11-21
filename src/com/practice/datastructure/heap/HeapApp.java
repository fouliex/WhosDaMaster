package com.practice.datastructure.heap;

/**
 * Created by George Fouche on 11/20/18.
 */
public class HeapApp {
    public static void main(String[] args) {
        Heap heap = new Heap(10);
        System.out.println(heap.insert(10));
        System.out.println(heap.insert(12));
        System.out.println(heap.insert(42));
        System.out.println(heap.insert(35));
        System.out.println(heap.insert(16));
        System.out.println(heap.insert(88));
        System.out.println(heap.insert(42));
        System.out.println(heap.insert(7));

        heap.displayHeap();



    }
}
