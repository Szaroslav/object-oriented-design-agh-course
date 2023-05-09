package pl.agh.edu.dp.labirynth;

public class MazeGame {
    public Maze createMaze(MazeBuilder mazeBuilder){
        Room r1 = new Room(1);
        mazeBuilder.addRoom(r1);
        Room r2 = new Room(2);
        mazeBuilder.addRoom(r2);

        mazeBuilder.addWall(new Wall(), Direction.North, r1, r2);
        mazeBuilder.addWall(new Wall(), Direction.South, r1, null);
        mazeBuilder.addWall(new Wall(), Direction.East, r1, null);
        mazeBuilder.addWall(new Wall(), Direction.West, r1, null);

        mazeBuilder.addWall(new Wall(), Direction.North, r2, null);
        mazeBuilder.addWall(new Wall(), Direction.South, r2, r1);
        mazeBuilder.addWall(new Wall(), Direction.East, r2, null);
        mazeBuilder.addWall(new Wall(), Direction.West, r2, null);

        Door door = new Door(r1, r2);
        mazeBuilder.addDoor(door);

        return mazeBuilder.getMaze();
    }

//    private static void surroundRoomByWalls(MazeBuilder mazeBuilder, Room room) {
//        for (Direction direction : Direction.values())
//            mazeBuilder.addWall(new Wall(), room, direction);
//    }
}
