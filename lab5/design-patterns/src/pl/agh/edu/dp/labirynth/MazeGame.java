package pl.agh.edu.dp.labirynth;

public class MazeGame {
    public Maze createMaze(MazeBuilder mazeBuilder){
        Wall commonWall = new Wall();

        Room r1 = new Room(1);
        mazeBuilder.addRoom(r1);
        r1.setSide(Direction.North, commonWall);
        r1.setSide(Direction.South, new Wall());
        r1.setSide(Direction.East, new Wall());
        r1.setSide(Direction.West, new Wall());

        Room r2 = new Room(2);
        mazeBuilder.addRoom(r2);
        r2.setSide(Direction.North, new Wall());
        r2.setSide(Direction.South, commonWall);
        r2.setSide(Direction.East, new Wall());
        r2.setSide(Direction.West, new Wall());

        Door door = new Door(r1, r2);
        mazeBuilder.addDoor(door);

        return mazeBuilder.getMaze();
    }

//    private static void surroundRoomByWalls(MazeBuilder mazeBuilder, Room room) {
//        for (Direction direction : Direction.values())
//            mazeBuilder.addWall(new Wall(), room, direction);
//    }
}
