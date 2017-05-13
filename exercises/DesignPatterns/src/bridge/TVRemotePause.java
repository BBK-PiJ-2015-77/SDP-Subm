package bridge;

/**
 * Created by thomasmcgarry on 13/05/2017.
 */
public class TVRemotePause extends RemoteButton{

    public TVRemotePause(EntertainmentDevice newDevice){
        super(newDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV was Paused");
    }
}
