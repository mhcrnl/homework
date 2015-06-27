class N11{
	public static void main(String args[]){
		int a=Integer.parseInt(args[0]);
		int b=a%10;
		int c=a/10;
		System.out.println("left+right= "+(c+b));
		System.out.println("left*right= "+(c*b));
	}
}