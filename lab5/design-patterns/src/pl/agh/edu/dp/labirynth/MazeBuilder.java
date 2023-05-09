package pl.agh.edu.dp.labirynth;

public interface MazeBuilder {
    void addRoom();
    void addWall();
    void addDoor();
    Maze getMaze();
}
