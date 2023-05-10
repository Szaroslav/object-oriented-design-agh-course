package pl.agh.edu.dp.labirynth.builders;

import pl.agh.edu.dp.labirynth.*;
import pl.agh.edu.dp.labirynth.components.doors.Door;
import pl.agh.edu.dp.labirynth.components.rooms.Room;
import pl.agh.edu.dp.labirynth.components.walls.Wall;

public interface MazeBuilder {
    void addRoom(Room room);
    void addWall(Wall wall, Direction direction, Room r1, Room r2);
    void addDoor(Door door);
    Maze getMaze();
}
