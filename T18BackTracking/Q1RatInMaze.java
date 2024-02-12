/*
    Rat in a Maze
    You are given a starting position for a rat which is stuck in a maze at an 
    initial point (0, 0) (the maze can be thought of as a 2-dimensional plane). 

    The maze would be given in the form of a square matrix of order N * N 
    where the cells with value O represent the maze's blocked locations 
    while value 1 is the open/available path that the rat can take to reach its destination.

    The rat's destination is at (N - 1, N - 1).

    Your task is to find all the possible paths that the rat can take to reach from source to destination in the maze.
    The possible directions that it can take to move in the maze are 
    'U'(up) i.e. (x - 1, y) , 'D'(down) i.e. (x + 1, y) , 
    'L' (left) i.e. (x, y - 1), 'R' (right) i.e. (x, y + 1).

    example int[][] maze = {
            { 1, 0, 1, 1, 1 },
            { 1, 0, 1, 0, 1 },
            { 1, 1, 1, 0, 1 },
            { 1, 0, 0, 0, 1 },
            { 1, 1, 1, 1, 1 }
        };
    output: 1. DDDDRRRR 2. DDRRUURRDDDD

*/
package T18BackTracking;

public class Q1RatInMaze {
    public static void main(String[] args) {
        // int[][] maze = {
        // { 1, 0, 0, 0 },
        // { 1, 1, 0, 1 },
        // { 0, 1, 0, 0 },
        // { 1, 1, 1, 1 }
        // };
        int[][] maze = {
                { 1, 0, 1, 1, 1 },
                { 1, 0, 1, 0, 1 },
                { 1, 1, 1, 0, 1 },
                { 1, 0, 0, 0, 1 },
                { 1, 1, 1, 1, 1 }
        };

        ratInMaze(maze, 0, 0, "");
    }

    // O(4 ^ (n*n))
    static void ratInMaze(int[][] maze, int i, int j, String path) {
        // reached destination
        if (i == maze.length - 1 && j == maze.length - 1) {
            System.out.println(path);
            return;
        }
        // return out of maze
        if (i < 0 || j < 0 || i >= maze.length || j >= maze[0].length) {
            return;
        }
        // visited cell or blocked cell
        if (maze[i][j] == 2 || maze[i][j] == 0) {
            return;
        }

        maze[i][j] = 2; // mark visited
        ratInMaze(maze, i - 1, j, path + 'U'); // up
        ratInMaze(maze, i + 1, j, path + 'D'); // down
        ratInMaze(maze, i, j - 1, path + 'L'); // left
        ratInMaze(maze, i, j + 1, path + 'R'); // right
        maze[i][j] = 1; // mark unvisited
    }
}
