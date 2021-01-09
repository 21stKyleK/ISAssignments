package forestOfTrees;

public class HistoTreeTwo {
	private TreeNode root;

	public HistoTreeTwo( )
	{
		root = null;
	}

	public void addData(Comparable data)
	{
		//root = add(data, root);
		TreeNode gotten = search(data);
		
		if(gotten == null){
			root = add(data, root);
		}else{
			((ThingCount) gotten.getValue()).setCount( ((ThingCount) gotten.getValue() ).getCount() + 1 );
		}
	}

	private TreeNode add(Comparable data, TreeNode tree)
	{
		if(tree == null){
			return new TreeNode(new ThingCount(data, 1), null, null);
		}
		int comparedV = data.compareTo( ((ThingCount)tree.getValue()).getThing() );
		
// 		if(comparedV==0)
// 			return tree.setDataCount(tree.getValueCount() + 1);
		if(comparedV<0)
// 			return add(data, tree.getLeft());
			tree.setLeft(add(data, tree.getLeft()));
		else
// 			return add(data, tree.getRight());
			tree.setRight(add(data, tree.getRight()));
		
		return tree;
	}

	public TreeNode search(Comparable data)
	{
		return search(data, root);
	}

	private TreeNode search(Comparable data, TreeNode tree)
	{
		if(tree != null){
			int comparedV = data.compareTo( ((ThingCount)tree.getValue()).getThing() );
			//if negative, then the first value is lower than the parameter
			
			if(comparedV==0)
				return tree;
			else if(comparedV<0)
				return search(data, tree.getLeft());
			else
				return search(data, tree.getRight());
		}
		return null;
	}

	public String toString()
	{
		return toString(root).trim();
	}

	private String toString(TreeNode tree)
	{
		if(tree == null)
			return "";
		return toString(tree.getLeft()) + "  " + tree.getValue() + "  " + toString(tree.getRight());
	}
}
