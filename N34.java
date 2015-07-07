class N34{
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		int b=1;
		int c=0;
		while(a>=c){
			b+=c;
			System.out.println(b);
			c+=b;
			System.out.println(c);
		}
	}
}