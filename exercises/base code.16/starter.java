import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void main(String args[]) {
		
		double[] vex = new double[10];
		Random rand = new Random();
		int kounter = 0;
		int index = -1;
		double fm = -1;
		while(kounter < vex.length){
			vex[kounter] = rand.nextInt(10)+1;
			kounter++;
		}
		kounter = 0;
		while(kounter < vex.length){
			if(vex[kounter]> fm){
				fm = vex[kounter];
				index = kounter;
			}
			kounter++;
		}
		kounter = 0;
		vex[index] = -1;
		fm = -1;
		while(kounter < vex.length){
			if(vex[kounter]>fm){
				fm = vex[kounter];
				index = kounter;
			}
			kounter++;
		}
		kounter = 0;
		while(kounter<vex.length){
			System.out.print(vex[kounter]+ " ");
			kounter++;
		}
		System.out.println(" ");
		System.out.println(fm);
		
	}
	
	
	
}
