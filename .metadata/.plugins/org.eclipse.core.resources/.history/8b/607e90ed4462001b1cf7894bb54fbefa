package graphinate;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MazeRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner arg = new Scanner(new File("./maze.dat"));
		while(arg.hasNext()){
			int size = arg.nextInt();
			int[][] bruh = new int[size][size];
			
			for(int r= 0; r < rc; r++)
			{
				for(int c =0; c < rc; c++)
				{
					bruh[r][c]=arg.nextInt();
				}
				arg.nextLine();
			}
			
			Maze yosh = new Maze(bruh);
			
			out.println(yosh + "" + (yosh.checkForExitPath(0,0)==true?"exit found\n\n":"exit not found\n\n"));
		}
	}
}
