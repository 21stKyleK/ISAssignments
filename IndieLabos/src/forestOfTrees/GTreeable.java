package forestOfTrees;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public interface GTreeable<T extends Comparable<T>>
{
	public Object getValue();
	public GTreeable<T> getLeft();
	public GTreeable<T> getRight();
	public void setValue(T value);
	public void setLeft(GTreeable<T> left);
	public void setRight(GTreeable<T> right);
}