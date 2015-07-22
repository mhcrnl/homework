class NN38{
	static boolean fib(int a){
		int b=1;
		int c=0;
		boolean d=false;
		while(a>=c){
			b+=c;
			c+=b;
			if(a==b || a==c){
				d=true;
				break;
			}
		}
		return d;	
	}
	public static void main (String args[]){
		System.out.println(fib(Integer.parseInt(args[0])));
	}
}