import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Donkey donkey = new Donkey();
		Ogre shrek = new Ogre();
		String statement = new String();
		if(shrek.isUgly()){
			statement = shrek.name + " IS UGLY!";
		}
		System.out.println(statement);
		donkey.interact(shrek);
		int i = 0;
		for(i = 0; i < 5; i++){
			shrek.interact(donkey);
		}
		System.out.println("That printed out " + i + " times");

	}
}
