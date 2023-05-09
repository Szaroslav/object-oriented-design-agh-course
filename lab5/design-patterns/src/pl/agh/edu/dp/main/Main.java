package pl.agh.edu.dp.main;

import pl.agh.edu.dp.labirynth.*;

public class Main {

    public static void main(String[] args) {

        MazeGame mazeGame = new MazeGame();
        MazeBuilder mazeBuilder = new StandardMazeBuilder();
        Maze maze = mazeGame.createMaze(mazeBuilder);

        System.out.println(maze.getRoomNumbers());
    }
}



