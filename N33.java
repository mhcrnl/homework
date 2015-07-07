class N33{
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		int b =1;
		for(;a>0;a--){
			b=b*a;
		}
		System.out.println(b);
	}
}