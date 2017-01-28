public class Sign implements GameThing, Readable
{
	public String getName()
	{
		return "A wooden sign";
	}
	public String getDescription()
	{
		return "This is a small wooden sign. There seems to be some partially faded writing in it.";
	}
	public void read(){
		 System.out.println("You can see the following message: \"I was here!\"");
	}
}
