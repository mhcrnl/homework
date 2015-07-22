class NN36{
	static int sum(int a){
		//String c=a+"";
		for(;a>0;a/=10){
			int b=a%10;
			System.out.println(b);
		}
		return a;
	}
	public static void main (String args[]){
		sum(Integer.parseInt(args[0]));
	}
}