//	Project:	Testing of Print and Println
//  Author:		Brad D. Messner
//  Date:		Feb 5, 2020
//  Version:	1.0
//	Git User:	bradmessner
import java.util.Scanner;
import java.util.Random;
import java.io.*;


public class topic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Turn on keyboard and randomizer
				Scanner keyboard = new Scanner(System.in);
				Random randomNumber = new Random();

				// Declare Variables
		   
				// Attribute variables
				String name = null;
				int armour = 0;
				int strength = 0;
				int magic = 0;
				int intelligience = 0;
				int sneak = 0;
				int quickness = 0;


				// Damage & health variables
				int health = 100;
				int extraSmallDamage = randomNumber.nextInt(5 - 1) + 1;
				int smallDamage = randomNumber.nextInt(10 - 1) + 1;
				int mediumDamage = randomNumber.nextInt(20 - 10) + 10;
				int largeDamage = randomNumber.nextInt(30 - 20) + 20;


				// Choice variables
				int choice1;
				int choice2;
				int choice3;
				int choice4;
				int choice5;
				int choice6;
				int choice7;
				int choice8;
				int continue1 = 0;
				int characterChoice = 0;


				// Game introduction
				System.out.println("Welcome to Dungeon Escape the choice based role playing game.");
				System.out.println("\nIn this game you will make decisions that you think will best help you reach the end of the dungeon.");
				System.out.println("nYour score is based on how much health you have left when you finish.");
				System.out.println("\nLets start by choosing your character.");

				do
				{
					// Character choice menu
					mainMenu();
					characterChoice = keyboard.nextInt();

					// User chooses character 
					switch (characterChoice)
					{
					case 1:
						armour = 8;
						strength = 8;
						magic = 3;
						intelligience = 4;
						sneak = 3;
						quickness = 4;
						System.out.println("Good choice! The knight is a well balanced character with heavy armour and strong attacks. \n\nNow enter your first name.");
						name = keyboard.next();
						System.out.println("\nAlright " + name + ", it's time to enter the dungeon, dont let your health reach zero!");
						break;
					case 2:
						armour = 4;
						strength = 2;
						magic = 10;
						intelligience = 8;
						sneak = 4;
						quickness = 2;
						System.out.println("Good choice! The mage is an intelligient character with high level magic. \n\nNow enter your first name.");
						name = keyboard.next();
						System.out.println("\nAlright " + name + ", it's time to enter the dungeon, Don't let your health reach zero!");
						break;
					case 3:
						armour = 3;
						strength = 3;
						magic = 1;
						intelligience = 6;
						sneak = 9;
						quickness = 8;
						System.out.println("Good choice! The thief is a quick and sneaky character. \n\nNow enter your first name.");
						name = keyboard.next();
						System.out.println("\nAlright " + name + ", it's time to enter the dungeon, Don't let your health reach zero!");
						break;
					case 4:
						armour = 9;
						strength = 10;
						magic = 4;
						intelligience = 2;
						sneak = 2;
						quickness = 3;
						System.out.println("Good choice! The barbarian has brute like strength and extremely heavy armour. \n\nNow enter your first name.");
						name = keyboard.next();
						System.out.println("\nAlright " + name + ", it's time to enter the dungeon, Don't let your health reach zero!");
						break;
					case 5:
						armour = 6;
						strength = 3;
						magic = 7;
						intelligience = 7;
						sneak = 2;
						quickness = 5;
						System.out.println("Good choice! The warlock is a well balanced character who is good in magic and protected by decent armour. \n\nNow enter your first name.");
						name = keyboard.next();
						System.out.println("\nAlright " + name + ", it's time to enter the dungeon, Don't let your health reach zero!");
						break;
					case 6:
						armour = 4;
						strength = 3;
						magic = 2;
						intelligience = 4;
						sneak = 8;
						quickness = 9;
						System.out.println("Good choice! The assasin is a sneaky character who hits hard and fast. \n\nNow enter your first name.");
						name = keyboard.next();
						System.out.println("\nAlright " + name + ", it's time to enter the dungeon, Don't let your health reach zero!");
						break;
					default:
						System.out.println("Your choice was invalid, please choose a number 1-6\n\n");
					}
				}while (characterChoice > 6 | characterChoice <1);


				// Choice 1
				do
				{
					System.out.println("\nAs you enter the dungeon it splits into two directions, will you go \n\n================\n\t1. left \n\t2. right\n================");
					choice1 = keyboard.nextInt();

					// Possible results of choice 1
					switch (choice1)
					{
					case 1:
						System.out.println("You turn down a long corridor and at the end see a demon staring back at you.\nTo continue you're going to have to defeat the demon.");				
						break;
					case 2:
						System.out.println("Oh no you've walked into a bear trap!");
						break;
					default:
						System.out.println("\nYour choice was invalid please choose 1 or 2.\n\n");
					}
				}while(choice1 > 2 | choice1 < 1);

				
				// Used to break up the output
				breakUp(continue1);	

				
				// Consequences of choosing case 2 for choice 1
				if (choice1 == 2 && armour < 5)
				{
					System.out.println("\n==========================================");
					System.out.println("\nYou have light armour causing more damage. \n\n\tHealth is now ---->" + (health = health - mediumDamage));
					System.out.println("==========================================");
					System.out.println("\n\nYou've escaped the bear trap and you continue through the dungeon");
				}

				if (choice1 == 2 && armour > 5)
				{
					System.out.println("\n========================================");
					System.out.println("You have heavy armour causing less damage. \n\n\tHealth is now ---->" + (health = health - smallDamage));
					System.out.println("========================================");
					System.out.println("\n\nYou've escaped the bear trap and you continue through the dungeon");
				}

				// Consequences of choosing case 1 for choice 1
				if (choice1 == 1 && strength > 4)
				{
					System.out.println("\n========================================================================\nYou have great strength and defeating the the demon is no challenge, minimal damage taken. \n\n\tHealth is now ---->" + (health = health - extraSmallDamage) + ("\n========================================================================\n"));
				}

				if (choice1 == 1 && strength < 4)
				{
					System.out.println("\n========================================================================\nYou lack strength and defeating the demon is difficult. \n\n\tHealth is now ---->" + (health = health - mediumDamage) + ("\n========================================================================\n"));			
				}

				
				//Used to break up the output
				breakUp(continue1);


				// Choice 2
				do
				{
					System.out.println("\n\nAs you continue you see two sets of stairs. One going up and one going down, will you go \n\n================\n\t1. up \n\t2. down\n================");
					choice2 = keyboard.nextInt();

					// Possible results of choice 2
					switch (choice2)
					{
					case 1:
						System.out.println("As you proceed up the stairs there is a massive pit between you and where you need to go to continue through the dungeon. \nYou must figure out a safe way to cross.");
						break;
					case 2:
						System.out.println("As you proceed down the stairs you reach a magicly sealed door. \nYou will need to use magic to break the seal. ");
						break;
					default:
						System.out.println("\nYour choice was invalid please choose 1 or 2.\n\n");
					}
				}while(choice2 > 2 | choice2 < 1);

				
				// Used to break up the output
				breakUp(continue1);

				
				// Consequences of choosing case 1 for choice 2
				if (choice2 == 1 && intelligience > 5)
				{
					System.out.println("\n===============================================================================\nYou have the necessary intelligience to find a safe way across, no damage taken\n===============================================================================\n");
				}

				if (choice2 == 1 && intelligience < 5)
				{
					System.out.println("\n========================================================================\nYou lack the intelligience to find a way across so you attempt to jump. \nIn the process you smash your face on the ledge causing damage to you. \n\n\tHealth is now ---->" + (health = health - mediumDamage) + ("\n========================================================================\n"));
				}

				// Consequences of choosing case 2 for choice 2
				if (choice2 == 2 && magic > 6)
				{
					System.out.println("\n====================================================================================================\nYour skills in magic are strong enough to break the magic seal and you continue through the dungeon."  + "\n====================================================================================================\n");
				}

				if (choice2 == 2 && magic < 6)
				{
					System.out.println("\n==========================================================================================\nYour skills in magic are inadequit and you are forced to break down the \nmagic seal using physical force. This does a great amount of damage to you. \n\n\tHealth is now ---->" + (health = health - largeDamage) + ("\n=========================================================================================\n"));
				}

				
				// Used to break up input 
				breakUp(continue1);


				// Choice 3
				do
				{
					System.out.println("\n\nAs you continue through the dungeon there is a hatch to decend or a ladder to climb up. Will you  \n\n==========================\n\t1. climb up \n\t2. decend down\n==========================");
					choice3 = keyboard.nextInt();

					// Possible results of choice 3 
					switch (choice3)
					{
					case 1:
						System.out.println("As you reach the top of the ladder you trigger a trap and suddenly a boulder falls from above!");
						break;
					case 2:
						System.out.println("As you decend down deeper you come across an enemy three times your size, you'll have to sneak past to have any chance of surviving.");
						break;
					default:
						System.out.println("Your choice was invalid, please choose 1 or 2.\n\n");
					}
				}while(choice3 > 2 | choice3 < 1);

				
				// Used to break up input 
				breakUp(continue1);

				
				// Consequences of choosing case 1 for choice 3
				if (choice3 == 1 && quickness > 6)
				{
					System.out.println("\n========================================================================\nYour quickness saves you from a big loss of health, no damage taken.\n========================================================================\n");
				}

				if (choice3 == 1 && quickness < 6)
				{
					System.out.println("\n========================================================================\nYou are not quick enough and the boulder crushes you dealing big damage. \n\n\tHealth is now ---->" + (health = health - largeDamage) + ("\n========================================================================\n"));
				}

				// Consequences of choosing case 2 for choice 3
				if (choice3 == 2 && sneak > 5)
				{
					System.out.println("\n========================================================================\nYou are able to sneak past the beast without being noticed, no damage taken.\n=======================================================================================\n");
				}

				if (choice3 == 2 && sneak < 5 && strength > 7)
				{
					System.out.println("\n========================================================================\nYou aren't quiet enough and the beast notices you. However your strength \nallows you to fend him off and escape with minimul damage. \n\n\tHealth is now ---->" + (health = health - smallDamage) + "\n========================================================================\n");
				}

				if (choice3 == 2 && sneak < 5 && strength < 7)
				{
					System.out.println("\n========================================================================\nYou aren't quiet enough and the beast notices you. When the beast attacks\nyou lack the strength needed to fend it off and you take a large amount\nof damage before you are able to escape. \n\n\tHealth is now ---->" + (health = health - largeDamage) + "\n========================================================================\n");
				}

				
				// Used to break up input
				breakUp(continue1);


				// Choice 4
				do
				{
					System.out.println("You continue through a long corridor and see two doors. Will you go through the \n\n==========================\n\t1. left door \n\t2. right door\n========================== ");
					choice4 = keyboard.nextInt();

					//Possible results of choice 4
					switch(choice4)
					{
					case 1:
						System.out.println("As you advance through the left door you discover a large health potion laying on the ground.");
						break;
					case 2:
						System.out.println("As you advance through the right door you discover a small health potion laying on the ground.");
						break;
					default:
						System.out.println("Your choice was invalid, please choose 1 or 2.\n\n");
					}
				}while (choice4 > 2 | choice4 < 1 );
				
				
				// Used to break up input
				breakUp(continue1);
						
				
				// Consequences of choosing case 1 for choice 4
				if (choice4 == 1)
				{
					System.out.println("\n======================================================\nYou happily drink the large potion and gain 20 health. \n\n\tHealth is now ---->" + (health = health + 20) + "\n======================================================\n");
				}
				
				// Consequences of choosing case 2 for choice 4
				if (choice4 == 2 )
				{
					System.out.println("\n======================================================\nYou happily drink the small potion and gain 10 health. \n\n\tHealth is now ---->" + (health = health + 10) + "\n======================================================\n");
				}
				
				
				// Used to break up input
				breakUp(continue1);
				
				
				// Choice 5
				do
				{
				System.out.println("You come into a large open room, to go left you must swim across a pool of murky water. To go right you must do battle with a small myserious cloaked creature. Will you \n\n==========================\n\t1. swim \n\t2. do battle\n==========================");
				choice5 = keyboard.nextInt();
				
				// Possible results of choice 5
				switch (choice5)
				{
				case 1:
					System.out.println("As you swim across the murky water an ancient croc rises from the depths to attack you!");
					break;
				case 2:
					System.out.println("As you begin battle with the mysterious creature it attacks with unbelievable speed!");
					break;
				default:
					System.out.println("Your choice was invalid, please choose 1 or 2.\n\n");
				}
				}while(choice5 > 2 | choice4 < 1);
				
				
				// Used to break up input 
				breakUp(continue1);
				
				
				// Consequences of choosing case 1 for choice 5 
				if (choice5 == 1 && magic > 5)
				{
					System.out.println("============================================================\nYou are rendered helpless in the water however your magic\nsaves you as you're able to cast a roaring fire spell\nthat scorches the croc to death. Health remains unchanged. \n\n\tHealth is " + health + "\n============================================================");
				}
				
				if (choice5 == 1 && magic < 5)
				{
					System.out.println("============================================================\nYou are rendered helpless in the water and have no way to \ndefend yourself. Large damage taken. \n\n\tHealth is now ---->" + (health = health - largeDamage) + "\n============================================================");
				}
				
				// Consequences of choosing case 2 for choice 5
				if (choice5 == 2 && quickness > 7)
				{
					System.out.println("============================================================\nYou react to the attacks with equal speed and defeat the mysterious creature. You find a health potion in his bag which restores 10 health. \n\n\tHealth is now ---->" + (health = health + 10) + "\n============================================================");
				}

				if (choice5 == 2 && quickness < 7)
				{
					System.out.println("============================================================\nYou cannot compete with the speed of the mysterious creatures \nattacks and he deals a decent amount of damage before you\n strike a crushing blow from pure luck. \n\n\tHealth is now ---->" + (health = health - mediumDamage) + "\n============================================================");
				}
				
				
				// Used to break up input
				breakUp(continue1);


				// Choice 6 (boss fight) 
				do
				{
				System.out.println("As you enter the last room in the dungeon there is a large evil dragon that must be defeated for you to escape the dungeon. Will you \n\n===============================\n\t1. strike hard and fast \n\t2. manuever around him\n===============================");
				choice6 = keyboard.nextInt();

				// Possible results of choice 6
				
					switch (choice6)
					{
					case 1: 
						System.out.println("As you go in for a hard strike the demon grasps you with his massive claw.");
						break;
					case 2:
						System.out.println("You manuever around and find a ledge you must jump onto");
						break;
					default:
						System.out.println("Your choice was invalid, please choose 1 or 2.\n\n");
					}
				}while(choice6 > 2 | choice6 < 1);


				// Used to break up input
				breakUp(continue1);


				// Consequences of choosing case 1 for choice 6
				if (choice6 == 1 && strength > 7)
				{
					System.out.println("==============================================================\nYou're strong enough to break the grip of the dragon and you \nswing your weapon cutting off his claw.\n\n\tHealth is ---->" + (health) + "\n============================================================");
				}

				if (choice6 == 1 && strength < 7)
				{
					System.out.println("==============================================================\nYou're not strong enough to break the grip of the dragon and he \ncrushes you to death.\n==============================================================");
					System.out.println("==============================================================\nYour journey has ended " + name + ", better luck next time.\n==============================================================");
					
					// Print final health into output file 
					//FileWriter fw = new FileWriter("/Users/c.voorhees/Desktop/FinalScore.txt",true);
					//PrintWriter outputfile = new PrintWriter(fw);
					//outputfile.println(name + ", Your final score was ----> " + health);
					//outputfile.close();
					System.exit(0);
				}

				// Consequences of choosing case 2 for choice 6
				if (choice6 == 2 && intelligience > 5)
				{
					System.out.println("==============================================================\nYou make a well calculated jump onto the ledge and find a health potion.\n\n\tHealth is now ---->" + (health = health + 10) + "\n==============================================================");
				}

				if (choice6 == 2 && intelligience < 5)
				{
					System.out.println("==============================================================\nYou attempt to jump onto the ledge but fail and fall down to \nyour death.\n==============================================================");
					System.out.println("==============================================================\nYour journey has ended " + name +  ", better luck next time.\n==============================================================");
					
					// Print final health into output file 
					//FileWriter fw = new FileWriter("/Users/c.voorhees/Desktop/FinalScore.txt",true);
					//PrintWriter outputfile = new PrintWriter(fw);
					//outputfile.println(name + ", Your final score was ----> " + health);
					//outputfile.close();
					System.exit(0);
				}


				// Used to break up input
				breakUp(continue1);
				
				
				// Choice 7 (boss fight)
				do 
				{
				System.out.println("The massive dragon now moves in to attack you swinging down his massive tail! Will you \n\n===============================\n\t1. Block the attack \n\t2. Dodge the attack\n===============================");
				choice7 = keyboard.nextInt();
				
				// Possible results of choice 7
				switch (choice7)
				{
				case 1:
					System.out.println("You test the might of your armour against the dragons tail.");
					break;
				case 2: 
					System.out.println("You test your speed and quickness as the tail comes down at you.");
					break;
				default:
					System.out.println("Your choice was invalid, please enter 1 or 2.\n\n");
				}
				}while(choice7 > 2 | choice7 < 1);
				
				
				// Used to break up input
				breakUp(continue1);
						
				
				// Consequences of choosing case 1 for choice 7 
				if (choice7 == 1 && armour > 5)
				{
					System.out.println("==============================================================\nYour armour holds strong against the massive force of the swing\n as the dragons tail breaks over you.\n\n\tHealth is ---->" + (health) + "\n==============================================================");
				}
				
				if (choice7 == 1 && armour < 5)
				{
					System.out.println("==============================================================\nYour armour is too weak and the power of the demons tail crushes you to death.\n==============================================================");
					System.out.println("==============================================================\nYour journey has ended " + name + ", better luck next time.\n==============================================================");
					
					// Print final health into output file 
					//FileWriter fw = new FileWriter("/Users/c.voorhees/Desktop/FinalScore.txt",true);
					//PrintWriter outputfile = new PrintWriter(fw);
					//outputfile.println(name + ", Your final score was ----> " + health);
					//outputfile.close();
					System.exit(0);
				}
				
				// Consequences of choosing case 2 for choice 7  
				if (choice7 == 2 && quickness > 6)
				{
					System.out.println("==============================================================\nYou are able to quickly jump out of the way and dodge the deadly swing.\n\n\tHealth is ---->" + (health) + "\n==============================================================");
				}
				
				if (choice7 == 2 && quickness < 6)
				{
					System.out.println("==============================================================\nYou are not able to jump out of the way quick enough and the \ndeadly tail swing crushes you to death.\n==============================================================");
					System.out.println("==============================================================\nYour journey has ended " + name + ", better luck next time.\n==============================================================");
					
					// Print final health into output file 
					//FileWriter fw = new FileWriter("/Users/c.voorhees/Desktop/FinalScore.txt",true);
					//PrintWriter outputfile = new PrintWriter(fw);
					//outputfile.println(name + ", Your final score was ----> " + health);
					//outputfile.close();
					System.exit(0);
				}
				
				
				// Used to break up input
				breakUp(continue1);
				
				
				// Choice 8 (boss fight)
				do
				{
				System.out.println("You see an oppurtunity to strike the dragon in the heart and kill it but you must first make a crucial choice. Will you \n\n===================================================\n\t1. Fire a magical attack piercing his heart \n\t2. Stab his heart with your blade\n===================================================");
				choice8 = keyboard.nextInt();
				
				// Possible results of choice 8 
				switch(choice8)
				{
				case 1:
					System.out.println("You try to charge up as much magical strength as you can to land a deadly strike on the dragon.");
					break;
				case 2:
					System.out.println("You charge at the dragon with your weapon drawn preparing to strike a killing blow.");
					break;
				default:
					System.out.println("Your choice was invalid, please enter 1 or 2.\n\n");
				}
				}while(choice8 > 2 | choice8 < 1);
				
				
				// Used to break up input
				breakUp(continue1);
				
				
				// Consequences of choosing case 1 for choice 8
				if (choice8 == 1 && magic > 5)
				{
					System.out.println("==============================================================\nYour magic strike is so powerful it blows the dragon to pieces\n and you finally can escape through the dungeon exit that lies behind him.\n==============================================================");
					System.out.println("\n\n==============================================================\nYou've escaped the dungeon succesfully! \n\n\tFinal score ---->" + health + "\n==============================================================");
				}
				
				if (choice8 == 1 && magic < 5)
				{
					System.out.println("==============================================================\nYour magic skills are inadequate and the dragon happily devours\n you after your magic attack fails.");
					System.out.println("==============================================================\nYour journey has ended " + name + ", better luck next time.\n==============================================================");
					
					// Print final health into output file 
					//FileWriter fw = new FileWriter("/Users/c.voorhees/Desktop/FinalScore.txt",true);
					//PrintWriter outputfile = new PrintWriter(fw);
					//outputfile.println(name + ", Your final score was ----> " + health);
					//outputfile.close();
					System.exit(0);
				}
				
				// Consequences of choosing case 2 for choice 8 
				if (choice8 == 2 && armour > 5)
				{
					System.out.println("==============================================================\nAs the dragon sees you make your charge he shoots his scorching\nflame breath at you but your armour protects you from its heat\n and you drive your blade into the dragons heart killing him\ninstantly.\n==============================================================");
					System.out.println("\n\n==============================================================\nYou've escaped the dungeon succesfully! \n\n\tFinal score ---->" + health + "\n==============================================================");
				}
				
				if (choice8 == 2 && armour < 5)
				{
					System.out.println("==============================================================\nThe dragon sees you charging towards him and he shoots his scorching flame breath at \nyou. Your armour stands no chance and your instantly melted into a pile of flesh\n==============================================================");
					System.out.println("==============================================================\nYour journey has ended " + name + ", better luck next time.\n==============================================================");
					
					// Print final health into output file 
					//FileWriter fw = new FileWriter("/Users/c.voorhees/Desktop/FinalScore.txt",true);
					//PrintWriter outputfile = new PrintWriter(fw);
					//outputfile.println(name + ", Your final score was ----> " + health);
					//outputfile.close();
					System.exit(0);
				}
				
				
				// Print final health into output file 
				//FileWriter fw = new FileWriter("/Users/c.voorhees/Desktop/FinalScore.txt",true);
				//PrintWriter outputfile = new PrintWriter(fw);
				//outputfile.println(name + ", Your final score was ----> " + health);
				//outputfile.close();
				
				
				// Close keyboard 
				keyboard.close();
			}

			public static void mainMenu()
			{	
				System.out.println("\n=====================================================================================================");
				System.out.println("All characters start with 100 health but each character has their own set of skills to help you reach\nthe end of the dungeon in different ways, so choose wisely.");
				System.out.println("\n\t1. Knight");
				System.out.println("\n\t2. Mage");
				System.out.println("\n\t3. Thief");
				System.out.println("\n\t4. Barbarian");
				System.out.println("\n\t5. Warlock");
				System.out.println("\n\t6. Assassin");
				System.out.println("=======================================================================================================");
				System.out.println("\nChoose a number 1-6");
			}

			public static void breakUp(int one)
			{
				System.out.println("\nEnter one to continue.");
				Scanner keyboard = new Scanner(System.in);
				one = keyboard .nextInt();
				switch (one)
				{
				case 1:
					System.out.println("");
					break;
				}
				

			}

		

}
