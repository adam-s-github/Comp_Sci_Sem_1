import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("Your name is " + name + ".");
		
		System.out.println("How old are you?");
		int age = sc.nextInt();
		System.out.println("You are " + age + " years old.");
		
		System.out.println("What is the number of your birthday month?");
		int month = sc.nextInt();
		System.out.println("Your birthday month is " + month + ".");
		
		System.out.println("What day of the month is your birthday?");
		int day = sc.nextInt();
		System.out.println("Your birthday is on the " + day + " of the month.");
		
		System.out.println("What year were you born?");
		int year = sc.nextInt();
		System.out.println("Your were born in " + year + ".");
		
		System.out.println("How much is a Buck-50?");
		double amount = sc.nextDouble();
		System.out.println("A Buck-50 is $" + amount + ".");
		
		
	
	}
}
