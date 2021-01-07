package linkleList;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class ListNode implements Linkable
{
	private Comparable listNodeValue;
	private ListNode nextListNode;

	public ListNode()
	{
		listNodeValue = null;
		nextListNode = null;
	}

	public ListNode(Comparable value, ListNode next)
	{
		listNodeValue=value;
		nextListNode=next;
	}

	public Comparable getValue()
	{
		return listNodeValue;
	}

	public ListNode getNext()
	{
	   return nextListNode;
	}

	public void setValue(Comparable value)
	{
		listNodeValue = value;
	}

	public void setNext(Linkable next)
	{
		nextListNode = (ListNode)next;
	}
	
	//if want previous node, you have to go back around to the one before it using nexts (assuming that the last takes you to the first)
}