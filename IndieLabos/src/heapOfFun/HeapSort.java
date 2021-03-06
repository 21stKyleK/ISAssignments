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
//		if(index > 0 
////				&& index <= list.size() - 1
//				){
//			int rooted = (index-1)/2;
//			if(list.get(index) < list.get( rooted ) ){
//				swap(index, rooted);
//				swapUp(rooted);
//			}
//		}
   		
   		// /*
   		int bot = index;
		while(bot>0)
		{
			int parent = (bot-1)/2;
			if(list.get(parent) < list.get(bot))
			{
				swap(parent, bot);
				bot=parent;
			}
			else{
				break;
			}
		}
		
		// */
	}
//
	public void swapDown(int index)
	{
//		int rooted = 0;
//		while(rooted < index) {
//			
//		int child1 = (rooted * 2) + 1, child2 = (rooted * 2) + 2;
//			int child1 = (index * 2) + 1, child2 = (index * 2) + 2;
//		
//		if(child1 <= list.size() -1){
//			if(child2 <= list.size() -1){
//				if(list.get(index) <= list.get(child2)){
//					swap(index, child2);
//					swapDown(child2);
//					return;
//				}
//			}
//			if(list.get(index) < list.get(child1)){
//				swap(index, child1);
//				swapDown(child1);
//			}
//		}
		
//		if(child1 < index) {
//			if(child2 < index) {
//				if(list.get(rooted) <= list.get(child2) ) {
//					swap(rooted, child2);
//					rooted = child2;
//				}
//				else if(list.get(rooted) <= list.get(child1) ){
//					swap(rooted, child1);
//					rooted = child1;
//				}
//				else {
//					break;
//				}
//				
//			}
//			else if(list.get(rooted) <= list.get(child1) ){
//				swap(rooted, child1);
//				rooted = child1;
//			}
//			else {
//				break;
//			}
//		
//		}else {
//			break;
//		}
//		
//		}
		
		///*
		int root=0;
		while(root<index)
		{
			int max=0;
		   int left = root * 2 + 1;
		   int right = root * 2 + 2;

    		if(left < index)
			{
				if(right < index)
				{
					if (list.get(left) <= list.get(right))
					{
						max = right;
					}
					else{
						max = left;
					}
				}
				else
					max = left;
			}
			else break;

			if (list.get(root) < list.get(max))
			{
				swap(root, max);
				root=max;
			}
			else break;
		}
		//*/
	}

   public void heapSort(int[] nums)
   {
//	for(int i = 0; i<nums.length; i++){
//		list.add(nums[i]);
//		swapUp(i);
//	}
	 //  /*
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
	 //  */
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
