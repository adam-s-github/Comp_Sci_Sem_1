import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Random rand = new Random();
		
		
		int[] nums = new int[20];
		int count1 = 0;
		int rander = rand.nextInt(10)+ 1;
		
		while(count1<nums.length){
			
			nums[count1] = rander;
			count1++;
			rander = rand.nextInt(10)+ 1;
			
		}
		
		int count = 0;
		
		while(count!=20){
			
			System.out.print(nums[count] + " ");
			count++;
			
		}
		
		System.out.println(" ");
		int count2 = 0;
		int count3 = 1;
		int dup = rand.nextInt(10)+ 1;
		System.out.println("Target #: " + dup);
		
		
		while(count3!=20){
			
			if(nums[count2]==nums[count3]){
				System.out.println("2 in a row!");
				System.out.println("Index: "+ count2 + " and " + count3);
			}
			
			if(nums[count2]==dup){
				System.out.println("Duplicate!");
				System.out.println("Index: " + count2);
			}
			count2++;
			count3++;
			
		}
	}
	
	
}
