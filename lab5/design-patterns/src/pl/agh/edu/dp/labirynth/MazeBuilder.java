package pl.agh.edu.dp.labirynth;

public interface MazeBuilder {
    void addRoom(Room room);
    void addWall(Wall wall, Room r1, Room r2, Direction direction);
    void addDoor(Door door);
    Maze getMaze();
}
