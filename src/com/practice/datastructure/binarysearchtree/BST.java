package com.practice.datastructure.binarysearchtree;

/**
 * Created by George Fouche on 11/1/18.
 */
public class BST {

    private Node root;

    public void insert(int key, String value) {
        Node newNode = new Node(key,value);

        if(root == null){
            root = newNode;
        }else{
            Node current = root;
            Node parent;

            while(true){
                parent = current;
                if(key < current.key){
                    current = current.leftChild;
                    if(current == null){
                        parent.leftChild=newNode;
                        return;
                    }
                }else{
                    current =current.rightChild;
                    if(current==null){
                        parent.rightChild=newNode;
                        return;
                    }
                }
            }
        }
    }
}
