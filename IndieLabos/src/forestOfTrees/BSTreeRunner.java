package forestOfTrees;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class BSTreeRunner
{
   public static void main( String args[] )
   {
 		//add test cases here
 		
 		BinarySearchTree bruh = new BinarySearchTree();
 		
 		for(int i = 0; i < 20; i+=2) {
 			bruh.add(i);
			//all values in for loop go to right
 		}
 		
 		bruh.inOrder();
 		bruh.preOrder();
 		bruh.postOrder();
 		bruh.reverseOrder();
   }
}