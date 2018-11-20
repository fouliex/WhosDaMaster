package com.practice.datastructure.heap;

/**
 * Created by George Fouche on 11/20/18.
 */
public class Heap {

    private Node[] heapArray;

    class Node {
        private int key;

        public Node(int key) {
            this.key = key;
        }

        public int getKey() {
            return key;

        }
    }

    private int maxSize;
    private int currentSize;// number of nodes in the array

    public Heap(int size) {
        this.maxSize = size;
        currentSize = 0;
        heapArray = new Node[size];
    }

    public boolean insert(int key) {
        if (currentSize == maxSize) {
            return false;
        }
        Node newNode = new Node(key);
        heapArray[currentSize] = newNode;

        trickleUp(currentSize);
        currentSize++;
        return true;

    }

    private void trickleUp(int index) {
        int parentIndex = (index - 1) / 2;
        Node nodeToInsert = heapArray[index];

        /**
         * Loop as long as we haven't reached the root and key
         * of nodeToInsert's parent is less than new node
         */
        while (index > 0 && heapArray[parentIndex].getKey() < nodeToInsert.getKey()) {
            heapArray[index] = heapArray[parentIndex];
            index = parentIndex;
            parentIndex = (parentIndex-1)/2;
        }
        heapArray[index] = nodeToInsert;


    }
}
