import java.util.Scanner;

class charac {
	
	String role;
	
	public charac(){
		role = "No Role";
		
	}
	
	public charac(String a){
		role = a;
		
	}
	
	public void checker(){
		
		if(role.equals("Rogue")){
		System.out.println("You chose Rogue!");
		}
		if(role.equals("rogue")){
		System.out.println("You chose Rogue!");
		}
		
		if(role.equals("Warrior")){
		System.out.println("You chose Warrior!");
		}
		if(role.equals("warrior")){
		System.out.println("You chose Warrior!");
		}
		
		if(role.equals("Wizard")){
		System.out.println("You chose Wizard!");
		}
		if(role.equals("wizard")){
		System.out.println("You chose Wizard!");
		}
		if(role.equals("")){
			System.out.println("No Role");
		}
		
		return;
	}

	
}

class starter {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick your character (Wizard,Rogue,Warrior): ");
		String role = sc.nextLine();
		
		
		charac mycharac1 = new charac();
		charac mycharac2 = new charac(role);
		
		mycharac1.checker();
		mycharac2.checker();

	}

}