import java.util.Scanner;

public class AdventureEpsilon
{
	public static GameRoom theRoom = new GameRoom();
	public static Box theBox = new Box();
	public static Sign theSign = new Sign();
	public static Book theBook = new Book();
	public static void main(String[] args)
	{
		//Populate the room
		theRoom.addThing(theBox);
		theRoom.addThing(theSign);
		theRoom.addThing(theBook);

		//Create additional useful objects
		Scanner keyboard = new Scanner(System.in); 

		//Display a greeting
		System.out.println("Welcome to Adventure Epsilon!");
		System.out.println();

		//Main loop
		boolean hasQuitGame = false;
		while (!hasQuitGame)
		{
			System.out.println();
			System.out.println();
			System.out.println();
			theRoom.listContents();
			System.out.println();
			System.out.println("What do you wish to do?");
			System.out.println("1. Examine something");
			System.out.println("2. Look into the box");
			System.out.println("3. Put something into the box");
			System.out.println("4. Pull out something out of the box");
			System.out.println("5. Read something.");
			System.out.println("99. Quit this game");
			System.out.print("Your choice? >>>");
			int mainMenuChoice = keyboard.nextInt();
			System.out.println();
			int thingChoice;
			switch (mainMenuChoice)
			{
				case 1:
					System.out.println("Which thing do you want to examine?");
					theRoom.listContents();
					System.out.print("Your choice? (Enter an unlisted number to go back to the main menu) >>>");
					thingChoice = keyboard.nextInt();
					System.out.println();
					if (thingChoice >= 1 && thingChoice <= theRoom.getThingCount())
					{
						GameThing thing = theRoom.getThingByIndex(thingChoice);
						System.out.println(thing.getDescription());
						System.out.println();
					}
					break;
				case 2:
					theBox.lookInto();
					System.out.println();
					break;
				case 3:
					System.out.println("Which thing do you want to put into the box?");
					theRoom.listContents();
					System.out.print("Your choice? (Enter an unlisted number to go back to the main menu) >>>");
					thingChoice = keyboard.nextInt();
					System.out.println();
					if (thingChoice >= 1 && thingChoice <= theRoom.getThingCount())
					{
						GameThing thing = theRoom.getThingByIndex(thingChoice);
						theBox.putIn(thing);
						System.out.println();
					}
					break;
				case 4:
					if (theBox.getThingCount() == 0)
					{
						System.out.println("The box is empty. Nothing can be pulled out of it.");
						System.out.println();
					}
					else
					{
						System.out.println("Which thing do you want to pull out of the box?");
						theBox.lookInto();
						System.out.print("Your choice? (Enter an unlisted number to go back to the main menu) >>>");
						thingChoice = keyboard.nextInt();
						System.out.println();
						if (thingChoice >= 1 && thingChoice <= theBox.getThingCount())
						{
							GameThing thing = theBox.getThingByIndex(thingChoice);
							theBox.pullOut(thing);
							System.out.println();
						}
					}
					break;
				 case 5:

			            System.out.println("Which thing do you want to read?");

			            theRoom.listContents();

			                System.out.print("Your choice? (Enter an unlisted number to go back to the main menu) >>>");

			            thingChoice = keyboard.nextInt();

			            System.out.println();

			            if (thingChoice >= 1 && thingChoice <= theRoom.getThingCount())

			            {

			                  GameThing thing = theRoom.getThingByIndex(thingChoice);

			                  if (thing instanceof Readable)

			                  {

			                        Readable readableThing = (Readable)thing;

			                        readableThing.read();

			                  }

			                  else

			                  {

			                        System.out.println("That's not something you can read!");

			                  }

			                  System.out.println();

			            }

			            break;

			 
				case 99:
					hasQuitGame = true;
					System.out.println("Thank you for playing!");
					break;
				default:
					System.out.println("Please use one of the choices from the menu!");
					System.out.println();
					break;
			}
		}

		//The following line of code is used so that
		//this program runs on computers with Java 7
		//without a warning message from Eclipse.
		//Java 6 can use it, but does not need it.
		keyboard.close();
	}
}
