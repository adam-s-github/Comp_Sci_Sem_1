import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int num = rand.nextInt(1000)+1;
		System.out.println("Guess: ");
		int guess = sc.nextInt();
		
		if(guess == num)
		{
			System.out.println("Correct!");
		}
		else
		{
			System.out.println("Wrong");
			
		}
		
		
	}
}
