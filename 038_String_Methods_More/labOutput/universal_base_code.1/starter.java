import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("NAME (FIRST, LAST): ");
		String name = sc.nextLine();
		
		int space = name.indexOf(" ");
		
		String last = name.substring(space+1);
		int leng = last.length();
		
		System.out.println(last);
		System.out.println(leng);
	}
}
