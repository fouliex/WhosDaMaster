package com.practice.datastructure.linkedlist;

/**
 * Created by George Fouche on 10/15/18.
 */
public class SingleLinkedListApp {
    public static void main(String[] args) {
        SingleLinkedList myList = new SingleLinkedList();
        myList.insertFirst(100);
        myList.insertFirst(50);
        //myList.deleteFirst();
       // myList.insertFirst(20);
       // myList.insertlast(90);

        myList.displayList();
    }
}
