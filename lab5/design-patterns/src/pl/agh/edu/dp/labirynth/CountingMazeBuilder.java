package pl.agh.edu.dp.labirynth;

public class CountingMazeBuilder implements MazeBuilder {
    private final Maze currentMaze = new Maze();
    private int roomCount;
    private int wallCount;
    private int doorCount;

    @Override
    public void addRoom(Room room) {
        roomCount++;
    }

    @Override
    public void addWall(Wall wall, Direction direction, Room r1, Room r2) {
        if (r1 != null)
            wallCount++;
        if (r2 != null)
            wallCount++;
    }

    @Override
    public void addDoor(Door door) {
        wallCount -= 2;
        doorCount++;
    }

    @Override
    public Maze getMaze() {
        return null;
    }

    @Override
    public String toString() {
        return "[Maze]\nRooms: " + roomCount + "\t Walls: " + wallCount + "\t Doors: " + doorCount;
    }

    public int[] getCounts() {
        return new int[] { roomCount, wallCount, doorCount };
    }
}
