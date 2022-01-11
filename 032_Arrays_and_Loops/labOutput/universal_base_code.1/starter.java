import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Random rand = new Random();
		
		
		int count1 = 0;
		int count2 = 0;
		
		int num = rand.nextInt(1000) + 1;
		
		int[] nums;
		nums = new int[1000];
		
		while(count1<nums.length){
			
			nums[count1] = num;
			count1 = count1 + 1;
			num = rand.nextInt(1000) + 1;
			
		}
		
		while(count2!=1000){
			
			System.out.println(nums[count2]);
			count2 = count2 + 1;
			
			
		}
	}
}
