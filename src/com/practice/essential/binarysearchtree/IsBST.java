package com.practice.essential.binarysearchtree;

/**
 * Write a function that takes a binary tree and returns true if it is a binary search tree,
 * and false if not.
 *
 * In out test code, we're going to use the following examples:
 *
 * head1 =
 *      0
 *    /  \
 *   1   2
 *  /\  /\
 *  3 4 5 6
 *
 *
 *   head2 =
 *        3
 *      /  \
 *     1    2
 *    /\   /\
 *   0 2   5 6
 *  *
 */
public class IsBST {

    public class Node {
        int key;
        Node leftchild;
        Node rightChild;
    }

    private Node root;

}
