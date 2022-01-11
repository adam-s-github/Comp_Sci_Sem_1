import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("x = ");
		int x = sc.nextInt();
		
		System.out.println("y = ");
		int y = sc.nextInt();
		
		System.out.println("z = ");
		int z = sc.nextInt();
		
		int a = Math.max(x,y);
		int b = Math.max(a,z);
		
		boolean xMax = b == x;
		boolean yMax = b == y;
		boolean zMax = b == z;
		
		int c = Math.min(x,y);
		int d = Math.min(c,z);
		
		boolean xMin = d == x;
		boolean yMin = d == y;
		boolean zMin = d == z;
		
		if(xMax){
			System.out.println("The max is " + x);
		}
		
		if(yMax){
			System.out.println("The max is " + y);
		}
		
		if(zMax){
			System.out.println("The max is " + z);
		}
		
		if(xMin){
			System.out.println("The minimum is " + x);
		}
		
		if(yMin){
			System.out.println("The minimum is " + y);
		}
		
		if(zMin){
			System.out.println("The minimum is " + z);
		}
		 
	}
}
