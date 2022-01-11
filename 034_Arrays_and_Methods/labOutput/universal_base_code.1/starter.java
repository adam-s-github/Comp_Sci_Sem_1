import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


class starter {
	public static void main(String args[]) {
		
		Random rand = new Random();
		
		
		
		int[] arr = new int[100]; 
		
		int arrcount = 0;
		int arrrand = rand.nextInt(100) + 1;
		while(arrcount!=100){
			
			arr[arrcount] = arrrand;
			arrrand = rand.nextInt(100) + 1;
			arrcount++;
		}
		
		toStringArray(arr);
		getArrayAverage(arr);
		getArrayMax(arr);
		getArrayMin(arr);
	

	}
	
	public static void toStringArray(int[] nums){
		 
		
		int count = 0;
		while(count<nums.length){
			
			System.out.print(nums[count] + " ");
			count++;
			
		}
		System.out.println(" ");
		
		
	}
	
	public static int getArrayAverage(int[] nums){
		int sum = 0;
		int count1 = 0;
		while(count1<nums.length){
			sum = nums[count1] + sum;
			count1 = count1 + 1;
		}
		int avg = sum/nums.length;
		
		System.out.println("Average: " + avg);
		return avg;
	}
	
	public static int getArrayMax(int[] nums){
		
		int cont1 = 0;
		int cont2 = 1;
		int max = 0;
		
		while(cont2<nums.length){
			
			if(nums[cont1]>nums[cont2]){
				max = nums[cont1];
			
			}
			else{
				max = nums[cont2];
				
			}
			
			cont1 = cont1 + 1;
			cont2 = cont2 + 1;
		}
		
		System.out.println("Max: " + max);
		return max;
	}
	
	public static int getArrayMin(int[] nums){
		
		int min = nums[0];
		
		for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min)
                min = nums[i];
        }
		System.out.println("Min: " + min);
		return min;
	}
	
	
	
	
}