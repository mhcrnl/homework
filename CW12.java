class CW12{
	static long fact(long n){
		if (n==0) return 1;
		return fact(n-1)*n;
	}
	public static void main(String args[]){
	System.out.println(fact(Integer.parseInt(args[0])));
	}
}