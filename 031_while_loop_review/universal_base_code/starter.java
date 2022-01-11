import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Random rand = new Random();
		
		int count = 1;
		int num = rand.nextInt(100) + 1;
		while(count!=100){
			System.out.println(num);
			num = rand.nextInt(100) + 1;
			count = count + 1;
		}
		
	}
}
