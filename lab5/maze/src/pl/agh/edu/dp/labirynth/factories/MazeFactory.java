package pl.agh.edu.dp.labirynth.factories;

import pl.agh.edu.dp.labirynth.components.doors.Door;
import pl.agh.edu.dp.labirynth.components.rooms.Room;
import pl.agh.edu.dp.labirynth.components.walls.Wall;

public interface MazeFactory {
    Room createRoom();
    Wall createWall();
    Door createDoor(Room r1, Room r2);
}
