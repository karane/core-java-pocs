package org.karane.creational.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        CarBuilder builder = new SportsCarBuilder();

        builder.setEngine("V8 Engine");
        builder.setSeats(2);
        builder.setGPS(true);

        Car car = builder.getResult();
        System.out.println(car);
    }
}
