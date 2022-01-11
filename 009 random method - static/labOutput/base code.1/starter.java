import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Random rand1 = new Random();
		int rand_num1 = rand1.nextInt(9);
		System.out.println("a." + rand_num1);
		
		Random rand2 = new Random();
		int rand_num2 = rand2.nextInt(100)+1;
		System.out.println("b." + rand_num2);
		
		Random rand3 = new Random();
		double rand_dub1 = rand3.nextDouble()+2.5;
		
		System.out.println("c." + rand_dub1);
		
		Random rand4 = new Random();
		double rand_dub2 = rand4.nextDouble(575)+14;
		System.out.println("d." + rand_dub2);
		
		


	}
}
