package org.karane.structural.bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl remote = new BasicRemote(tv);
        remote.turnOn();
        remote.setVolume(10);
        remote.turnOff();

        Device radio = new Radio();

        RemoteControl radioRemote = new BasicRemote(radio);
        radioRemote.turnOn();
        radioRemote.setVolume(10);
        radioRemote.turnOff();
    }
}
