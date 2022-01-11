import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int money = 100;
		
		while(money!=0){
			
			System.out.println("Do you want to roll? (y/n)");
			String yesno = sc.nextLine();
			
			if((yesno.equals("y"))||(yesno.equals("yes"))||(yesno.equals("Y"))||(yesno.equals("Yes"))){
				
				System.out.println("Bet: ");
				int bet = sc.nextInt();
				
				while(bet > money){
					System.out.println("Too big! Try again: ");
					bet = sc.nextInt();
				}
				
				int num1 = rand.nextInt(10);
				int num2 = rand.nextInt(10);
				int num3 = rand.nextInt(10);
				System.out.println("SLOT 1: "+num1);
				System.out.println("SLOT 2: "+num2);
				System.out.println("SLOT 3: "+num3);
				
				boolean win = num1 == num2 || num2 == num3 || num1 == num3;
				boolean lose = num1 != num2 && num2 != num3 && num1 != num3;
				
				if(win){
					money = money + bet;
					System.out.println("Win! Your balance is " + money);
				}
				
				if(lose){
					money = money - bet;
					System.out.println("Loss! Your balance is " + money);
				}
			}
			if((yesno.equals("n"))||(yesno.equals("N"))||(yesno.equals("no"))||(yesno.equals("No"))){
				break;
			}
			
		}
		System.out.println("Game Over!");
		
		
		
	}
}
