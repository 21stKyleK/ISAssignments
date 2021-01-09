package forestOfTrees;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;
import java.util.LinkedList;

public class BinarySearchTree
{
	private TreeNode root;

	public BinarySearchTree()
	{
		root = null;
	}

	public void add(Comparable val)
	{
		root = add(val, root);
	}

	private TreeNode add(Comparable val, TreeNode tree)
	{
	   if(tree == null) {
			return new TreeNode(val);
	   }
		Comparable treeValue = tree.getValue();
		int dirTest = val.compareTo(treeValue);
		
		//adds values based on previous values, heaps do the sorting
		
		if(dirTest < 0)
			tree.setLeft(add(val, tree.getLeft()));
		else if(dirTest > 0)
			tree.setRight(add(val, tree.getRight()));
		
		return tree;
	}

   public void inOrder()
	{
		inOrder(root);
		System.out.println("\n\n");
	}

	private void inOrder(TreeNode tree)
	{
		if (tree != null){
			inOrder(tree.getLeft());
			System.out.print(tree.getValue() + "  ");
			inOrder(tree.getRight());
		}
	}

	//add preOrder, postOrder, and revOrder
	
	public void preOrder() {
		preOrder(root);
		System.out.println("\n\n");
	}
	
	private void preOrder(TreeNode tree) {
		if(tree == null) {
			return;
		}
		System.out.print(tree.getValue() + "  ");
		preOrder(tree.getLeft());
		preOrder(tree.getRight());
	}
	
	
	public void postOrder() {
		postOrder(root);
		System.out.println("\n\n");
	}
	
	private void postOrder(TreeNode tree) {
		if(tree != null) {
			postOrder(tree.getLeft());
			postOrder(tree.getRight());
			System.out.print(tree.getValue() + "  ");
		}
	}
	

	public void reverseOrder() {
		reverseOrder(root);
		System.out.println("\n\n");
	}
	
	private void reverseOrder(TreeNode tree) {
		if(tree == null) 
			return;
		
		reverseOrder(tree.getRight());
		System.out.print(tree.getValue() + "  ");
		reverseOrder(tree.getLeft());
	}
	

	public int getNumLevels()
	{
		return getNumLevels(root);
	}

	private int getNumLevels(TreeNode tree)
	{
		if(tree==null)
			return 0;
		else if(getNumLevels(tree.getLeft())>getNumLevels(tree.getRight()))
			return 1+getNumLevels(tree.getLeft());
		else
			return 1+getNumLevels(tree.getRight());
	}


	//add getNumLeaves, getWidth, getHeight, getNumNodes, and isFull

	public int getNumLeaves() {
		return getNumLeaves(root);
	}
	
	private int getNumLeaves(TreeNode t) {
		if(t == null) 
			return 0;
		
		if(t.getLeft() == null && t.getRight() == null) {
			return 1;
		}else {
			return getNumLeaves(t.getLeft()) + getNumLeaves(t.getRight());
		}
	}

	public int getWidth(){
		return getWidth(root);
	}

	private int getWidth(TreeNode t){
		if(t == null){return 0;}
		//root will be 1
		//deepest number of leaves (left) + 1 + deepest level of leaves (right)
		//leaves can be left or right
		
		return 1 + getNumLevels(t.getLeft()) + getNumLevels(t.getRight());
		//thought of this, but thought it wouldn't work
	}

	public int getHeight(){
		return getNumLevels(root) - 1;
	}

	public int getNumNodes(){
		return getNumNodes(root);
	}

	private int getNumNodes(TreeNode t){
		if(t == null)
			return 0;
		
		return 1 + getNumNodes(t.getLeft()) + getNumNodes(t.getRight());
	}

	public boolean isFull(){
		//return isFull(root);
		return (Math.pow(2, getNumLevels() )-1) == getNumNodes();
	}
	
// 	private boolean isFull(TreeNode t){
// 		if(t == null){ return false;}
		
// 		return ( (t.getLeft() == null && t.getRight() == null) || (t.getLeft() != null && t.getRight() != null) ) ;
// 	}
	
	//add extra credit options here - 10 points each
	
	//search
	
	//maxNode
	
	//minNode
	
	//level order
	
	//display like a tree
	
	//remove


	public String toString()
	{
		return "The tree in order: " + toString(root);
	}

	private String toString(TreeNode tree)
	{
		if(tree == null)
			return "";
		
		return toString(tree.getLeft())+ "  " + tree.getValue() + "  " + toString(tree.getRight());
	}
}
