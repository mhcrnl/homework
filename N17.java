class N17{
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		String b=a+"";
		if (a<=0){
			System.out.println("Wrong number!");
		}
		else if(a%2==0 || b.length()<3 || b.length()>3){
			System.out.println("This number IS NOT satisfying conditions of task");
		}
		else
		System.out.print("This number IS odd and 3 digits");
	}
}