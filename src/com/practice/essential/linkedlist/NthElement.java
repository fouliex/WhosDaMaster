package com.practice.essential.linkedlist;

/**
 * Implement a function that finds the nth node in a linked list, counting from the end.
 * <p>
 * Your function should take a linked list(its head element) and n, a positive integer as its arguments.
 * <p>
 * Example:
 * <p>
 * head = 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1 -> null
 * The third element of head counting from the end is 3.
 * <p>
 * head2 = 1 -> 2 ->3 -> 4 -> null
 * <p>
 * The fourth element of head2 counting form the end is 1
 * <p>
 * <p>
 * if the given n is larger than the number of nodes in the list, return null
 */
public class NthElement {
    public static class Node {
        int value;
        Node next;

    }

    public static class SingleLinkedList {
        private Node first;

        public void insertFirst(int value){
            Node newNode = new Node();
            newNode.value = value;
            newNode.next = first;
            first = newNode;
        }

        public Node nthFromLast( int nthNode){
             Node left = first;
             Node right = first;

             //First make sure that we have at least n items in the linked List
            for(int i =0; i < nthNode;i++){
                if (right == null) return null;
                right = right.next;
            }
            while (right != null){
                right = right.next;
                left = left.next;
            }
            return left;
        }
    }


    public static void main(String[] args) {

        SingleLinkedList list = new SingleLinkedList();
        for(int i =1; i<8;i++){
            list.insertFirst(i);
        }

        Node  left = list.nthFromLast(3);
        System.out.println(left.value);


    }
}
