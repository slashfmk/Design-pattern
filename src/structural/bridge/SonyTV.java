package structural.bridge;

public class SonyTV implements Device {
    @Override
    public void turnOn() {
        System.out.println("Sony Tv turned On");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony Tv turned Off");
    }

    @Override
    public void setChannel(int channelNumber) {
        System.out.println("Sony Tv switch to channel " + channelNumber);
    }
}
