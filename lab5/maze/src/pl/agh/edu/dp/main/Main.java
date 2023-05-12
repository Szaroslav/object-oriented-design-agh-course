package pl.agh.edu.dp.main;

import pl.agh.edu.dp.labirynth.*;
import pl.agh.edu.dp.labirynth.builders.MazeBuilder;
import pl.agh.edu.dp.labirynth.builders.StandardMazeBuilder;
import pl.agh.edu.dp.labirynth.factories.MazeFactory;
import pl.agh.edu.dp.labirynth.factories.StandardMazeFactory;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        MazeGame mazeGame = new MazeGame();
        MazeBuilder mazeBuilder = new StandardMazeBuilder();
        MazeFactory mazeFactory = StandardMazeFactory.getInstance();
        Maze maze = mazeGame.createMaze(mazeBuilder, mazeFactory);
        mazeGame.createPlayer("Mockup John", maze.getFirstRoom());

        // Not finished. Need to add output messages and verify potential bugs occurrence.
        // mazeGame.start();

        System.out.println(maze.getRoomNumbers());
    }
}
