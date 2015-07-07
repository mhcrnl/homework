class N36{
	public static void main(String args[]){
		int a=Integer.parseInt(args[0]);
		for(int i=0;i<args[0].length();i++){
			int b=a%10;
			a=a/10;
			System.out.println(b);
		}
	}
}