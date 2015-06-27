class N3 {
	public static void main (String args[]){
		int a,b,c,d;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		System.out.println("a="+a+" b="+b+" c="+c);
		d=a;
		a=c;
		c=b;
		b=d;
		System.out.println("a="+a+" b="+b+" c="+c);
	}
}