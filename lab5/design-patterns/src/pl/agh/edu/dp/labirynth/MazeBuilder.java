package pl.agh.edu.dp.labirynth;

public interface MazeBuilder {
    void addRoom(Room room);
    void addWall(Wall wall, Direction direction, Room r1, Room r2);
    void addDoor(Door door);
    Maze getMaze();
}
