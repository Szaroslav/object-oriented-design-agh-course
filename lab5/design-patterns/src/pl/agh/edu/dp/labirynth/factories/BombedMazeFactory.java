package pl.agh.edu.dp.labirynth.factories;

import pl.agh.edu.dp.labirynth.components.doors.BombedDoor;
import pl.agh.edu.dp.labirynth.components.doors.Door;
import pl.agh.edu.dp.labirynth.components.rooms.BombedRoom;
import pl.agh.edu.dp.labirynth.components.rooms.Room;
import pl.agh.edu.dp.labirynth.components.walls.BombedWall;
import pl.agh.edu.dp.labirynth.components.walls.Wall;

public class BombedMazeFactory implements MazeFactory {
    private int roomCount;

    @Override
    public Room createRoom() {
        return new BombedRoom(++roomCount);
    }

    @Override
    public Wall createWall() {
        return new BombedWall();
    }

    @Override
    public Door createDoor(Room r1, Room r2) {
        return new BombedDoor(r1, r2);
    }
}
