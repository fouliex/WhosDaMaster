package com.practice.leetcode.linkedlist;

/**
 * leetcode: https://leetcode.com/problems/delete-node-in-a-linked-list/
 * Created by George Fouche on 12/19/18.
 */
public class DeleteNodeInALinkedList {

    public class ListNode {
        int val;
        ListNode next;


        public ListNode(int val) {
            this.val = val;
        }

        public void displayNode() {
            System.out.println("{ "+ val + " } ");
        }
    }

    private ListNode first;

    public void insertFirst(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = first;
        first = newNode;
    }

    /**
     * Leetcode parameter
     * @param node
     */
    public  void deleteNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public  ListNode deleteFirst(){
        ListNode temp = first;
        first = first.next;
        return temp;
    }

    public void displayList(){
        ListNode current = first;
        while (current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DeleteNodeInALinkedList theNode = new DeleteNodeInALinkedList();
        theNode.insertFirst(1);
        theNode.insertFirst(2);
        theNode.insertFirst(3);
        theNode.displayList();
        theNode.deleteNode(theNode.first);
        theNode.displayList();
        theNode.deleteFirst();
        theNode.displayList();


    }
}
