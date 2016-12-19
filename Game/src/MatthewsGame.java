import java.util.*;
import java.io.*;

public class MatthewsGame 
{
   
	static int numberOfPlayers;
	static List<String> playerNames = new ArrayList<String>();
	static List<String> playerClasses = new ArrayList<String>();
	
	static String player1Name;
	static String player2Name;
	static String player3Name;
	static String player4Name;
	static String player5Name;
	static String player1Class;
	static String player2Class;
	static String player3Class;
	static String player4Class;
	static String player5Class;
	static int player1Hp;
	static int player2Hp;
	static int player3Hp;
	static int player4Hp;
	static int player5Hp;
	

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		introSequence(in);
		
	}

	public static void introSequence(Scanner in)
	{

		// Gets how many players there are
		boolean running = true;
		while (running) 
		{
			System.out.println("How many players are there?\n[1]\n[2]\n[3]\n[4]\n[5]");
			String numberOfPlayersStr = in.next();

			if (numberOfPlayersStr.equals("1") || numberOfPlayersStr.equals("2") || numberOfPlayersStr.equals("3")
					|| numberOfPlayersStr.equals("4") || numberOfPlayersStr.equals("5")) 
			{

				numberOfPlayers = Integer.parseInt(numberOfPlayersStr);
				System.out.println();
				running = false;

			}
			else 
			{
				System.out.println();
				System.out.println("Invalid Input");
			}
			
		}

		// Gets each players name
		for (int i = 1; i <= numberOfPlayers; i++) 
		{
			System.out.println("Player " + i + ", what is your name?");
			in.nextLine();
			playerNames.add(in.nextLine());
			System.out.println();

			// Gets each players class
			running = true;
			while (running) 
			{
				System.out.println(playerNames.get(i - 1) + ", what class would you like to be?");
				System.out.println("[1] Warrior\n[2] Rogue\n[3] Wizard\n[4] Cleric");
				String playerClass = in.next();

				if (playerClass.equals("1")) 
				{
					playerClass = "warrior";
					playerClasses.add(playerClass);
					System.out.println();
					running = false;
				}
				else if (playerClass.equals("2")) 
				{
					playerClass = "rogue";
					playerClasses.add(playerClass);
					System.out.println();
					running = false;
				}
				else if (playerClass.equals("3")) 
				{
					playerClass = "wizard";
					playerClasses.add(playerClass);
					System.out.println();
					running = false;
				}
				else if (playerClass.equals("4")) 
				{
					playerClass = "cleric";
					playerClasses.add(playerClass);
					System.out.println();
					running = false;
				}
				else 
				{
					System.out.println();
					System.out.println("Invalid Input");
				}
				
			}
		}
		
		//initializes player stats into variables
		
		if(numberOfPlayers >= 1)
		{
			player1Name = playerNames.get(0);
			player1Class = playerClasses.get(0);
			
			//put starting hp in a variable
			if(playerClasses.get(0).equals("warrior")){
				player1Hp = 100;
			} else if(playerClasses.get(0).equals("wizard")) {
				player1Hp = 60;
			} else {
				player1Hp = 80;
			}
		}
		if (numberOfPlayers >= 2)
		{
			player2Name = playerNames.get(1);
			player2Class = playerClasses.get(1);
			
			//put starting hp in a variable
			if(playerClasses.get(1).equals("warrior")){
				player2Hp = 100;
			} else if(playerClasses.get(1).equals("wizard")) {
				player2Hp = 60;
			} else {
				player2Hp = 80;
			}
		}
		if (numberOfPlayers >= 3)
		{
			player3Name = playerNames.get(2);
			player3Class = playerClasses.get(2);
			
			//put starting hp in a variable
			if(playerClasses.get(2).equals("warrior")){
				player3Hp = 100;
			} else if(playerClasses.get(2).equals("wizard")) {
				player3Hp = 60;
			} else {
				player3Hp = 80;
			}
		} 
		if(numberOfPlayers >= 4)
		{
			player4Name = playerNames.get(3);
			player4Class = playerClasses.get(3);
			
			//put starting hp in a variable
			if(playerClasses.get(3).equals("warrior")){
				player4Hp = 100;
			} else if(playerClasses.get(3).equals("wizard")) {
				player4Hp = 60;
			} else {
				player4Hp = 80;
			}
		}
		if(numberOfPlayers == 5)
		{
			player5Name = playerNames.get(4);
			player5Class = playerClasses.get(4);
			
			//put starting hp in a variable
			if(playerClasses.get(4).equals("warrior")){
				player5Hp = 100;
			} else if(playerClasses.get(4).equals("wizard")) {
				player5Hp = 60;
			} else {
				player5Hp = 80;
			}
		}
		
		System.out.printf("Names: %s %s %s", player1Name, player2Name, player3Name);
		System.out.printf("Classes: %s %s %s", player1Class, player2Class, player3Class);
		System.out.printf("HP: %d %d %d", player1Hp, player2Hp, player3Hp);

	}

	public static void pressAnyKeyToContinue() 
	{

		System.out.println("Press any key to continue...");
		try 
		{
			System.in.read();
		}
		catch (Exception e) 
		{
		}

	}
	
	public static void exit() throws FileNotFoundException
	{
		
		PrintStream output = new PrintStream(new File("save.txt"));
		
		if(numberOfPlayers >= 1)
		{
			output.printf("%d %d %d", player1Name, player1Class, player1Hp);
		}
		if (numberOfPlayers >= 2)
		{
			output.printf("%d %d %d", player2Name, player2Class, player2Hp);
		}
		if (numberOfPlayers >= 3)
		{
			output.printf("%d %d %d", player3Name, player3Class, player3Hp);
		} 
		if(numberOfPlayers >= 4)
		{
			output.printf("%d %d %d", player4Name, player4Class, player4Hp);
		}
		if(numberOfPlayers == 5)
		{
			output.printf("%d %d %d", player5Name, player5Class, player5Hp);
		}
			
	}

	
}
