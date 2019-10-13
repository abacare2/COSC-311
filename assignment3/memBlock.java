
public class memBlock 
{
	int block[];
	int length;
	
	public memBlock()	//default constructor
	{
		block = new int[10];
		length = 10;
	}
	public memBlock(int size)	//constructor that allows users to input the number of memory blocks in the machine
	{
		block = new int[size];
		length = size;
	}
	
	public void setBlock(int set, int data)	//allows us to put data into the array
	{
		block[set] = data;
	}
	public int getBlock(int location)
	{
		return block[location];
	}
}
