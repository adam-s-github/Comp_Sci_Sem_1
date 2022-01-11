import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("word: ");
		String word = sc.nextLine();
		int leng = 0;
		
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.substring(i,i+1));
		}
		String s = new String("I love Pizza!");
		System.out.println(s.substring(7,13));
		
		
	}
}
