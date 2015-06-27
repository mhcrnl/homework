class N1 {
	public static void main (String args[]){
		System.out.println("a="+args[0]+" b="+args[1]);
		int a,b,c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		System.out.println(a+","+b);
		c=a;
		a=b;
		b=c;
		System.out.println(a+","+b);
	}
}