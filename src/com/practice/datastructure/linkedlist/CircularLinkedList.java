package com.practice.datastructure.linkedlist;

public class CircularLinkedList {

    public class Node {
        public int data;
        public Node next;

        public void displayNode() {
            System.out.println("{ " + data + " } ");
        }
    }

    private Node first;
    private Node last;

    private boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            last = newNode;
        }
        newNode.next = first;
        first = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    public int deleteFirst(int data) {
        int temp = first.data;
        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }


    public void displayList(){
        System.out.println("List (first -->last)");
        CircularLinkedList.Node current = first;
        while(current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }
}
