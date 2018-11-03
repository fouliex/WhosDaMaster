package com.practice.datastructure.linkedlist;

public class DoubleLinkedList {

    public class Node {
        public int data;
        public Node next;
        public Node previous;

        public void displayNode() {
            System.out.println("{ " + data + " } ");
        }
    }

    private Node first;
    private Node last;

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            last = newNode;
        } else {
            first.previous = newNode;
        }

        newNode.next = first;

    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
        }
        last = newNode;
    }

    // assume non-empty list
    public Node deleteFirst() {
        Node temp = first;
        if (first.next == null) { // there is only one item in the list
            last = null;
        } else {
            first.next.previous = null; // the list's first node will point to null
        }

        first = first.next;
        return temp; // return the deleted old first node
    }

    // assume non-empty list
    public Node deleteLast(){
        Node temp = last;
        if(first.next ==null){
            first = null;
        }else{
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

}
