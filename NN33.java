class NN33{
	static int sum(int a){
		int b =1;
		for(;a>0;a--){
			b=b*a;
		}
		return b;
	}
	public static void main (String args[]){
		System.out.println(sum(Integer.parseInt(args[0])));
	}
}