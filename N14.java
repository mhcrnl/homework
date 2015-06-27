class N14{
	public static void main(String args[]){
		int a=Integer.parseInt(args[0]);
		int b=a/100;
		int c=(a/10)%10;
		int d=a%10;
		System.out.println("a+b+c="+(b+c+d));
		System.out.println("a*b*c="+(b*c*d));		
	}
}