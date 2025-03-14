package org.karane.creational.builder;

class Car {
    private String engine;
    private int seats;
    private boolean GPS;

    public void setEngine(String engine) { this.engine = engine; }
    public void setSeats(int seats) { this.seats = seats; }
    public void setGPS(boolean GPS) { this.GPS = GPS; }

    @Override
    public String toString() {
        return "Car [Engine=" + engine + ", Seats=" + seats + ", GPS=" + GPS + "]";
    }
}
