import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Character (Wizard,Warrior,Rogue): ");
		String character = sc.nextLine();
		
		if(character.equals("Rogue")){
		System.out.println("You chose Rogue!");
		}
		if(character.equals("rogue")){
		System.out.println("You chose Rogue!");
		}
	
		if(character.equals("Warrior")){
		System.out.println("You chose Warrior!");
		}
		if(character.equals("warrior")){
		System.out.println("You chose Warrior!");
		}
	
		if(character.equals("Wizard")){
		System.out.println("You chose Wizard!");
		}
		if(character.equals("wizard")){
		System.out.println("You chose Wizard!");
		}
		
		
		
	
		
		int points = 25;
		
		System.out.println("Your limit is 25 skill points.");
		
		
		System.out.println("Skill 1: Strength. How many points do you want? (Limit 10): ");
		int strength = sc.nextInt();
		
		if(strength > 10)
		{
			System.out.println("TOO MANY POINTS!");
		}
		else
		{
			System.out.println("You chose " + strength + " points. NICE!");
			points = points - strength;
			System.out.println("You have " + points + " points left.");
		}
		
		
		
		
		System.out.println("Skill 2: Dexterity. How many points do you want? (Limit 10): ");
		int dexterity = sc.nextInt();
		
		if(dexterity > 10)
		{
			System.out.println("TOO MANY POINTS!");
		}
		else
		{
			System.out.println("You chose " + dexterity + " points. NICE!");
			points = points - dexterity;
			System.out.println("You have " + points + " points left.");
		}
		
		
		
		
		System.out.println("Skill 3: Intelligence. How many points do you want? (Limit 10): ");
		int intelligence = sc.nextInt();
		
		if(intelligence > 10)
		{
			System.out.println("TOO MANY POINTS!");
		}
		if(intelligence > points)
		{
			System.out.println("TOO MANY POINTS!");
		}
		else
		{
			System.out.println("You chose " + intelligence + " points. NICE!");
			points = points - intelligence;
			System.out.println("You have " + points + " points left.");
		}
		
		
		
		
		System.out.println("Skill 4: Constituition. How many points do you want? (Limit 10): ");
		int constituition = sc.nextInt();
		
		if(constituition > 10)
		{
			System.out.println("TOO MANY POINTS!");
		}
		if(constituition > points)
		{
			System.out.println("TOO MANY POINTS!");
		}
		else
		{
			System.out.println("You chose " + constituition + " points. NICE!");
			points = points - constituition;
			System.out.println("You have " + points + " points left.");
		}
		
		
		
		
		System.out.println("Skill 5: Charisma. How many points do you want? (Limit 10): ");
		int charisma = sc.nextInt();
		
		if(charisma > 10)
		{
			System.out.println("TOO MANY POINTS!");
		}
		if(charisma > points)
		{
			System.out.println("TOO MANY POINTS!");
		}
		else
		{
			System.out.println("You chose " + charisma + " points. NICE!");
			points = points - charisma;
			System.out.println("You have " + points + " points left.");
		}
		
		System.out.println("Hello " + name + " the " + character + "!");
		System.out.println("You have " + strength + " strength points.");
		System.out.println("You have " + dexterity + " dexterity points.");
		System.out.println("You have " + intelligence + " intelligence points.");
		System.out.println("You have " + constituition + " constituition points.");
		System.out.println("You have " + charisma + " charisma points.");
		System.out.println("Great choices!");
	}
}
