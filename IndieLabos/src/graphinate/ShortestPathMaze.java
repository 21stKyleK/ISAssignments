package graphinate;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class ShortestPathMaze
{
   private int[][] maze;
   private int shortest;

	public ShortestPathMaze()
	{
		this(new int[5][5]);
	}

	public ShortestPathMaze(int[][] m)
	{
		maze = m;
		shortest = Integer.MAX_VALUE;
	}


	public void checkForExitPath(int r, int c, int path)
	{
		if(path < shortest && r >= 0 && r < maze.length && c >= 0  && maze[r][c] == 1){
			if(c >= maze[r].length-1){
				shortest = path;
			}
			else{
				maze[r][c] = 2;
				checkForExitPath(r, c + 1, path + 1);
				checkForExitPath(r, c - 1, path + 1);
				checkForExitPath(r + 1, c, path + 1);
				checkForExitPath(r - 1, c, path + 1);
				maze[r][c] = 1;
			}
		}
	}
	
	public int getShortestPath()
	{
		return shortest;
	}

	public String toString()
	{
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
