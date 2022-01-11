import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Pick a name");
	String name = sc.nextLine();
	
	
	System.out.println("Pick a loop number");
	int stop = sc.nextInt();
	
	int num = 0;
	while(num<stop){
		System.out.println(name);
		num = num + 1;
	}


	}
}
