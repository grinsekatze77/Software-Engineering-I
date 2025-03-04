package se1.patterns.composite;

import java.util.ArrayList;

public class SongGroup extends SongComponent {

    ArrayList<SongComponent> songComponents = new ArrayList<>();

    String groupName;
    String groupDescription;

    public SongGroup(String newGroupName, String newGroupDescription) {
        groupName = newGroupName;
        groupDescription = newGroupDescription;
    }

    public String getGroupName() { return groupName; }
    public String getGroupDescription() { return groupDescription; }

    public void add(SongComponent newSongComponent) {
        songComponents.add(newSongComponent);
    }

    public void remove(SongComponent newSongComponent) {
        songComponents.remove(newSongComponent);
    }

    public SongComponent getComponent(int componentIndex) {
        return songComponents.get(componentIndex);
    }

    public void displaySongInfo() {
        System.out.println(getGroupName() + "\n\t" + getGroupDescription() + "\n");


        for (SongComponent songInfo : songComponents) {
            songInfo.displaySongInfo();
        }
    }
}