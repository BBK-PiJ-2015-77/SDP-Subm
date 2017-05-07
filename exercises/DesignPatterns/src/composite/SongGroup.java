package composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by thomasmcgarry on 01/05/2017.
 */
public class SongGroup extends SongComponent{

    ArrayList songComponents = new ArrayList();

    String groupName;
    String groupDescription;

    public SongGroup(String newGroupName, String newGroupDescritpion) {
        groupName = newGroupName;
        groupDescription = newGroupDescritpion;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void add(SongComponent newSongComponent) {
        songComponents.add(newSongComponent);
    }

    public void remove(SongComponent newSongComponent){
        songComponents.remove(newSongComponent);
    }

    public SongComponent getComponent(int componentIndex) {
        return (SongComponent)songComponents.get(componentIndex);
    }

    public void displaySongInfo(){

        System.out.println(getGroupName() + " " + getGroupDescription() + "\n");

        Iterator songIterator = songComponents.iterator();

        while(songIterator.hasNext()){
            SongComponent songInfo = (SongComponent) songIterator.next();
            songInfo.displaySongInfo();
        }
    }

}
