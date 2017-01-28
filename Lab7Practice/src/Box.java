import java.util.ArrayList;

public class Box implements GameThing
{
	private ArrayList<GameThing> boxContents = new ArrayList<GameThing>();

	public String getName()
	{
		return "A cardboard box";
	}
	public String getDescription()
	{
		return "This is a large cardboard box decorated in a grid pattern.";
	}

	/** Put something inside the box */
	public void putIn(GameThing thing)
	{
		if (thing != null)
		{
			if (thing == AdventureEpsilon.theBox)
			{
				System.out.println("You can't put the box inside itself!");
			}
			else
			{
				if (boxContents.contains(thing))
				{
					System.out.println("That's already in the box!");
				}
				else
				{
					//Now, the thing should not be directly in the room
					AdventureEpsilon.theRoom.removeThing(thing);
					boxContents.add(thing);					
					System.out.println("Done.");
				}
			}
		}
	}

	/** Pull something out of the box */
	public void pullOut(GameThing thing)
	{
		if (thing != null)
		{
			if (thing == AdventureEpsilon.theBox)
			{
				System.out.println("You can't pull out the box from within itself, that doesn't make sense!");
			}
			else
			{
				if (boxContents.contains(thing))
				{
					boxContents.remove(thing);
					//Now, the thing should be put back in the room
					AdventureEpsilon.theRoom.addThing(thing);
					System.out.println("Done.");
				}
				else
				{
					System.out.println("That's not in the box!");
				}
			}
		}
	}

	/** Look into the box */
	public void lookInto()
	{
		if (boxContents.isEmpty())
		{
			System.out.println("The box is empty.");
		}
		else
		{
			System.out.println("The box contains:");
			int counter = 1;
			for (GameThing thing: boxContents)
			{
				System.out.println(counter + ". " + thing.getName());
				counter++;
			}
		}
	}

	/** Check to see whether a particular thing is currently in the box */
	public boolean hasThing(GameThing thing)
	{
		return boxContents.contains(thing);
	}

	/** Get the amount of things in the box */
	public int getThingCount()
	{
		return boxContents.size();
	}
	
	/** Get the thing with the indicated index number */
	public GameThing getThingByIndex(int thingChoice)
	{
		if (thingChoice >= 1 && thingChoice <= boxContents.size())
		{
			return boxContents.get(thingChoice - 1);
		}
		else
		{
			return null;
		}
	}
}
