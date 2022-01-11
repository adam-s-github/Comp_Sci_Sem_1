import java.util.Scanner;
import java.util.Random;

class Dog{
	
	String name;
	String breed;
	int age;
	
	
	public Dog(){
		
		name = "Clifford";
		breed = "big red dog";
		age = 3;
		
		
	}
	
	public Dog(String a, String b, int c){
		
		
		
		
	}
	
	public Dog(String a){
		
		name = a;
		breed = "breed breed";
		age = 1;
		
		
	}
	
	public Dog(String a, String b){
		
		name = a;
		breed = b;
		age = 1;
		
		
	}
	
	public Dog(String a, int c){
		
		name = a;
		breed = "breed breed";
		age = 1;
		
		
	}
	
	public void setName(String a){
		
		name = a;
		return;
	}
	
	public void setAge(int a){
		
		age = a;
		return;
	}
	
	public void setBreed(String a){
		
		breed = a;
		return;
	}
	
	public void getName(String a){
		
		System.out.println(name);
		return;
	}
	
	public void getAge(int a){
		
		System.out.println(age);
		return;
	}
	
	public void getBreed(String a){
		
		System.out.println(breed);
		return;
	}
	
	public boolean isSleeping(){
		
		Random rand = new Random();
		boolean sleep = true;
		int isSleep = rand.nextInt(2)+ 1;
		
		if(isSleep == 1){
			sleep = false;
			System.out.println(name + " is sleeping.");
			
		}
		if(isSleep == 2){
			sleep = true;
			System.out.println(name + " is not sleeping.");
		}
		
		return sleep;
		
	}
	
	public void bark(){
		
		System.out.println(name + " BORK!");
		return;
	}
	
	
}


	

class starter {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dog Name 1: ");
		String name1 = sc.nextLine();
		System.out.println("Dog Breed 1: ");
		String breed1 = sc.nextLine();
		System.out.println("Dog Age 1: ");
		int age1 = sc.nextInt();
		
		System.out.println("Dog #2");
		
		System.out.println("Dog Name 2: ");
		String name2 = sc.nextLine();
		System.out.println("Dog Breed 2: ");
		String breed2 = sc.nextLine();
		System.out.println("Dog Age 2: ");
		int age2 = sc.nextInt();
		
		
		Dog dog1 = new Dog(name1,breed1,age1);
		Dog dog2 = new Dog(name2,breed2,age2);
		
		boolean sleep1 = dog1.isSleeping();
		
		if(sleep1){
			dog1.bark();
		}
		else{
			System.out.println("");
		}
		
		boolean sleep2 = dog2.isSleeping();
		
		if(sleep1&&sleep2){
			dog2.bark();
		}
		else{
			System.out.println("");
		}
	}
}