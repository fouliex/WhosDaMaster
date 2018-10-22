package com.practice.datastructure.linkedlist;

/**
 * Created by George Fouche on 10/15/18.
 */
public class Singlylinkedlist {
    private Node first;
    private Node last;


    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next =first;
        first = newNode;
    }

    public Node deleteFirst(){
        Node temp = first;
        first = first.next;
        return temp;
    }

    public void insertlast(int data){
        Node current = first;
        while(current!= null){
            current = current.next;
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;


    }

    public void displayList(){
        System.out.println("List (first -->last)");
        Node current = first;
        while(current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }
}
