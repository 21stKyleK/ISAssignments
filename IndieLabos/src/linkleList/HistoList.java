package linkleList;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.*;
import static java.lang.System.*;

public class HistoList
{
   private HistoNode front;

	public HistoList( )
	{
		front = null;
	}

	//addLetter will add a new node to the front for let if let does not exist
	//addLetter will bump up the count if let already exists
	public void addLetter(char let)
	{
		HistoNode node = front;
		boolean didThing = false;
		while(node!=null){
			if(node.getLetter() == let){
				node.setLetterCount(node.getLetterCount() +1);
				didThing = true;
				break;
			}
			node = node.getNext();
		}
		if(!didThing){
			front = new HistoNode(let, 1, front);
		}
		//use the indexOf function
	}

	//returns the index pos of let in the list if let exists
	public int indexOf(char let)
	{
		HistoNode node = front;
		int i = 0;
		while(node!=null){
			if(node.getLetter() == let){
				return i;
			}
			i++;
			node = node.getNext();
		}
		
		return -1;
	}

	//returns a reference to the node at spot
	private HistoNode nodeAt(int spot)
	{
		HistoNode current=null, node = front;
		
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
		HistoNode node = front;

		while(node!=null){
			output+= node.getLetter()+" - "+node.getLetterCount()+"  ";
			node = node.getNext();
		}

		return output;
	}
}