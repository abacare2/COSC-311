
public class IndexRecord 
{
	private String key;
	private int where;
	String first;
	String last;
	String id;
	
	//Default constructor
	public IndexRecord()
	{
		id = "Not Entered";
		first = "Not Entered";
		last = "Not Entered";
	}
	//constructor
	public IndexRecord(String id, String first, String last)
	{
		this.id = id;
		this.first = first;
		this.last = last;
	}
	
}
