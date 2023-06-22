package structural.bridge;

public class Main {

    public static void main(String[] args) {

        var remoteControl = new RemoteControl(new SonyTV());
        var advancedRemote = new AdvancedRemoteControl(new LgTv());

       // remoteControl.setDevice(new LgTv());

        advancedRemote.randomChannelSet();

        remoteControl.turnOn();
        remoteControl.turnOff();
        remoteControl.setChannel(5);

    }
}
