import java.util.Scanner;
import java.util.Random;

class starter {

	
	
	public static int poof(int a, int b) {
		
		int num1 = a;
		int num2 = b;
		
		int prod = a*b;
		
		if(prod%3 == 0){
			System.out.println("WORK");
		}
		else{
			System.out.println("NO");
		}

		return prod;
		
	}
	
	public static void main(String args[]) {
		
		poof(3,2);

		
	}
	
}