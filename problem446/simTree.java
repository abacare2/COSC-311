package testcircu;

public class simTree 
{
	public boolean isSimilar(tree a, tree b)
	{
		if(findRightHeight(a) == findRightHeight(b) && findLeftHeight(a) == findLeftHeight(b))	//4(nlog n)
			return true;
		else 
			return false;
	}
	public int findRightHeight(tree a) //(nlog n)
	{
		int height = 0;	//constant time
		if(a.root != null)	//constant time
		{
			Node node = a.root;
			while(node.right != null)	//log n
			{
				node = node.right;
				height++;	//n + 1
			}
			return height;
		}
		else
			return height;			
	}
	public int findLeftHeight(tree a) // log n
	{
		int height = 0;
		if(a.root != null)
		{
			Node node = a.root;
			while(node.left != null)
			{
				node = node.left;
				height++;
			}
			return height;
		}
		else
			return height;			
	}
}

//bound by 4(nlog n). Since 4 is a constant and nonzero, we are bound by nlog n