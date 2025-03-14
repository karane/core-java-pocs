package org.karane.behavioral.iterator;

class CustomList<T> implements IterableCollection<T> {
    private final T[] items;

    @SafeVarargs
    public CustomList(T... items) {
        this.items = items;
    }

    @Override
    public CustomIterator<T> createIterator() {
        return new CustomListIterator();
    }

    private class CustomListIterator implements CustomIterator<T> {
        private int index = 0;  // Keeps track of the current position

        @Override
        public boolean hasNext() {
            return index < items.length;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new IllegalStateException("No more elements.");
            }
            return items[index++];
        }
    }
}
