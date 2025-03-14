package org.karane.structural.bridge;

abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    abstract void turnOn();

    abstract void turnOff();

    abstract void setVolume(int volume);
}
