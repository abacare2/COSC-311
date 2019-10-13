/**
 * A class that defines constructors for the 
 * Database Array object.
 */
public class DatabaseArray 
{
	public DatabaseRecord[] dataRecord;
	public int length;
	public int max;
	
	public DatabaseArray() // no argument constructor
	{
		dataRecord = new DatabaseRecord[10];
		length = 0;
		max = 10;
	}
	
	public DatabaseArray(int size) //Constructor for creating the array
	{
		dataRecord = new DatabaseRecord[size];	//initialize the array 
		length = 0;								//remains 0 because nothing has been added.
		max = size;								//We don't want to exceed the length of the array
	}
	
	//Records of type Database Record should be added at the end of the DatabaseArray.
	
	public int addRecord (DatabaseRecord r) //add a record to the end of the array
	{
		dataRecord[length] = r;		//add new record to the next available position in the array;
		length++;					//update length, which holds the amount of positions filled
		return (length - 1);		//returns location where 'r' was added
	}
}
