package com.practice.datastructure.queue;

/**
 * Created by George Fouche on 10/18/18.
 */
public class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;


    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = new int [maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(int data) {
        if (rear == maxSize -1){
            rear = -1;
        }
        rear++;
        queueArray[rear]=data;
        nItems++;
    }

    public int remove(){
        int temp = queueArray[front];
        front++;
        if(front == maxSize){
            front =0;
        }
        nItems--;
        return temp;
    }

    public int peekFront(){return queueArray[front];}

    public boolean isEmpty (){ return nItems == 0;}
    public boolean isFull() {return nItems == maxSize;}

    public void view(){
        System.out.print("[ ");
        for(int i = 0; i < queueArray.length; i++){
            System.out.print(queueArray[i]+ " ");
        }
        System.out.print("]");
    }
}
