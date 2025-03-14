package org.karane.creational.builder;

class SportsCarBuilder implements CarBuilder {
    private Car car = new Car();

    public void setEngine(String engine) { car.setEngine(engine); }
    public void setSeats(int seats) { car.setSeats(seats); }
    public void setGPS(boolean GPS) { car.setGPS(GPS); }

    public Car getResult() { return car; }
}
