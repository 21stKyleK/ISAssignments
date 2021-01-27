package graphinate;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;
import static java.lang.System.*;

public class BiDirectionalGraph
{
	private TreeMap<String, TreeSet<String>> map;
	private boolean found;

	public BiDirectionalGraph(String line)
	{
		map = new TreeMap<String, TreeSet<String> >();
		found = false;
		String[] bruh = line.split[" "];
		
		for(int i = 0; i<bruh.length; i += 2){
			String a = bruh[i], b = bruh[i+1];
			
			if(map.get(a) == null){
				map.put(a, new TreeSet<String>());
			}if(map.get(b) == null){
				map.put(b, new TreeSet<String>());
			}
			
			map.put(a, map.get(a).add(b));
			map.put(b, map.get(b).add(a));
		}
	}

	public boolean contains(String name)
	{
		boolean arg = (map.get(name) == null) ? false : true;
		return arg;
	}

	public void check(String first, String second, TreeSet<String> placedUsed)
	{
		if(first.equals(second)){
			found = true;
		}else{
			for(String j : map.get(a)){
				if(placedUsed.get(j) == null){
					placedUsed.add(j)
					check(j, second, placedUsed);
					placedUsed.remove(j)
				}
			}
		}
	}

	public String toString()
	{
		String brarg = (found)? "Yee" : "No";
		return brarg;
	}
}
