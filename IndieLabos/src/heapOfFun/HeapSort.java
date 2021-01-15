package heapOfFun;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.List;
import java.util.ArrayList;
import static java.lang.System.*;

public class HeapSort
{
	private List<Integer> list;

	public HeapSort()
	{
		list = new ArrayList<Integer>();
	}

   	public void swapUp(int index)
   	{
		if(index > 0 && index =< list.size() - 1){
			int rooted = (index-1)/2;
			if(list.get(index) < list.get( rooted ) ){
				swap(index, rooted);
				swapUp(rooted);
			}
		}
	}

	public void swapDown(int index)
	{
		int child1 = (index * 2) + 1, child2 = (index * 2) + 2;
		
		if(child1 <= list.size() -1){
			if(child2 <= list.size() -1){
				if(list.get(index) > list.get(child2)){
					swap(index, child2);
					swapDown(child2);
				}
			}
			if(list.get(index) > list.get(child1)){
				swap(index, child1);
				swapDown(child1);
			}
		}
	}

   public void heapSort(int[] nums)
   {
	for(int i = 0; i<nums.length -1; i++){
		list.add(nums[i]);
		swapUp(i);
	}
	   /*
	   for(int item : nums)
   	{
   		list.add(item);
   	}
   	for(int i = 1; i<nums.length; i++)
   	{
   		swapUp(i);
   	}
   	for(int i=list.size()-1; i>=1; i--)
   	{
   		swap(0, i);
   		swapDown(i-1);   		
   	}   
	   */
   }
   
   private void swap(int first, int last)
   {
	   int temp = list.get(first);
	   list.set(first, list.get(last));
	   list.set(last, temp);
  }

	public String toString()
	{
		return list.toString();
	}
}
