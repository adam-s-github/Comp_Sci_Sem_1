import java.util.Scanner;



class starter {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick your character: ");
		String choice1 = sc.nextLine();
		
		System.out.println("Strength: ");
		int choice2 = sc.nextInt();
		
		System.out.println("Dexterity: ");
		int choice3 = sc.nextInt();
		
		System.out.println("Intelligence: ");
		int choice4 = sc.nextInt();
		
		System.out.println("Constitution: ");
		int choice5 = sc.nextInt();
		
		System.out.println("Charisma: ");
		int choice6 = sc.nextInt();
		
	
		
		makeCharacter charac1 = new makeCharacter();
		
		charac1.setRole(choice1);
		charac1.setStrength(choice2);
		charac1.setDexterity(choice3);
		charac1.setIntelligence(choice4);
		charac1.setConstitution(choice5);
		charac1.setCharisma(choice6);
		charac1.setALL(choice1,choice2,choice3,choice4,choice5,choice6);
		
	}
	
	
}

class makeCharacter {
	
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int constitution;
	int charisma;
	
	public makeCharacter(){
	
	}
	
	public makeCharacter(String a, int b, int c, int d, int e, int f){
		
		role = a;
		strength = b;
		dexterity = c;
		intelligence = d;
		constitution = e;
		charisma = f;
		
	}
	
	
	public static String setRole(String a){
		
		String pick = "";
		
		if(a.equals("Rogue")){
		pick = "Rogue";
		}
		if(a.equals("rogue")){
		pick = "Rogue";
		}
		if(a.equals("Warrior")){
		pick = "Warrior";
		}
		if(a.equals("warrior")){
		pick = "Warrior";
		}
		if(a.equals("Wizard")){
		pick = "Wizard";
		}
		if(a.equals("wizard")){
		pick = "Wizard";
		}
		
		return pick;
	}
	
	public static int setStrength(int b){
		
		int strengthpick = b;
		
		return strengthpick;
		
	}
	
	public static int setDexterity(int c){
		
		int dexteritypick = c;
		
		return dexteritypick;
		
	}
	
	public static int setIntelligence(int d){
		
		int intelligencepick = d;
		
		return intelligencepick;
		
	}
	
	public static int setConstitution(int e){
		
		int constitutionpick = e;
		
		return constitutionpick;
		
	}
	
	public static int setCharisma(int f){
		
		int charismapick = f;
		
		return charismapick;
		
	}
	
	public static boolean setALL(String pick, int strengthpick, int dexteritypick, int intelligencepick, int constitutionpick, int charismapick){
		
		System.out.println("You chose: " + pick);
		System.out.println("Strength: " + strengthpick);
		System.out.println("Dexterity: " + dexteritypick);
		System.out.println("Intelligence: " + intelligencepick);
		System.out.println("Constitution: " + constitutionpick);
		System.out.println("Charisma: " + charismapick);
		
		return true;
	}

}