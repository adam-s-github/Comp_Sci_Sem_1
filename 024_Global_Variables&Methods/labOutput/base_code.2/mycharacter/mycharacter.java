package mycharacter;

public class mycharacter {
	
	String role;
	int strength;
	int constitution;
	int dexterity;
	int charisma;
	int intelligence;
	
	public mycharacter() {
		
		role = "Wizard";
		int strength = 5;
		int constitution = 5;
		int dexterity = 5;
		int charisma = 5;
		int intelligence = 5;
		
	}
	
	public mycharacter(String a, int b, int c, int d, int e, int f) {
		
	    role = a;
		strength = b;
		constitution = c;
		dexterity = d;
		charisma = e;
		intelligence = f;
		
	}
	
	
	
	public void myToString(){
		System.out.println("Role: " + role);
		System.out.println("Strength: " + strength);
		System.out.println("Dexterity: " + dexterity);
		System.out.println("Charisma: " + charisma);
		System.out.println("Intelligence: " + intelligence);
		System.out.println("Constitution: " + constitution);
		return;
	}
}