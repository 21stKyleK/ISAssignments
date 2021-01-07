package theThirdPair;

import java.util.*;
import java.io.File;
//import java.System.*;

public class KyleScanThree{
	//FileNotFoundException is what's thrown, import .io.FileNot...

	public static void main(String[] args) throws Exception{
		
		File[] qs = {new File("./irene.dat"), new File("./kelly.dat"), new File("./josey.dat")};
		
		Scanner arg = new Scanner(qs[0]);
		
		String[] primeT = {"NOT SEMIPRIME", "SEMIPRIME", "DISCRETE SEMIPRIME"};
		
		//int x; while(x --> #){ ==V
		
		System.out.println("Irene: ");
		for(int i = arg.nextInt(); i>0; i--){
			int p = arg.nextInt();
			String oP = p+" ";
			/*
			if(isPrime(p)){
				System.out.println(oP+primeT[0]);
			}*/
			if(isSemi(p)){
				if(isDis(p)){
					System.out.println(oP+primeT[2]);
				}else{
					System.out.println(oP+primeT[1]);
				}
			}else{
				System.out.println(oP+primeT[0]);
			}
		}
		
		System.out.println("");
		
		arg.close();
		
		arg = new Scanner(qs[1]);
		
		//space = 0, A = 6, E = 10, J = 15, P = 20, U = 25, Z = 30
		String code = "      ABCDEFGHIJLMNOPQRSTUVWXYZ";
		//space = 0,0 / 0
		//N=18 (3,3), 10+3
		//0? + 0 == 0
		//3? + 3 == 18
		//?: 
		System.out.println("Kelly: ");
		
		while(arg.hasNext()){
			Scanner inp = new Scanner(arg.nextLine());
			String oP = "";
			while(inp.hasNext()){
				int a = inp.nextInt(), b = inp.nextInt();
				oP += code.charAt( (a*5)+b);
			}
			System.out.println(oP);
			inp.close();
		}
		
		System.out.println("");
		arg.close();
		/*
		arg = new Scanner(qs[2]);
		
		for(int cases = arg.nextInt(); cases>0; cases--) {
			SortedMap<String, HashSet<String>> nats = new TreeMap<String, HashSet<String>>();
			for(int lines = arg.nextInt(); lines>0; lines--) {
				String a = arg.next(), b = arg.next();
				
			}
		}
		
		arg.close();
		*/
		//int count = freq.containsKey(word) ? freq.get(word) : 0;
	}
	
	public static boolean isDis(int x){
		int s = (int) Math.sqrt(x);
		return (int) Math.pow(s,2) != x;
	}
	
	public static boolean isSemi(int x){
		int s = (int) Math.sqrt(x);
		for(int i = 2; i <= s; i++){
			if(x%i==0 && isPrime(i) && isPrime(x/i)){
				return true;
			}
		}
		return false;
	}
	
	public static boolean isPrime(int x){
		int s = (int) Math.sqrt(x);
		for(int i = 2; i <= s; i++){
			if(x%i==0){
				return false;
			}
		}
		return true;
	}
}