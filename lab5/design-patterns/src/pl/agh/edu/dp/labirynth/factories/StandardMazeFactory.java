package pl.agh.edu.dp.labirynth.factories;

import pl.agh.edu.dp.labirynth.components.doors.Door;
import pl.agh.edu.dp.labirynth.components.rooms.Room;
import pl.agh.edu.dp.labirynth.components.walls.Wall;

public class StandardMazeFactory implements MazeFactory {
    private int roomCount = 0;

    @Override
    public Room createRoom() {
        return new Room(++roomCount);
    }

    @Override
    public Wall createWall() {
        return new Wall();
    }

    @Override
    public Door createDoor(Room r1, Room r2) {
        return new Door(r1, r2);
    }
}
