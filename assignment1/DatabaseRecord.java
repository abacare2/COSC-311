/**
 * @author abacare2
 *
 */
public class DatabaseRecord 
{
	private String id;
	private String first;
	private String last;
	public DatabaseRecord[] DatabaseArray;
	
	public DatabaseRecord(String id, String first, String last) //setter method
	{
		this.id = id;
		this.first = first;
		this.last = last;
	}
	public String toString() //getter method
	{
		return id+ " " + first + " "+ last;
	}
		
	public DatabaseRecord() //default constructor
	{
		id = "Not Entered";
		first = "Not Entered";
		last = "Not Entered";
	}	
}
