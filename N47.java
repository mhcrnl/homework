class N47{
	static int countChars(String a, char b){
		int x=0;
		for(int i =0;i<a.length();i++){
			char y=a.charAt(i);
			if(y==b){
				x++;
			}
		}
		return x;
	}
	public static void main(String args[]){
		System.out.println(countChars(args[0],args[1].charAt(0)));
	}
}