import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void main(String args[]) {
		
		Random rand = new Random();
		
		int leng = rand.nextInt(150) + 51;
		
		int[] num = new int[leng];
		int min = 200;
		int c = 0;
		while(c < num.length)
		{
		num[c] = rand.nextInt(100) + 1;
		System.out.print(num[c] + " ");
		c = c + 1;
		}
		
		c = 0;
		System.out.println();
		while(c < num.length)
		{
		if(num[c] < min)
		{
		min = num[c];
		}
		c = c + 1;
		}
		System.out.println(min);
			
		}
	
}
