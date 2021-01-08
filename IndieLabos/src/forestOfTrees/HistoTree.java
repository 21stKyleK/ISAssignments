//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class HistoTree
{
   private HistoNode root;

	public HistoTree( )
	{
		root = null;
	}

	public void addData(Comparable data)
	{
		//root = add(data, root);
		HistoNode gotten = search(data);
		
		if(gotten == null){
			root = add(data, root);
		}else{
			found.setDataCount(found.getDataCount() + 1);
		}
	}

	private HistoNode add(Comparable data, HistoNode tree)
	{
		if(tree == null){
			return new HistoNode(data, 1, null, null);
		}
		int comparedV = data.compareTo(tree.getData());
		
// 		if(comparedV==0)
// 			return tree.setDataCount(tree.getDataCount() + 1);
		else if(comparedV<0)
// 			return add(data, tree.getLeft());
			return tree.setLeft(add(data, tree.getLeft()));
		else
// 			return add(data, tree.getRight());
			return tree.setRight(add(data, tree.getRight()));
	}

	public HistoNode search(Comparable data)
	{
		return search(data, root);
	}

	private HistoNode search(Comparable data, HistoNode tree)
	{
		if(tree != null){
			int comparedV = data.compareTo(tree.getData());
			//if negative, then the first value is lower than the parameter
			
			if(comparedV==0)
				return tree;
			else if(comparedV<0)
				return search(tree.getLeft());
			else
				return search(tree.getRight());
		}
		return null;
	}

	public String toString()
	{
		return toString(root).trim();
	}

	private String toString(HistoNode tree)
	{
		if(tree == null)
			return "";
		return toString(tree.getLeft()) + "  " + tree.getData() + "--" + tree.getDataCount() + "  " + toString(tree.getRight());
	}
}
