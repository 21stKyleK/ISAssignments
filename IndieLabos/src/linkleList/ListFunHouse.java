package linkleList;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class ListFunHouse
{
	//this method will print the entire list on the screen
   public static void print(ListNode list)
   {
	   ListNode node = list;
	   while(node != null){
		   System.out.print(node.getValue() + "  ");
		   node = node.getNext();
	   }
	   //Systeem.out.println();
   }		
	
	//this method will return the number of nodes present in list
	public static int nodeCount(ListNode list)
	{
		int count=0;
		ListNode node = list;
		while(node != null){
		   count ++;
		   node = node.getNext();
	   }
		
		return count;
		
		//can be recurusive (return 1 + nodeCount(list.getNext()))
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node to the list.  Once finished, the first node will occur twice.
	public static void doubleFirst(ListNode list)
	{
		if(list != null){
			list.setNext(new ListNode(list.getValue(), list.getNext()));
		}
		//list.setNext(list) breaks everything
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public static void doubleLast(ListNode list)
	{
		if(list != null){
			if(list.getNext() != null){
				doubleLast(list.getNext());
			}
			else{
				list.setNext(new ListNode(list.getValue(), list.getNext()));
			}
		}
		
		//actually, you can do list = list.getNext(), as list is only a reference value, but the methods that come with it modify the original value
	}
		
	//method skipEveryOther will remove every other node
	public static void skipEveryOther(ListNode list)
	{
		if(list != null && list.getNext() != null){
			list.setNext(list.getNext().getNext());
			skipEveryOther(list.getNext());
		}
	}

	//this method will set the value of every xth node in the list
	public static void setXthNode(ListNode list, int x, Comparable value)
	{
		int count=1;
		while(list!=null){
			if(count>=x){
				list.setValue(value);
				count = 1;
			}else{
				count++;
			}
			list = list.getNext();
		}
	}	

	//this method will remove every xth node in the list
	public static void removeXthNode(ListNode list, int x)
	{
		int count=1;
		ListNode node = list;
		while(list!=null){
//			if(count>=x){
//				if(list.getNext()==null){
//					list.setNext(list.getNext());
//				}else{
//					list.setNext(list.getNext().getNext());
//				}
//				count = 1;
//			}else{
//				count++;
//				list = list.getNext();
//			}
			if(count == x) {
				node.setNext(list.getNext());
			}else {
				count++;
			}
			node = list;
			list = list.getNext();
		}
		//should use another storage variable
	}		
}