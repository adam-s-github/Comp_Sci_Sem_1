import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Ascii me = new Ascii();
		me.printArt();
		
		Ascii dog = new Ascii();
		dog.setType("dog");
		dog.printArt();
		
		Ascii other = new Ascii();
		other.setAscii("bruh");
		other.setType("Other");
		other.printArt();
		
		Ascii him = new Ascii("Jeff","Jeff");
		him.printArt();
		
		Ascii lmao = new Ascii();
		lmao.setType("broh");
		lmao.printArt();
		
	}
}
