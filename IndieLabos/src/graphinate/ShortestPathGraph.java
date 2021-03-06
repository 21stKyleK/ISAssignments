package graphinate;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class ShortestPathGraph
{
	private TreeMap<String, String> map;
	private boolean found;
	private int shortest;

	public ShortestPathGraph(String line)
	{
		map = new TreeMap<String, String>();
		
		for(String j : line.split(" ") ) {
			String a = j.substring(0, 1), b = j.charAt(1) + "";
			
			if(map.get(a) == null) {
				map.put(a, "");
			} if(map.get(b) == null) {
				map.put(b, "");
			}
			
			map.put(a, map.get(a)+b);
			map.put(b, map.get(b)+a);
		}
		
		found = false;
		shortest = Integer.MAX_VALUE;
	}

	public boolean contains(String letter)
	{
		
		boolean a = (map.get(letter) != null)? true : false;
		return a;
	}

	public void check(String first, String second, String placesUsed, int steps)
	{
		if(first.equals(second)) {
			found = true;
			shortest = (shortest > steps) ? steps : shortest;
		}
		
		for(String j : map.get(first).split("") ) {
			if(placesUsed.indexOf(j) == -1) {
				check(j, second, placesUsed+first, steps + 1);
			}
		}
		/*
		if(first.equals(second) && shortest > steps){
			found = true;
			shortest = steps;
		}
		*/
		/*
		String conList = map.get(first);
			for(int i=0; i<conList.length(); i++)
				if(placesUsed.indexOf(conList.substring(i,i+1))<0)
					check(conList.substring(i,i+1), second, placesUsed+first, steps+1);
		*/
	}

	public String toString()
	{
		if(!found)
			return found + "";
		return found + " in "+shortest+" steps";
	}
}
