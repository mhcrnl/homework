class N19{
	public static void main(String args[]){
		int a=Integer.parseInt(args[0]);
		int b=a/1000;
		int c=(a/100)%10;
		int d=(a/10)%10;
		int e=a%10;
		if(b==e && d==c){
			System.out.println("This number is palindrome!");
		}
		else
			System.out.println("This number is NOT palindrome!");
	}
}