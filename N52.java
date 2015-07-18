class N52{
	static int subroutine2(int a,int b,int c){
		if(a>=b&&a>=c&&b>=c){
			return (a*a)+(b*b);
		}
		else if(b>=a&&c>=a){
			return (b*b)+(c*c);
		}
		else
			return (a*a)+(c*c);
	}
	public static void main(String args[]){
		System.out.println(subroutine2(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2])));
	}
}