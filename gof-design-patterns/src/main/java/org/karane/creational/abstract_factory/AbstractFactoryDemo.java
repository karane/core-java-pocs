package org.karane.creational.abstract_factory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {

        System.out.println("\nUsing WindowsFactory: ");
        GUIFactory factory = new WindowsFactory();
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.click();
        checkbox.check();


        System.out.println("\nUsing MacFactory: ");
        factory = new MacFactory();
        button = factory.createButton();
        checkbox = factory.createCheckbox();

        button.click();
        checkbox.check();
    }
}
