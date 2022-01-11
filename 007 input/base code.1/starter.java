class starter {
	public static void main(String args[]){
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Number 1: ");
		int num1 = sc.nextInt();
		System.out.println("Number 2: ");
		int num2 = sc.nextInt();
		
		
		if(num1%2 == 0){
			System.out.println("Number 1 is even");
		}
		if(num2%2 == 0){
			System.out.println("Number 2 is even");
		}
		
		
		if(num1%2 != 0){
			System.out.println("Number 1 is not even");
		}
		if(num2%2 != 0){
			System.out.println("Number 2 is not even");
		}
		
		
		
	}
}