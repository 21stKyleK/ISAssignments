package theFifthFew;

import java.util.*;
import java.io.File;

public class KyleScanFive{
	public static Scanner arg;
	
	public static void main (String[] args) throws Exception{
	
		File[] q = {new File("./nitin.dat"), new File("./willie.dat")};
		
		arg = new Scanner(q[0]);
		
		Queue<String> dogs = new LinkedList<String>();
		Queue<String> cats = new LinkedList<String>();
		
		System.out.println("Question 1: Nitin");
		
		int a = arg.nextInt();
		while( a --> 0){
			String n = arg.next();
			String t = arg.next();
			
			if(t.equals("D")){
				dogs.add(n);
			}else{
				cats.add(n);
			}
		}
		
		a = arg.nextInt();
		while(a --> 0){
			String n = arg.next();
			String t = arg.next();
			
			if(t.equals("D")){
				if(dogs.isEmpty()){
					System.out.println(n+" WAIT LIST DOG");
				}else{
					System.out.println(n+" DOG "+dogs.remove());
				}
			}else{
				if(cats.isEmpty()){
					System.out.println(n+" WAIT LIST CAT");
				}else{
					System.out.println(n+" CAT "+cats.remove());
				}
			}
		}
		
		arg.close();
		arg = new Scanner(q[1]);
		
		System.out.println("\nQuestion 2: Willie");
		
		a = arg.nextInt();
		while(a --> 0){
			int s = arg.nextInt();
			//still a new Line left over
			arg.nextLine();
			
			boolean[][] board = new boolean[s][s];
			byte[] colCnt = new byte[s];
			
			if(isValid(s, board, colCnt)) {
				System.out.println("valid solution");
			}else {
				System.out.println("incorrect attempt");
			}
			
			arg.nextLine();
			arg.nextLine();
		}
		
		arg.close();
	}
	
	public static boolean isValid(int s, boolean[][] b, byte[] c) {
		for(int i = 0; i<s; i++){
			arg.nextLine();
			String[] ah = arg.nextLine().substring(1).split("[|]");
			byte cnt = 0;
			
			for(int j = 0; j<s; j++){
				if(ah[j].indexOf("Q") != -1){
//					b[i][j] = false;
//				}else{
					if(cnt > 0 || c[j] > 0){
						return false;
					}
					cnt++;
					c[j]++;
					
					b[i][j] = true;
				}
			}
		}
		
		return checkDiagonal(b);
	}
	
	public static boolean checkDiagonal(boolean[][] b) {
		//y = -x+b : x= 0, y = b - x (if Q@(2, 3), start at (0, 5))
		//y = x+b : x = 0, y = b + x (if Q@(2, 3), start at (0, 1))
		for(int i = 0; i<b.length; i++) {
			for(int j = 0; j<b.length; j++) {
				if(b[i][j]) {
					int y;
					byte cntP = 0, cntN = 0;
					for(int x = 0; x<b.length; x++) {
						y = (i + j) - x;
						if(y < b.length && y >= 0 ) {
							if(b[x][y]) {
								if(cntP > 0) {
									return false;
								}
								cntP++;
							}
						}
						y = (i - j) + x;
						if(y < b.length && y >= 0 ) {
							if(b[x][y]) {
								if(cntN > 0) {
									return false;
								}
								cntN++;
							}
						}
					}
				}
			}
		}
		
		return true;
	}
}