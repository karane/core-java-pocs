package org.karane.behavioral.iterator;

interface IterableCollection<T> {
    CustomIterator<T> createIterator();
}
