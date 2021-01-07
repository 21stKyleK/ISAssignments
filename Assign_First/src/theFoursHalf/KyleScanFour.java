package theFoursHalf;

import java.util.*;
import java.io.File;
//import java.Collections.*;

public class KyleScanFour{
	public static String hex = "0123456789ABCDEF";
	
	public static void main(String[] args) throws Exception{
		File[] q = {new File("./maciej.dat"), new File("./teresa.dat")};
		
		Scanner arg = new Scanner(q[0]);
		System.out.println("Question 1: Maciej");
		
		int cases = arg.nextInt(), n = cases;
		
		while(cases --> 0){
			String bHex1 = arg.next().substring(1), bHex2 = arg.next().substring(1);
			int[] bits1 = new int[3], bits2 = new int[3];
			
			for(int i = 0; i<3; i++){
				bits1[i] = turnToInt( bHex1.substring(i*2, (i*2)+2) );
				bits2[i] = turnToInt( bHex2.substring(i*2, (i*2)+2) );
			}
			
			int[] bits3 = {getMidway(bits1[0], bits2[0]), getMidway(bits1[1], bits2[1]), getMidway(bits1[2], bits2[2])};
			
			String op = "Case #"+Math.abs(cases - (n))+": #";
			for(int j: bits3){
				op += turnToHex(j);
			}
			
			System.out.println(op);
			
		}
		
		System.out.println("");
		arg.close();
		arg = new Scanner(q[1]);
		cases = arg.nextInt();
		n = cases;
		
		while(cases --> 0){
			int rows = arg.nextInt(), cols = arg.nextInt();
			int[][] mat = new int[rows][cols];
			
			while(rows --> 0){
				while(cols --> 0){
					mat[rows][cols] = arg.nextInt();
				}
				
				cols = mat[rows].length;
			}
			//reduces the actual number, not a reference
			
			int[] bruh = new int[mat.length];
			for(int i = 0; i < mat[0].length; i++){
				for(int j = 0; j<mat.length; j++){
					bruh[j] = mat[j][i];
				}
				//bruh = mergeSort(bruh);
				Arrays.sort(bruh);
				for(int j = 0; j<mat.length; j++){
					mat[j][i] = bruh[j];
				}
			}
			
			for(int i = 0; i<mat.length; i++){
				Arrays.sort(mat[i]);
			}
			
			String op = Math.abs(cases - (n)) + ":\n";
			for(int[] j : mat){
				for(int k : j){
					op += k + "\t";
				}
				op += "\n";
			}
			
			System.out.println(op + "++++++++++++\n");
		}
		
		arg.close();
	}
	
	/*
	public static int[] mergeSort(int[] a){
		for(int i = 0; i< a.length; i++){
			
		}
		return a;
	}
	*/
	public static int turnToInt(String a){
		int inte = 0;
		
		inte += hex.indexOf(a.charAt(0) ) * 16;
		
		return inte + hex.indexOf(a.charAt(1));
	}
	
	public static String turnToHex(int b){
		String hexa = "";
		
		hexa += hex.charAt(b/16);
		
		return hexa + hex.charAt(b%16);
	}
	
	public static int getMidway(int a, int b){
		int c, d;
		if(a>b){
			c = a;
			d = b;
		}else{
			c = b;
			d = a;
		}
		return ((c - d)/2) + d;
	}
}