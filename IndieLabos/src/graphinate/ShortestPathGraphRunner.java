package graphinate;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class ShortestPathGraphRunner
{
	public static void main( String[] args ) throws IOException
	{
		Scanner arg = new Scanner(new File("./graph1.dat"));
		int length = arg.nextInt();
		arg.nextLine();
		while(length --> 0) {
			String input = arg.nextLine();
			ShortestPathGraph yee = new ShortestPathGraph(input);
			
			input = arg.nextLine();
			String a = input.substring(0,1), b = input.substring(1);
			
			if(yee.contains(a ) && yee.contains(b ) )
				yee.check( a, b, "", 0);
			
			out.println(a + " CONNECTS TO " + b + " == " + yee);
		}
	}
}