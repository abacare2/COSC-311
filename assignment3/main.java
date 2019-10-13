
public class main 
{
	public static void main(String[] args)
	{
		memBlock a = new memBlock(20);
		cache c = new cache(5);
		
		for (int i = 0; i < a.length; i++)	//initialize memory for testing purposes
		{
			a.setBlock(i, 1+i*3);
		}
		/*for (int i = 0; i < a.length; i++)
		{
			System.out.println(a.getBlock(i));
		}*/
		
		for (int i = 0; i < c.length; i++)	//direct mapping cache
		{
			c.setCache(i, a.getBlock(i));
		}
		
		for (int i = 0; i < c.length; i++)
		{
			System.out.println(c.getCache(i));
		}
	}
}
