package heapOfFun;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.List;
import java.util.ArrayList;
import static java.lang.System.*;

public class Heap
{
	private List<Integer> list;

	public Heap()
	{
		list = new ArrayList<Integer>();
	}

	public void add(int value)
	{
		list.add(value);
		swapUp(list.size()-1);
	}

   	public void swapUp(int bot)
   	{
		int parent = (bot-1)/2;
		//because if only integers, rounds down(?)
		if(list.get(parent) < list.get(bot)){
			swap(parent, bot);
			swapUp(parent);
		}
	}

	public void remove( )
	{
		list.set(0,list.get(list.size()-1));
		list.remove(list.size()-1);
		//swapDown(list.size());
		swapDown(0);
	}

	public void swapDown(int top)
	{
		int left = (top*2)+1, right = (top*2)+2, max = list.size()-1;
		
		if(left <= max){
			if(right <= max){
				if(list.get(right) >= list.get(left)){
					max = right;
				}else{
					max = left;
				}
			}else{
				max = left;
			}
		}else{
			return;
		}
		
		if(list.get(top) < list.get(max)){
			swap(top, max);
			swapDown(max);
		}
	}
	
	private void swap(int start, int finish)
	{
		int holdNum = list.get(start);
		list.set(start, list.get(finish));
		list.set(finish, holdNum);
	}

	public void print()
	{
		out.println("\n\nPRINTING THE HEAP!\n\n");
		//out.println(toString());
		
		int x=0;
		for(int i=1; i<list.size();i*=2)
		{
			for(int s=1;s<list.size()-i;s++)
			{
		      out.print(" ");
			}
		   for(int j=0;j<=i-1&&x<list.size(); j++)
		   {
		   	out.print(list.get(x++)+"  ");
		   }
		   out.println();
		   if(x==list.size()-1)
		   {
		   	out.print(list.get(x++)+"  ");
		   }
		}
		out.println();
		
		//int i = 0;
		
	}

	public String toString()
	{
		return list.toString();
	}
}
