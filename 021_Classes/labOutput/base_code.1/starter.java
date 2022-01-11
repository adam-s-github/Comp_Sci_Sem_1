import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		character myChar = new character();
		System.out.println("Type: " + myChar.type);
		System.out.println("Strength: " + myChar.str);
		System.out.println("Charism: " + myChar.chr);
		System.out.println("Constituition: " + myChar.consti);
		System.out.println("Dexterity: " + myChar.dext);
		System.out.println("Intelligence: " + myChar.intel);
		
		
	}
}

class character{
	String type = new String("Wizard");
	int str = 5;
	int chr = 5;
	int consti = 5;
	int dext = 5;
	int intel = 5;
}