package org.karane.behavioral.iterator;

public class CustomIteratorDemo {
    public static void main(String[] args) {
        CustomList<String> myList = new CustomList<>("A", "B", "C", "D");

        CustomIterator<String> iterator = myList.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
