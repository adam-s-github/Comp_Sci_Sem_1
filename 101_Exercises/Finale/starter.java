import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		
		
	}
	
	public static int getMode(int[] array1){
		
		int median = 0;
		int leng = array1.length();
		
		if(leng>0){
			int middle = 0;
			
			if(leng%2 == 0){
				int middle = leng/2;
				median = (array1[middle]+array1[middle+1])/2;
			}
			
			if(leng%2==0){
				middle = (leng/2) + 1;
				median = array1[middle];
			}
		}
		
		return median;
	}
	
	public staic int getMode(int[] array2){
		
		array2 = array2.sort()
		int mode = 0;
		int count1 = 0;
		int current = 0;
		
		if(leng>0){
			
			for(int i = 0; i< array1.length();i++){
				current = array2[i];
				int next = array2[i+1];
				if(current == next){
					mode = current;
					count++;
					
				}
				if(current!= next){
					count = 0;
				}
				
				
			}
			
		}
		return mode;
		
	}
}
