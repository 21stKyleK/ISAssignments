package theSecondTwo;

import java.util.Scanner;
import java.util.*;
import java.io.File;
import java.util.Arrays;

public class KyleScanTwo {
	public static void main(String[] args) throws Exception {
		
		File[] q = {new File("./emilio.dat"), new File("./guoliang.dat")};
		
		Scanner arg = new Scanner(q[0]);
		
		//Scanner.next<Number(Int/Double)>() doen't care about new lines 
		//sets aren't good for avgs because they don't allow repeat values
		
		int cases = arg.nextInt();
		String op = "Question 1 (Emilio):\n";
		
		for(int i = 0; i<cases; i++) {
			int rTs = arg.nextInt();
			double rD[] = new double[ rTs ];
			
			for(int j = 0; j<rTs; j++) {
				rD[j] = arg.nextDouble();
			}
			
			Arrays.sort(rD);
			
			double avg = 0;
			
			for(int j = rD.length-1; j> rD.length-11; j--) {
				avg += rD[j];
			}
			
			op+= (i + 1) + ": " + String.format("%.1f", avg/10) + "\n";
			avg = 0;
			
			for(int j = 0; j<10; j++) {
				avg += rD[j];
			}
			
			op+= (i + 1) + ": " + String.format("%.1f", avg/10) + "\n";
			op+="------\n";
		}
		
		System.out.print(op);
		
		arg.close();
		arg = new Scanner(q[1]);
		
		System.out.println("\nQuestion 2 (Guoliang):\n");
		
		Set<Character> ha;
		
		while(arg.hasNext()){
			boolean b = true;
			ha = new HashSet<Character>();
			
			String iP = arg.next();
			
			int le = iP.length();
			
			for(int i = 0; i < le; i++){
				if(!ha.add(iP.charAt(i) ) ){
					b = false;
					break;
				}
			}
			
			if(b){
				System.out.println(iP);
			}
			
		}
		
		arg.close();
	}
}
