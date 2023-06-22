package structural.bridge;

public class LgTv implements Device {

    @Override
    public void turnOn() {
        System.out.println("LG Tv turned On");
    }

    @Override
    public void turnOff() {
        System.out.println("LG Tv turned Off");
    }

    @Override
    public void setChannel(int channelNumber) {
        System.out.println("LG Tv switch to channel " + channelNumber);
    }

}
