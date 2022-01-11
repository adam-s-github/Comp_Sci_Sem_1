import java.util.Scanner;

class starter {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Number 1: ");
		int num1 = sc.nextInt();
		System.out.println("Number 2: ");
		int num2 = sc.nextInt();
		
		if(num1%2 == 0){
			System.out.println("Number 1 is even");
		}
		if(num2%2 == 0){
			System.out.println("Number 2 is even");
		}
		
		if(num1%2 != 0){
			System.out.println("Number 1 is not even");
		}
		if(num2%2 != 0){
			System.out.println("Number 2 is not even");
		}
		
		boolean num1divby3 = num1%3 == 0;
		boolean num1divby4 = num1%4 == 0;
		boolean num1divby5 = num1%5 == 0;
		
		boolean num2divby3 = num2%3 == 0;
		boolean num2divby4 = num2%4 == 0;
		boolean num2divby5 = num2%5 == 0;
		
		if(num1divby3){
			System.out.println("Number 1 is divisble by 3");
		}
		else{
			System.out.println("Number 1 is NOT divisble by 3");
		}
		
		if(num1divby4){
			System.out.println("Number 1 is divisble by 4");
		}
		else{
			System.out.println("Number 1 is NOT divisble by 4");
		}
		
		if(num1divby5){
			System.out.println("Number 1 is divisble by 5");
		}
		else{
			System.out.println("Number 1 is NOT divisble by 5");
		}
		
		if(num2divby3){
			System.out.println("Number 2 is divisble by 3");
		}
		else{
			System.out.println("Number 2 is NOT divisble by 3");
		}
		
		if(num2divby4){
			System.out.println("Number 2 is divisble by 4");
		}
		else{
			System.out.println("Number 2 is NOT divisble by 4");
		}
		
		if(num2divby5){
			System.out.println("Number 2 is divisble by 5");
		}
		else{
			System.out.println("Number 2 is NOT divisble by 5");
		}
	}
}
