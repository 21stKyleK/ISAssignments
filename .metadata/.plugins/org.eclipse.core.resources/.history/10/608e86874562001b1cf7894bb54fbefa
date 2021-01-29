package graphinate;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;
import static java.lang.System.*;

public class BiDirectionalGraphRunner
{
	public static void main( String[] args ) throws IOException
	{
		Scanner arg = new Scanner(new File("./bidgraph.dat"));
		
		int cases = arg.nextInt();
		
		while(cases --> 0){
			BiDirectionalGraph yee = new BiDirectionalGraph(arg.nextLine());
			
			String[] bef = arg.nextLine().split[" "];
			
			if(yee.contains(bef[0]) && yee.contains(bef[1]))
				yee.check(bef[0], bef[1], new TreeSet<String>());
			
			System.out.println(bef[0] + " IS CONNECTED TO " + bef[1] + " : " + yee);
		}
	}
}
