
public class OrderedArray 
{
	public IndexRecord[] inRecord;
	public int length;
	public int max;
	
	public OrderedArray() // no argument constructor
	{
		inRecord = new IndexRecord[10];
		length = 0;
		max = 10;
	}
	
	public OrderedArray(int size) //Constructor for creating the array
	{
		inRecord = new IndexRecord[size];	//initialize the array 
		length = 0;								//remains 0 because nothing has been added.
		max = size;								//We don't want to exceed the length of the array
	}
	
	//Insertions must maintain the order in the array, by key value.
	
	public boolean addIndex (IndexRecord r) //add a record in order.
	{
		
	}
}
