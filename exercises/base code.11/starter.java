import java.util.Scanner;
import java.util.Random;

class starter {

	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Number: ");
		int num = sc.nextInt();
		printPrime(num);

	}

	
	
	public static boolean checkPrime(int num) {
		
		int count = num - 1;
		boolean prime = false;
		while(count>1){
			
			
			if(num%count == 0){
				prime = false;
				break;
			}
			if(num%count != 0){
				prime = true;
			}
			if(count == 0){
				break;
			}
			count = count - 1;
		}
		return prime;
		
	}
	
	public static void printPrime(int num) {
		
		while(num>0){
			boolean prime = checkPrime(num);
			
			if(prime){
				System.out.println(num + " is Prime.");
			}
			else{
				System.out.print("");
			}
			num = num - 1;
		}
		
		

	}

	
	
}