import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Pick your character (Wizard,Rogue,Warrior): ");
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
	
	
	
	}
}
