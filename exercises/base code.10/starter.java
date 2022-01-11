import java.util.Scanner;

class starter {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Number: ");
		int num = sc.nextInt();
		
		int count = 0;
		int limit = -2;
		
		while(count != limit){
			count = count + 1;
			num = num + 1;
			System.out.println(num);
			
		}
	}
}