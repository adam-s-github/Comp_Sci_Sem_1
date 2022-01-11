import java.util.Scanner;


class myCharacter {
	
	String role;
	
	public myCharacter(){
		role = "No Role";
		
	}
	
	public myCharacter(String a){
		role = a;
		
	}
	
	public void meow(){
		
		System.out.println(role + " MAOW!");
		return;
	}
	
}

class starter {
	public static void main(String args[]) {
		
		myCharacter character1 = new myCharacter();
		myCharacter character2 = new myCharacter("Wizard");
		
		
	}
}

