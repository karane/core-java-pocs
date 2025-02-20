package org.karane.syncronized;

class TicketCounter {
    private int availableSeats = 3;

    public void bookTicket(String name, int seats) {
        System.out.println(name + " is trying to book " + seats + " seat(s).");

        synchronized (this) { // apply just for this code block
            if (availableSeats >= seats) {
                availableSeats -= seats;
                System.out.println(name + " successfully booked " + seats + " seat(s). Seats left: " + availableSeats);
            } else {
                System.out.println(name + " booking failed. Not enough seats.");
            }
        }
    }
}

public class SynchronizedTicketBooking {
    public static void main(String[] args) throws InterruptedException {
        TicketCounter counter = new TicketCounter();

        Thread t1 = new Thread(() -> counter.bookTicket("Alice", 2));
        Thread t2 = new Thread(() -> counter.bookTicket("Bob", 2));

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
