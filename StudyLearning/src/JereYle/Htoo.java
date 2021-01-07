package JereYle;

import java.util.*;
import java.io.File;

public class Htoo {
	public static void main(String[] args) throws Exception {
		Scanner arg = new Scanner(
				new File("./htoo.dat")
				//"1\n0 0 2 2 \n2 0 0 2"
				);
		
		int cases = arg.nextInt();
		
		//System.out.println((1.0/3)+(1.0/3)+(1.0/3));
		
		while(cases --> 0) {
			//l1x1, l1y1, l1x2, l1y2
			int[][] line1 = {{arg.nextInt(), arg.nextInt()}, {arg.nextInt(), arg.nextInt()}};
			float run1 = ((float)(line1[1][1] - line1[0][1]))/(line1[1][0] - line1[0][0]);
			int[][] line2 = {{arg.nextInt(), arg.nextInt()}, {arg.nextInt(), arg.nextInt()}};
			float run2 = ((float)(line2[1][1] - line2[0][1]))/(line2[1][0] - line2[0][0]);
			
			float[] val1 = new float[Math.abs(line1[0][0]-line1[1][0])+1];
			float[] val2 = new float[Math.abs(line2[0][0]-line2[1][0])+1];
			
			if(line1[1][0]<line1[0][0]) {
				int j = 0;
				for(int i = line1[0][0]; i<=line1[1][0]; i--, j++) {
					val1[j] = i*run1;
				}
			}else {
				int j = 0;
				for(int i = line1[0][0]; i<=line1[1][0]; i++, j++) {
					val1[j] = i*run1;
				}
			}
			
			if(line2[1][0]>line2[0][0]) {
				int j = 0;
				for(int i = line2[0][0]; i<=line2[1][0]; i--, j++) {
					val2[j] = i*run1;
				}
			}else {
				int j = 0;
				for(int i = line2[0][0]; i<=line2[1][0]; i++, j++) {
					val2[j] = i*run1;
				}
			}
			boolean doIt = false;
			
			for(float i : val1) {
				for(float j : val1) {
					if(i==j) {
						System.out.println("INTERSECT");
						doIt = true;
						break;
					}
				}
				if(doIt) {
					break;
				}
			}
		}
	}
}
