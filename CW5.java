class CW5{
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		if(a>0){
		if(a%2==0){
			System.out.println("Your number is even!");
		}
		else
			System.out.println("Your number is odd!");
	}
	else
		System.out.println("Your number is Zero!");
}
}