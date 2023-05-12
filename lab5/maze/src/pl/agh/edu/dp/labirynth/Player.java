package pl.agh.edu.dp.labirynth;

import pl.agh.edu.dp.labirynth.components.rooms.Room;

public class Player {
    private String name;
    private Room currentRoom;

    public Player() {
        name = "Player";
        currentRoom = null;
    }

    public Player(String name, Room currentRoom) {
        this.name = name;
        this.currentRoom = currentRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public void move(Direction direction) {
        currentRoom.getSide(direction).Enter();
    }
}
