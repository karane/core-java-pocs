package org.karane.structural.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");
        // Image is not loaded yet.
        image.display(); // Loads and displays the image.
        image.display(); // Displays the image without loading again.
    }
}
