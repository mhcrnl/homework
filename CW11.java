class CW11{
	static String stars(int a){
		String b ="";
		for(;a>0;a--){
			b+="*";
		}
		return b;
	}
	static String stars2(int a){
		String b="";
		for (int i=1;i<a;i++){
			b+=stars(i)+"\n";
		}
		return b;
	}
	public static void main(String args[]){
			System.out.println(stars2(Integer.parseInt(args[0])));
	}
}