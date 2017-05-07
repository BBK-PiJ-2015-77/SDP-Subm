package Command;

/**
 * Created by thomasmcgarry on 29/04/2017.
 */
public class DeviceButton {

    Command theCommand;

    public DeviceButton(Command newCommand) {
        theCommand = newCommand;
    }

    public void press(){
        theCommand.execute();
    }

    public void pressUndo(){
        theCommand.undo();
    }

}
