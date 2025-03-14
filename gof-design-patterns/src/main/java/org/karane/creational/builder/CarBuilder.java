package org.karane.creational.builder;

interface CarBuilder {
    void setEngine(String engine);

    void setSeats(int seats);

    void setGPS(boolean GPS);

    Car getResult();
}
