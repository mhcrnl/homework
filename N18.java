class N18{
	public static void main(String args[]){
		int a=Integer.parseInt(args[0]);
		int b=a/100;
		int c=(a/10)%10;
		int d=a%10;
		if(c>b && d>c){
			System.out.println("Increasing sequence!");
				if((c-b)==1 && (d-c)==1)
			System.out.println("Arithmetic sequence!");		
		}
		else
			System.out.println("Number is not corresponding to conditions of task!");
	}
}