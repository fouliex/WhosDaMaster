package com.practice.datastructure.hashtable;



/**
 * Created by George Fouche on 11/23/18.
 */
public class App {

    public static void main(String[] args) {
        HashTable table = new HashTable(19);
        table.insert("Apple");
        table.insert("Hello");
        table.insert("Feeling");
        table.insert("Water");
        table.insert("Africa");
        table.insert("Zebra");

        table.displayTable();
        System.out.println(table.find("Apple"));
        System.out.println(table.find("Zebra"));

}
}
