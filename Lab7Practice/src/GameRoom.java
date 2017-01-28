import java.util.ArrayList;

public class GameRoom
{
	private ArrayList<GameThing> roomContents = new ArrayList<GameThing>();

	/** Add something to the room */
	public void addThing(GameThing thing)
	{
		//Since ArrayList objects allow us to add null values,
		//we have to make sure that we act only if we received
		//a non-null reference
		if (thing != null)
		{
			//Since ArrayList objects allow us to add the same value
			//multiple times, we have to make sure that we act only
			//if the thing is not already in the contents
			if (!roomContents.contains(thing))
			{
				//OK, let's add the thing then!
				roomContents.add(thing);					
			}
		}
	}
	
	/** Remove something from the room */
	public void removeThing(GameThing thing)
	{
		//Fortunately, if we try to remove something from an
		//ArrayList object that is not there, Java will not
		//generate an error. Thus, we don't need to check
		//to see if the thing is already in the contents
		roomContents.remove(thing);
	}

	/** Display the list of things in the room */
	public void listContents()
	{
		if (roomContents.isEmpty())
		{
			System.out.println("There is nothing here!");
		}
		else
		{
			System.out.println("You see the following:");
			int counter = 1;
			for (GameThing thing: roomContents)
			{
				System.out.println(counter + ". " + thing.getName());
				counter++;
			}
		}
	}
	
	/** Check to see whether a particular thing is currently in the room */
	public boolean hasThing(GameThing thing)
	{
		return roomContents.contains(thing);
		//Note: The above statement is the same as the following code,
		//except that it is shorter. It's just a matter of preference.
		//    if (roomContents.contains(thing))
		//    {
		//	      return true;
		//    }
		//    else
		//    {
		//	      return false;
		//    }
	}

	/** Get the amount of things in the room */
	public int getThingCount()
	{
		return roomContents.size();
	}
	
	/** Get the thing with the indicated index number */
	public GameThing getThingByIndex(int thingChoice)
	{
		if (thingChoice >= 1 && thingChoice <= roomContents.size())
		{
			//ArrayLists begin counting things at 0
			//But we present the list of things to the user starting at 1
			//Therefore, we need to subtract one from the user's thing choice
			return roomContents.get(thingChoice - 1);
		}
		else
		{
			return null;
		}
	}
}
