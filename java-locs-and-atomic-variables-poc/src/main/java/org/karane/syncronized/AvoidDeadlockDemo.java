package org.karane.syncronized;

class Resource {
    private final String name;

    public Resource(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class AvoidDeadlockDemo {
    public static void main(String[] args) throws InterruptedException {
        Resource r1 = new Resource("Resource 1");
        Resource r2 = new Resource("Resource 2");

        Thread t1 = new Thread(() -> safeTransfer(r1, r2), "Thread-1");
        Thread t2 = new Thread(() -> safeTransfer(r2, r1), "Thread-2");

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }

    public static void safeTransfer(Resource r1, Resource r2) {
        Resource first = r1.hashCode() < r2.hashCode() ? r1 : r2;
        Resource second = r1.hashCode() < r2.hashCode() ? r2 : r1;

        synchronized (first) {
            System.out.println(Thread.currentThread().getName() + " locked " + first.getName());

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (second) {
                System.out.println(Thread.currentThread().getName() + " locked " + second.getName());
                System.out.println(Thread.currentThread().getName() + " successfully transferred resources.");
            }
        }
    }
}
