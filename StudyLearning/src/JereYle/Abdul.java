package JereYle;

import java.util.*;
import java.io.File;

public class Abdul {
	public static void main(String[] args) throws Exception {
		File a = new File("./abdul.dat");
		
		Scanner arg = new Scanner(a);
		
		while(arg.hasNextInt()) {
			int num = arg.nextInt(), cnt = 0;
			for(int i = 1; i<num*2; i++) {
				if(i%2==1) {
					cnt+=i;
				}
			}
			System.out.println(cnt);
		}
	}
}
