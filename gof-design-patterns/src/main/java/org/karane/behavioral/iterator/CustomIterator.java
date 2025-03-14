package org.karane.behavioral.iterator;

interface CustomIterator<T> {
    boolean hasNext();  // Checks if there is a next element

    T next();           // Retrieves the next element
}
