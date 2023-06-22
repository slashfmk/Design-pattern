package structural.bridge;

import java.util.Random;

public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {

        super(device);
    }

    // Advanced remote feature
    public void randomChannelSet() {
        Random rand = new Random();
        super.setChannel(rand.nextInt(100));
    }
}
