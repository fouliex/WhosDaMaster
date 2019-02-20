package com.practice.leetcode.linkedlist;

/**
 * Given a linked list, remove the n-th node from the end of the list and return its head.
 * Leetcode: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * Created by George Fouche on 12/19/18.
 */
public class RemoveNthNodeFromEndOfList {
    public class ListNode{
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }

        public void displayNode() {
            System.out.println(val);
        }
    }

    private ListNode first;

    public void insert( int data){
        ListNode newNode = new ListNode(data);
        newNode.next = first;
        first = newNode;
    }
    // TODO
    public  ListNode removeNthFromEnd(ListNode head, int n){
        ListNode dummy = new ListNode(0);


        return null;
    }


    private void displayNode() {
        ListNode current = first;
        while(current != null){
            current.displayNode();
            current = current.next;
        }
    }

    public static void main(String[] args) {
        RemoveNthNodeFromEndOfList theNode = new RemoveNthNodeFromEndOfList();
        theNode.insert(1);
        theNode.insert(2);
        theNode.insert(3);
        theNode.displayNode();
        theNode.removeNthFromEnd(theNode.first,3);

    }

}
