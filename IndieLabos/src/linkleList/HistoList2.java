package linkleList;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.*;
import static java.lang.System.*;

public class HistoList2
{
   private ListNode front;

	public HistoList2( )
	{
		front = null;
	}

	//addLetter will add a new node to the front for let if let does not exist
	//addLetter will bump up the count if let already exists
	public void add(Object let)
	{
//		HistoNode node = front;
//		boolean didThing = false;
//		while(node!=null){
//			if(node.getLetter() == let){
//				node.setLetterCount(node.getLetterCount() +1);
//				didThing = true;
//				break;
//			}
//			node = node.getNext();
//		}
//		if(!didThing){
//			front = new HistoNode(let, 1, front);
//		}
		//use the indexOf function
		int i = indexOf(let);
		if(i == -1) {
			front = new ListNode( new ThingCount(let, 1), front);
			//you can do this,as the value of the reference is being put in
		}else {
			ListNode bruh = nodeAt(i);
			((ThingCount)bruh.getValue()).setCount( ( (ThingCount)bruh.getValue() ).getCount()+1 );
			//left side must be a variable, and you can cast a type and use its methods/variables
		}
	}
	
	public void remove(Object bruh) {
		int i = indexOf(bruh);
		if(-1!=i) {
			ListNode node = nodeAt(i);
			ThingCount data = (ThingCount)node.getValue();
			
			boolean aaaa = false;
			
			if( ( (ThingCount)node.getValue() ).getCount() > 1 ) {
				data.setCount(data.getCount() - 1);
			}else if(aaaa){
				
			}
		}
	}

	//returns the index pos of let in the list if let exists
	public int indexOf(Object let)
	{
		ListNode node = front;
		int i = 0;
		while(node!=null){
//			if(node.getValue().equals(let)){
			if( ( (ThingCount)node.getValue() ).compareTo(new ThingCount(let, 0)) == 0 ){
				//compares the value, not the count
				return i;
			}
			i++;
			node = node.getNext();
		}
		
		return -1;
	}

	//returns a reference to the node at spot
	private ListNode nodeAt(int spot)
	{
		ListNode current=null, node = front;
		
		for(int i = 0; i<=spot; i++){
			current = node;
			if(node!=null){
				node = node.getNext();
			}
		}

		return current;
	}

	//returns a string will all values from list
	public String toString()
	{
		String output = "";
		ListNode node = front;

		while(node!=null){
			output+= node.getValue() + "  "/*+" - "+node.getLetterCount()+"  "*/;
			node = node.getNext();
		}

		return output;
	}
}