import java.util.Scanner;
import java.util.Random;

class starter {

	
	
	public static int poof(int a, int b) {
		
		int base = a;
		int power = b;
		int count = 1;
		int ans = base;
		
		while(count != power){
			ans = ans*base;
			count = count + 1;
			System.out.println(ans);
		}
		
		return ans;
		
		
	}
	
	public static void main(String args[]) {
		
		poof(2,4);

		
	}
	
}