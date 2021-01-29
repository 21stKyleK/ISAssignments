package graphinate;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;

	public Maze()
	{
		maze = {
			{1, 0, 0, 0, 0},
			{1, 1, 1, 0, 1},
			{1, 0, 1, 1, 1},
			{1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0}
		};
	}

	public Maze(int[][] m)
	{
		maze = m;
	}

	public boolean checkForExitPath(int r, int c)
	{
		boolean bruh = false;
		if(r >= 0 && r < maze.length && c >= 0 && c < maze[r].length && maze[r][c] == 1){
			maze[r][c] = 2;
			if(c >= maze[r].length - 1){
				//bruh = true;
				return true;
			}else{
				bruh = (checkForExitPath(r, c + 1) || checkForExitPath(r + 1, c) || checkForExitPath(r, c - 1) || checkForExitPath(r - 1, c));
			}
		}
		return bruh;
	}

	public String toString()
	{
// 		String output= (checkForExitPath(0,0)) ? "exit found": "no escape";
// 		return output;
		
		String output="";
		for(int r= 0; r<maze.length; r++)
		{
			for(int c =0; c<maze[r].length; c++)
			{
				output+=maze[r][c]+" ";
			}
			output+="\n";
		}
		return output;
	}
}
