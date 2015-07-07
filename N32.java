class N32{
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c=1;
		int d=1;
		int e=1;
		for(;b>0;b--){
			c=c*(-1);
			d=d*a;			
			e=e+c*d;
		}
		System.out.println(e);
	}
}