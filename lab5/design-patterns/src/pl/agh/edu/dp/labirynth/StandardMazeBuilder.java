package pl.agh.edu.dp.labirynth;

public class StandardMazeBuilder implements MazeBuilder {
    private final Maze currentMaze = new Maze();

    @Override
    public void addRoom(Room room) {
        currentMaze.addRoom(room);
    }

    @Override
    public void addWall(Wall wall, Room r1, Room r2, Direction direction) throws IllegalArgumentException {
        if (!currentMaze.containsRoom(r1) || !currentMaze.containsRoom(r2))
            throw new IllegalArgumentException("The rooms don't exist in the current maze");

        r1.setSide(direction, wall);
        r2.setSide(Direction.oppositeDirection(direction), wall);
    }

    @Override
    public void addDoor(Door door) {
        Room r1 = door.getRoom1();
        Room r2 = door.getRoom2();
        Direction direction = commonWallDirection(r1, r2);
        r1.setSide(direction, door);
        r2.setSide(Direction.oppositeDirection(direction), door);
    }

    @Override
    public Maze getMaze() {
        return currentMaze;
    }

    private Direction commonWallDirection(Room r1, Room r2) throws IllegalArgumentException {
        for (Direction direction : Direction.values()) {
            if (r1.getSide(direction).equals(r2.getSide(Direction.oppositeDirection(direction))))
                return direction;
        }

        throw new IllegalArgumentException("The rooms don't have relevant walls");
    }
}
