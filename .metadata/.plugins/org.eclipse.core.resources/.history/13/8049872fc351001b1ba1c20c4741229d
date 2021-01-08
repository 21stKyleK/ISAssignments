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
	   
	   int[] testVals = {13, 54, 23, 1, 1, -34, 93, 17, 8, 7, -12, 43, 8, 43}
 		
	   /*
 		for(int i = 0; i < 20; i+=2) {
 			bruh.add(i);
			//all values in for loop go to right
 		}
		*/
	   
	   for(int j : testVals){
		bruh.add(j);   
	   }
 		
 		bruh.inOrder();
 		bruh.preOrder();
 		bruh.postOrder();
 		bruh.reverseOrder();
	   
	   System.out.println(bruh);
	   
	   System.out.println(bruh.getNumNodes());
	   System.out.println(bruh.getNumLevels());
	   System.out.println(bruh.isFull());
	   System.out.println(bruh.getNumLeaves());
	   System.out.println(bruh.getWidth());
	   System.out.println(bruh.getHeight());
   }
}
