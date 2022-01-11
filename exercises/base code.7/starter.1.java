import java.util.Scanner;

class starter {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Number: ");
		int num = sc.nextInt();
		int num1 = num;
		int ans = 0;
		
		while(true){
			ans = num * num1;
			num1 = num - 1; 
		}
		
	}
}