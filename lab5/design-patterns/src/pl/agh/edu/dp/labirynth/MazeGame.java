package pl.agh.edu.dp.labirynth;

import pl.agh.edu.dp.labirynth.builders.MazeBuilder;
import pl.agh.edu.dp.labirynth.components.doors.Door;
import pl.agh.edu.dp.labirynth.components.rooms.Room;
import pl.agh.edu.dp.labirynth.factories.MazeFactory;

public class MazeGame {
    public Maze createMaze(MazeBuilder mazeBuilder, MazeFactory mazeFactory){
        Room r1 = mazeFactory.createRoom();
        mazeBuilder.addRoom(r1);
        Room r2 = mazeFactory.createRoom();
        mazeBuilder.addRoom(r2);

        mazeBuilder.addWall(mazeFactory.createWall(), Direction.North, r1, r2);
        mazeBuilder.addWall(mazeFactory.createWall(), Direction.South, r1, null);
        mazeBuilder.addWall(mazeFactory.createWall(), Direction.East, r1, null);
        mazeBuilder.addWall(mazeFactory.createWall(), Direction.West, r1, null);

        mazeBuilder.addWall(mazeFactory.createWall(), Direction.North, r2, null);
        mazeBuilder.addWall(mazeFactory.createWall(), Direction.South, r2, r1);
        mazeBuilder.addWall(mazeFactory.createWall(), Direction.East, r2, null);
        mazeBuilder.addWall(mazeFactory.createWall(), Direction.West, r2, null);

        Door door = mazeFactory.createDoor(r1, r2);
        mazeBuilder.addDoor(door);

        return mazeBuilder.getMaze();
    }

//    private static void surroundRoomByWalls(MazeBuilder mazeBuilder, Room room) {
//        for (Direction direction : Direction.values())
//            mazeBuilder.addWall(new Wall(), room, direction);
//    }
}
