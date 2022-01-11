import java.util.Scanner;


class myCharacter {
	
	String role;
	
	public noRole(){
		role = "No Role";
	}
	
	public assign(String a){
		role = a;
	}
	
	
	
}

class starter {
	public static void main(String args[]) {
		
		myCharacter character1 = new noRole();
		myCharacter character2 = new assign("Wizard");
		
		
	}
}
