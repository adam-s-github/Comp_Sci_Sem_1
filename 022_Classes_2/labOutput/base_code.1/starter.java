import character.*;
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
