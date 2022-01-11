import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Phrase: ");
		String phrase = sc.nextLine();
		
      	String s[] = phrase.split(" "); 
     	String ans = ""; 
     	for (int i = s.length - 1; i >= 0; i--) { 
        	ans += s[i] + " "; 
        } 
        	System.out.println("Reversed String: " + ans); 
		    		
		
		
	}
}
