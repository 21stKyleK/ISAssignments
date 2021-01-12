package forestOfTrees;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Queue;
import java.util.LinkedList;
import static java.lang.System.*;

public class GBinarySearchTree<T extends Comparable<T>>
{
	private GTreeNode<T> root;

	public GBinarySearchTree()
	{
		root = null;
	}

	public void makeEmpty(){
		root = null;
	}

	public void add(T val)
	{
		root = add(val, root);
	}

	private GTreeNode<T> add(T val, GTreeNode<T> tree)
	{
	   if(tree == null)
			return new GTreeNode<T>(val);
		
		T treeValue = tree.getValue();
		int dirTest = val.compareTo(treeValue);		
		
		if(dirTest < 0)
			tree.setLeft(add(val, tree.getLeft()));
		else if(dirTest > 0)
			tree.setRight(add(val, tree.getRight()));
		
		return tree;
	}

	public void inOrder()
	{
		inOrder(root);
		System.out.println("\n");
	}

	private void inOrder(GTreeNode tree)
	{
		if(tree != null){
			inOrder(tree.getLeft());
			System.out.print(tree.getValue() + "  ");
			inOrder(tree.getRight());
		}
	}

	//add in pre, post, level, and rev order traversals
	
	public void preOrder(){
		preOrder(root);
		System.out.prinln("\n");
	}
	
	private void preOrder(GTreeNode t){
		if(t != null){
			System.out.print(t.getValue() + "  ");
			preOrder(t.getLeft());
			preOrder(t.getRight());
		}
	}
	
	public void postOrder(){
		postOrder(root);
		System.out.println("\n");
	}
	
	private void postOrder(GTreeNode t){
		if(t != null){
			postOrder(t.getRight());
			postOrder(t.getLeft());
			System.out.print(t.getValue() + "  ");
		}
	}
	
	public void revOrder()
	{
		inOrder(root);
		System.out.println("\n\n");
	}

	private void revOrder(GTreeNode tree)
	{
		if(tree != null){
			inOrder(tree.getRight());
			System.out.print(tree.getValue() + "  ");
			inOrder(tree.getLeft());
		}
	}
	
	public void levelOrder(){
		levelOrder(root);
		System.out.println("\n");
	}
	
	private void levelOrder(GTreeNode t){
		if(t == null)
			return;
		Queue<GTreeNode> bruh = new LinkedList<GTreeNode>();
		bruh.add(t);
		//forgot about Queues
		while(!bruh.isEmpty()){
			//System.out.println(bruh.remove().getValue());
			GTreeNode arg = bruh.remove();
			System.out.println(arg.getValue() + "  ");
			if(arg.getLeft() != null){
				bruh.add(arg.getLeft());
			}
			if(arg.getRight() != null){
				bruh.add(arg.getRight());
			}
		}
	}


	public int getNumLevels()
	{
		return getNumLevels(root);
	}

	private int getNumLevels(GTreeNode tree)
	{
		if(tree==null)
			return 0;
		else if(getNumLevels(tree.getLeft())>getNumLevels(tree.getRight()))
			return 1+getNumLevels(tree.getLeft());
		else
			return 1+getNumLevels(tree.getRight());
			
		//return 1 + Math.max(getNumLevels(tree.getLeft()),getNumLevels(tree.getRight()));
	}

	
	//add in numLeaves, width, height, numNodes, ifFull etc
	
	public int numNodes(){
		return numNodes(root);
	}
	
	private int numNodes(GTreeNode t){
		if(t != null){
			return 1 + numNodes(t.getLeft()) + numNodes(t.getRight());
		}
		return 0;
	}
	
	public int numLeaves(){
		return numLeaves(root);
	}
	
	private int numLeaves(GTreeNode t){
		if(t != null){
			if(t.getLeft() == null && t.getRight() == null){
				return 1;
			}
			return numLeaves(t.getLeft()) + numLeaves(t.getRight());
		}
		return 0;
	}
	
	public int width(){
		return width(root);
	}
	
	private int width(GTreeNode t){
		if(t == null)
			return 0;
		
		return 1 + getNumLeaves(t.getLeft()) + getNumLevels(t.getRight());
	}
	
	public int height(){
		return getNumLevels(root) - 1;
	}
	
	public boolean isFull(){
		//return (Math.pow(2, getNumLevels(root)) - 1).equals(numNodes(root));
		return (Math.pow(2, getNumLevels(root)) - 1) == numNodes(root);
		//saw an error earlier that said I couldn't use .equals on primitives
	}


	public String toString()
	{
		return toString(root);
	}

	private String toString(GTreeNode tree)
	{
	   if(tree==null)
	      return "";
	   else return "" + toString(tree.getLeft())+ " " + tree.getValue() + " "  + toString(tree.getRight());
	}
}
