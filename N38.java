class N38{
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		int b=1;
		int c=0;
		boolean d=false;
		one: while(a>=c){
			b+=c;
			c+=b;
			if(a==b || a==c){
				d=true;
				break one;
			}
		}
		System.out.println("Fibonacci number : "+d);
	}
}