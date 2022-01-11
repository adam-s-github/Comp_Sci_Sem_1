import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Random rand = new Random();
		
		int count = 0;
		int num = 0;
		
		int[] nums;
		nums = new int[20];
		
		while(count!=20){
			
			num = rand.nextInt(49) + 1;
			nums[count] = num;
			count++;
			
		}
		
		int[] nums2;
		nums2 = new int[20];
		
		
		int count2 = 19;
		int count3 = 0;
		
		while(count2!=-1){
			
			nums2[count2] = nums[count3];
			count2--;
			count3++;
			
		}
		
		
		
		int count4 = 0;
		
		System.out.println("RANDOM NUMBERS: ");
		while(count4!=20){
			
			System.out.print(nums[count4]+" ");
			count4++;
			
		}
		
		int count5 = 0;
		
		System.out.println("REVERSE: ");
		while(count5!=20){
			
			System.out.print(nums2[count5]+" ");
			count5++;
			
		}
	}
}
