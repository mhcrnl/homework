class NN32{
	static int sum(int a, int b){
		int c=1;
		int d=1;
		int e=1;
		for(;b>0;b--){
			c=c*(-1);
			d=d*a;			
			e=e+c*d;
		}
		return e;
	}
	public static void main (String args[]){
		System.out.println(sum(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
	}
}