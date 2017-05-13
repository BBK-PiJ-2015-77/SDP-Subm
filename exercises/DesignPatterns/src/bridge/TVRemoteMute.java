package bridge;

/**
 * Created by thomasmcgarry on 13/05/2017.
 */
public class TVRemoteMute extends RemoteButton{

    public TVRemoteMute(EntertainmentDevice newDevice){
        super(newDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV was Muted");
    }
}
