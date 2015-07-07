class N37{
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		boolean b=true;
		if (a>1){
		for(int i=2;i<a;i++){
			int c=a%i;
			if(c==0){
				b=false;
				break;
			}		
		}
		System.out.println("Number is prime: "+b);
	}		
	}
}