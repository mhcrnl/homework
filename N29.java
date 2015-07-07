class N29{
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c= 0;
		if (b>a){
			while(b>=a){
				c =c+b;
				b--;
			}
			System.out.println(c);
		}
		else if(a>b){
			while(a>=b){
				c=c+a;
				a--;
			}
			System.out.println(c);
		}
	}
}