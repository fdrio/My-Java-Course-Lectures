
public class Book implements GameThing, Readable{
	public String getName(){
		return "Java Book";
	}
	
	public String getDescription(){
		return "How to use Interfaces Section.	";
	}
	
	public void read(){
		System.out.println("A class can implement multiple interfaces.");
	}

}
