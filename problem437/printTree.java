public class printTree 
{
	public void printDifference(tree t, key a, key b)
	{
		int k1 = a;	//O(1)
		int k2 = b;	//O(1)
		
		while(k2 >= k1)	//O(n log n)	//the while loop runs N times the number of times the "if" statement runs. 
		{
			while(k2.left != null) //O(log n)
				System.out.println(k2.left); //O(1)
			k2 = k2.left;	//O(n + 1)
		}
	}
}
// We only check half the tree, since the other half will be greater than k2, which binds the running time to log n. We repeat the loop n times, so the entire method is bound by 
O(n log n). 