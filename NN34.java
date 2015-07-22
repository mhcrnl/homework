class NN34{
	static int fib(int a){
		int c=0;
		int b=1;
		int x=1;
		for(int i =0;i<a;i++){
			System.out.println(x);
			x=c+b;
			c=b;
			b=x;			
		}
		return x;		
	}
	public static void main (String args[]){
		fib(Integer.parseInt(args[0]));
	}
}