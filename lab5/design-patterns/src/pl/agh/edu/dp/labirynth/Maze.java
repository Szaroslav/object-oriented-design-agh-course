package pl.agh.edu.dp.labirynth;

import java.util.Vector;

public class Maze {
    private Vector<Room> rooms;

    public Maze() {
        this.rooms = new Vector<Room>();
    }

    public void addRoom(Room room){
        rooms.add(room);
    }

    public void setRooms(Vector<Room> rooms) {
        this.rooms = rooms;
    }

    public boolean containsRoom(Room room) {
        return rooms.contains(room);
    }

    public int getRoomNumbers()
    {
        return rooms.size();
    }
}
