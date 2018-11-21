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

    public int getSize() {
        return currentSize;
    }

    public boolean isEmpty() {
        return (currentSize == 0);
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

    private Node remove() {
        Node root = heapArray[0];
        currentSize--;
        heapArray[0] = heapArray[currentSize];

        trickleDown(0);
        return root;
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
            parentIndex = (parentIndex - 1) / 2;
        }
        heapArray[index] = nodeToInsert;
    }


    private void trickleDown(int index) {
        int largerChildIndex;
        Node top = heapArray[index]; // save last into top variable

        /**
         * Will run as long as index is not on the bottom row(at least 1 child)
         */
        while (index < currentSize / 2) {
            int leftChildIndex = 2 * index + 1; // left child index position
            int righChildIndex = leftChildIndex + 1; // right child index position


            //figure out which child is larger
            if (righChildIndex < currentSize &&
                    heapArray[leftChildIndex].getKey() < heapArray[righChildIndex].getKey()){
                largerChildIndex =righChildIndex;
            }else{
                largerChildIndex =leftChildIndex;
            }


            if(top.getKey() >= heapArray[largerChildIndex].getKey()){
                //successfully made root the largest key
                break;
            }

            heapArray[index] = heapArray[largerChildIndex];
            index = largerChildIndex; // go down

        }
        heapArray[index]= top;
    }

    public void displayHeap() {
        System.out.println("Heap Array: ");
        for(int m = 0; m < currentSize; m++) {
            if(heapArray[m] != null) {
                System.out.print( heapArray[m].getKey() + " ");
            }
            System.out.println();

            int nBlanks = 32;
            int itemsPerRow = 1;
            int column = 0;
            int j = 0; // current item

            String dots = "...............................";
            System.out.println(dots+dots);
            while(currentSize > 0) {
                if(column == 0) {
                    for(int k = 0; k < nBlanks; k++) {
                        System.out.print(" ");
                    }
                }
                System.out.print(heapArray[j].getKey());
                j++;
                if(j == currentSize) {
                    break;
                }

                column++;
                // end of row
                if(column == itemsPerRow) {
                    nBlanks = nBlanks/2; // half the blanks
                    itemsPerRow = itemsPerRow * 2;     // twice the items
                    column = 0;
                    System.out.println();
                } else {
                    for(int k=0; k<nBlanks*2; k++) {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println("\n"+dots+dots);
        }


    }
}
