package forestOfTrees;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class GTreeNode<T extends Comparable<T>> implements GTreeable<T>
{
	private T treeNodeValue;
	private GTreeNode<T> leftTreeNode;
	private GTreeNode<T> rightTreeNode;

	public GTreeNode( )
	{
		treeNodeValue = null;
		leftTreeNode = null;
		rightTreeNode = null;
	}

	public GTreeNode(T value)
	{
		treeNodeValue = value;
		leftTreeNode = null;
		rightTreeNode = null;
	}

	public GTreeNode(T value, GTreeNode<T> left, GTreeNode<T> right)
	{
		treeNodeValue = value;
		leftTreeNode = left;
		rightTreeNode = right;
	}

	public T getValue()
	{
		return treeNodeValue;
	}

	public GTreeNode<T> getLeft()
	{
		return leftTreeNode;
	}

	public GTreeNode<T> getRight()
	{
		return rightTreeNode;
	}

	public void setValue(T value)
	{
		treeNodeValue = value;
	}

	public void setLeft(GTreeable<T> left)
	{
		leftTreeNode = (GTreeNode<T>)left;
	}

	public void setRight(GTreeable<T> right)
	{
		rightTreeNode = (GTreeNode<T>)right;
	}
}