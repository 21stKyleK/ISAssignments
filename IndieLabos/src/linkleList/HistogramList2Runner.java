package linkleList;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class HistogramList2Runner
{
	public static void main(String[] args)
	{
		HistoList2 test = new HistoList2();
		String testString = "ABCDEFABCDEFFEDCBAAAAABBBBBCCCDAAAAAAAEEFFF";
		for(char c : testString.toCharArray())
		{
			test.add(c);
		}
		System.out.println(test);


		//add more test cases
		
		//System.out.println(test.);
		
		//demonstrate bad data check
		test = new HistoList2();
		test.add("dog");
		test.add(33);
		test.add(3.4);
		System.out.println(test);
	}
}