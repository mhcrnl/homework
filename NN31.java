class NN31{
	static int sum(int a, int b){
		int c=0;
		if (b>a){
			while(b>=a){
				c =c+b*b;
				b--;
			}
		}
		else if(a>b){
			while(a>=b){
				c=c+a*a;
				a--;
			}
		}	
		return c;
	}
	public static void main (String args[]){
		System.out.println(sum(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
	}
}