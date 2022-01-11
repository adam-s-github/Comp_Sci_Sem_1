import java.util.Scanner;

class starter {
	public static int fact(int yee){
		
		
		System.out.println("Number: ");
		int y = sc.nextInt();
		int x = y - 1;
		int ans = 0;
		
		while(true){
			y = y*x;
			System.out.println(y);
			
			if(x == 1){
				break;
			}
			x = x-1;
			
		}	
		return y;
	}
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in)	;
		
		int y = sc.nextInt();
		
		int answer = fact(y);
		System.out.println(answer);
	
	}
}
