package Command;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by thomasmcgarry on 29/04/2017.
 */
public class PlayWithRemote {

    public static void main(String[] args){

        LinkedList<DeviceButton> buttonPresses = new LinkedList<DeviceButton>();

        ElectronicDevice newDevice = TVRemote.getDevice();

        TurnTVOn onCommand = new TurnTVOn(newDevice);

        //Could just write this instead, so why not?
        //onCommand.execute();

        DeviceButton onPressed = new DeviceButton(onCommand);

        onPressed.press();

        buttonPresses.addFirst(onPressed);

        // ----------------------------------------------------

        TurnTVOff offCommand = new TurnTVOff(newDevice);

        onPressed = new DeviceButton(offCommand);

        onPressed.press();
        buttonPresses.addFirst(onPressed);


        // ----------------------------------------------------

        TurnTVUp volUpCommand = new TurnTVUp(newDevice);

        onPressed = new DeviceButton(volUpCommand);

        onPressed.press();
        buttonPresses.addFirst(onPressed);
        onPressed.press();
        buttonPresses.addFirst(onPressed);
        onPressed.press();
        buttonPresses.addFirst(onPressed);

        // ----------------------------------------------------

        Television theTV = new Television();
        Radio theRadio = new Radio();

        List<ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>();

        allDevices.add(theTV);
        allDevices.add(theRadio);

        TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);

        DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
        turnThemOff.press();
        buttonPresses.addFirst(turnThemOff);

        // ----------------------------------------------------

        //LinkedList
        //add them to the list, addFirst. then cycle through and undo

        System.out.println("--Undo Presses--");

        for (DeviceButton press : buttonPresses) {
            press.pressUndo();
        }

    }

}
