package structural.bridge;

public class RemoteControl {

    private  Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public void turnOn() {
        this.device.turnOn();
    }

    public void turnOff () {
        this.device.turnOff();
    }

    public void setChannel (int channelNumber) {
        this.device.setChannel(channelNumber);
    }
}
