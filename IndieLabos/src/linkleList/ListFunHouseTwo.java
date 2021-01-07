package linkleList;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class ListFunHouseTwo
{
	private ListNode theList;
	
	public ListFunHouseTwo()
	{
		theList = null;
	}
	
	public void add(Comparable data)
	{
		theList = new ListNode(data, theList);
	}
	
	//this method will return the number of nodes present in list
	public int nodeCount()
	{
   	int count=0;
	ListNode node = theList;
	
	while(node != null){
		count++;
		node = node.getNext();
	}
	
   	return count;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node at the front of the list.  Once finished, the first node will occur twice.
	public void doubleFirst()
	{
		if(theList != null){
		theList.setNext(new ListNode(theList.getValue(), theList.getNext()));
		}
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public void doubleLast()
	{
		if(theList != null){
			ListNode node = theList;
			while(node.getNext()!=null){
				node = node.getNext();
			}
			node.setNext(new ListNode(node.getValue(), node.getNext()));
		}
	}
	
	//method skipEveryOther will remove every other node
	public void skipEveryOther()
	{

	ListNode node = theList;
	
	while(node!=null && node.getNext() != null){
		node.setNext(node.getNext().getNext());
		node = node.getNext();
	}
	}

	//this method will set the value of every xth node in the list
	public void setXthNode(int x, Comparable value)
	{
		ListNode node = theList;
		int cnt = 1;
		while(node!=null){
			if(cnt>=x){
				node.setValue(value);
				cnt = 1;
			}else{
				cnt++;
			}
			node = node.getNext();
		}
	}	

	//this method will remove every xth node in the list
	public void removeXthNode(int x)
	{
		ListNode node = theList, prev = node;
		int cnt = 1;
		while(node!=null){
			if(cnt>=x){
				prev.setNext(node.getNext());
				cnt = 1;
			}else{
				cnt++;
			}
			prev = node;
			node = node.getNext();
		}
	}		
	//this method will return a String containing the entire list
   public String toString()
   {
   	String output="";
	ListNode node = theList;
	
	while(node != null){
		output += node.getValue() +"  ";
		node = node.getNext();
	}

   	return output;
   }			
	
}