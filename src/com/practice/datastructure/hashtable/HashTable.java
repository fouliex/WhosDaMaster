package com.practice.datastructure.hashtable;

/**
 * This HashTable uses double hashing strategy to deal with collisions.
 * If 2 or 3 items are trying to get into the same slot we would move them
 * in another open address somewhere.
 *
 * Other HashTable t to look into is Seperate Chaining
 * Created by George Fouche on 11/23/18.
 */
public class HashTable {

    String[] hashArray;
    int arraySize;
    int size = 0; // Counter for number of elements in the hash table


    public HashTable(int noOfSlots) {


        if (isPrime(noOfSlots)) {
            this.hashArray = new String[noOfSlots];
            arraySize = noOfSlots;

        } else {
            int primeCount = getNextPrime(noOfSlots);
            hashArray = new String[primeCount];
            arraySize = primeCount;

            System.out.println("Hash table size given " + noOfSlots + " is not a prime");
            System.out.println("Hash table size changed to " + primeCount);
        }

    }

    private int getNextPrime(int minNumber) {
        for (int i = minNumber; true; i++) {
            if (isPrime(i)) {
                return i;
            }
        }
    }

    private boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Return preferred index position
     *
     * @param word
     * @return
     */
    private int hashFunc1(String word) {
        int hashVal = word.hashCode();
        hashVal = hashVal % arraySize;
        // Java can return -1 number so we need to check
        if (hashVal < 0) {
            hashVal += arraySize;
        }
        return hashVal; // ideal index position we would like to insert or search in
    }

    /**
     * Return the step size greater than 0
     *
     * @param word
     * @return
     */
    private int hashFunc2(String word) {
        int hashVal = word.hashCode();
        hashVal = hashVal % arraySize;

        if (hashVal < 0) {
            hashVal += arraySize;
        }
        // Use a prime number less than array size
        return 3 - hashVal % 3;
    }


    public void insert(String word) {
        int hashVal = hashFunc1(word);
        int stepSize = hashFunc2(word);

        while (hashArray[hashVal] != null) {
            hashVal = hashVal + stepSize;
            hashVal = hashVal % arraySize;
        }

        hashArray[hashVal] = word;
        System.out.println("Inserted Word: " + word);
        size++;
    }

    public String find(String word) {
        int hashVal = hashFunc1(word);
        int stepSize = hashFunc2(word);

        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].equals(word)) {
                return hashArray[hashVal];
            }
            hashVal = hashVal + stepSize;
            hashVal = hashVal % arraySize;

        }
        return hashArray[hashVal];
    }

    public void displayTable(){
        System.out.println("Table: " );
        for( int i = 0 ; i < arraySize;i++){
            if(hashArray[i] != null){
                System.out.print(hashArray[i] + " ");
            } else{
                System.out.print("** ");
            }
            System.out.println();
        }
    }
}
