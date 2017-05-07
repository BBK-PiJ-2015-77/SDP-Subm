package Command;

/**
 * Created by thomasmcgarry on 29/04/2017.
 */
public class TurnTVOn implements Command{

    ElectronicDevice theDevice;

    public TurnTVOn(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.on();
    }

    @Override
    public void undo() {
        theDevice.off();
    }
}
