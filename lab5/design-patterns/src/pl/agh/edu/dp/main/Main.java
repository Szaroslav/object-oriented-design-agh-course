package pl.agh.edu.dp.main;

import pl.agh.edu.dp.labirynth.*;
import pl.agh.edu.dp.labirynth.builders.MazeBuilder;
import pl.agh.edu.dp.labirynth.builders.StandardMazeBuilder;
import pl.agh.edu.dp.labirynth.factories.MazeFactory;
import pl.agh.edu.dp.labirynth.factories.StandardMazeFactory;

public class Main {

    public static void main(String[] args) {

        MazeGame mazeGame = new MazeGame();
        MazeBuilder mazeBuilder = new StandardMazeBuilder();
        MazeFactory mazeFactory = new StandardMazeFactory();
        Maze maze = mazeGame.createMaze(mazeBuilder, mazeFactory);

        System.out.println(maze.getRoomNumbers());
    }
}



