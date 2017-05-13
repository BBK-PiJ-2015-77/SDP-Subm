package bridge;

/**
 * Created by thomasmcgarry on 13/05/2017.
 */
public abstract class RemoteButton {

    private EntertainmentDevice theDevice;

    public RemoteButton(EntertainmentDevice newDevice){
        theDevice = newDevice;
    }

    public void buttonFivePressed(){
        theDevice.buttonFivePressed();
    }

    public void buttonSixPressed(){
        theDevice.buttonSixPressed();
    }

    public void deviceFeedback(){
        theDevice.deviceFeedback();
    }

    public abstract void buttonNinePressed();

}
