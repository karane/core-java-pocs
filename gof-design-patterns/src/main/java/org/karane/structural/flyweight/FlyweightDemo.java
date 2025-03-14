package org.karane.structural.flyweight;

public class FlyweightDemo {
    public static void main(String[] args) {
        Circle redCircle1 = ShapeFactory.getCircle("Red");
        redCircle1.draw(10, 10);

        Circle redCircle2 = ShapeFactory.getCircle("Red");
        redCircle2.draw(20, 20);

        Circle blueCircle = ShapeFactory.getCircle("Blue");
        blueCircle.draw(30, 30);
    }
}
