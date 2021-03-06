package graphinate;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Map;
import java.util.TreeMap;

public class Graph
{
	private TreeMap<String, String> map;
	private boolean found;

	public Graph(String line)
	{
		map = new TreeMap<String, String>();
		String[] bruh = line.split(" ");
		for(String j : bruh){
			String a = j.charAt(0) + "", b = j.charAt(1) + "";
			if(map.get(a) == null){
				map.put(a, "");
			}
			map.put(a, map.get(a)+b);
			
			if(map.get(b) == null){
				map.put(b, "");
			}
			map.put(b, map.get(b)+a);
		}
		found = false;
	}

	public boolean contains(String letter)
	{
		if(map.get(letter) == null){
			return false;
		}
	   return true;
	}

	public void check(String first, String second, String placesUsed)
	{
		if(placesUsed.indexOf(first) != -1) {
			return;
		}
		if(map.get(first).indexOf(second) != -1 || first.equals(second)){
			found = true;
			return;
		}
		String[] dude = map.get(first).split("");
		for(String j : dude){
			check(j, second, placesUsed + first);
			if(found){
				return;
			}
		}
		
		/*
		or, do:
		if(equals){
		
		}else{
		String a = map.get(first);
		loop through a{
			check(index of a, second, placesUsed + first)
		}
		}
		*/
	}

	public String toString()
	{
//		if(found){
//			return "CONNECTS";
//		} return "DOESN'T";
		return found + "";
	}
}
