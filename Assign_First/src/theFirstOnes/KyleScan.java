package theFirstOnes;

import java.util.Scanner;
import java.io.File;
//import java.text.DecimalFormat;

public class KyleScan{
	public static void main(String[] args) throws Exception{
		
		File q1 = new File("./brianna.dat");
		Scanner arg = new Scanner(q1);
		
		File q2 = new File("./deepa.dat");
		
		//System.out.print(arg.nextInt());
		int cur = arg.nextInt(), min = cur, max = cur;
		while(arg.hasNextInt()){
			cur = arg.nextInt();
			if(cur < min){
				min = cur;
			}else if(cur > max){
				max = cur;
			}
		}
		System.out.println("Brianna (Question 2)\n"+min+" "+max+" "+(max - min));
		
		arg.close();
		arg = new Scanner(q2);
		
		int cases = arg.nextInt(), iC;
		String oP = "Deepa (Question 3)\n";
		arg.nextLine();
		
		/*
		amount payed, average tax (effective tax), amount to be Taxed
		double amt, avg, aT
		*/
		
		//DecimalFormat df;
		
		for(int i = 0; i<cases; i++){
			//tax brackets, income
			int[][] tB = new int[arg.nextInt()+1][2];
			iC = arg.nextInt();
			tB[tB.length-1][0] = iC;
			oP += "Case #"+(i+1)+": ";
			
			arg.nextLine();
			
			float amt = 0;
			//t = tax, pC = payCount
			//int aT = 0, t = 0, pC = 0;
			
			for(int j = 0; j<tB.length-1; j++){
				tB[j][0] = arg.nextInt();
				tB[j][1] = arg.nextInt();
				arg.nextLine();
			}
			//previous element, current element, current tax, featuring minimum
			int stuffP, stuffC, taxC;
			max = 0;
			for(int j = 0; j<tB.length-1; j++) {
				stuffP = tB[j][0]; stuffC = tB[j+1][0]; taxC = tB[j][1];
				if(iC <= stuffC){
					amt += calc(iC, max, taxC);
					max = iC;
				}else{
					amt += calc(stuffC, stuffP, taxC);
					max = stuffC;
				}
			}
			//amt += calc(iC, pC, t);
			
			//df = new DecimalFormat("#.##");
			String aa = String.format("%,.2f", amt);
			//df = new DecimalFormat("#.###");
			String bb = String.format("%.3f", (amt/iC)*100 );
			
			oP += " $" + aa + ", "+ bb + "%\n"; 
			
		}
		/*
		https://alvinalexander.com/programming/printf-format-cheat-sheet/
		https://www.java67.com/2014/06/how-to-format-float-or-double-number-java-example.html
		https://docs.oracle.com/javase/7/docs/api/java/text/DecimalFormat.html
		https://stackoverflow.com/questions/3672731/how-can-i-format-a-string-number-to-have-commas-and-round
		*/
		
		System.out.print(oP);
		
		/*
			Case #1:  $4,453.50, 11.134%
			Case #2:  $988.26, 10.061%
		 */
		
		arg.close();
	
	}
	
	public static float calc(int a, int b, int c){
		return (float) ((a - b) * (c * 0.01));
	}
}