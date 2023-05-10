package pl.agh.edu.dp.labirynth.factories;

import pl.agh.edu.dp.labirynth.components.doors.Door;
import pl.agh.edu.dp.labirynth.components.doors.EnchantedDoor;
import pl.agh.edu.dp.labirynth.components.rooms.EnchantedRoom;
import pl.agh.edu.dp.labirynth.components.rooms.Room;
import pl.agh.edu.dp.labirynth.components.walls.EnchantedWall;
import pl.agh.edu.dp.labirynth.components.walls.Wall;

public class EnchantedMazeFactory implements MazeFactory {
    private int roomCount = 0;

    @Override
    public Room createRoom() {
        return new EnchantedRoom(++roomCount);
    }

    @Override
    public Wall createWall() {
        return new EnchantedWall();
    }

    @Override
    public Door createDoor(Room r1, Room r2) {
        return new EnchantedDoor(r1, r2);
    }
}
