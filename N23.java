class N23{
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		boolean b = false;
		if (a%100==0&&a%400!=0){
			b=false;
		}
		else if (a%4==0){
			b=true;
		}
		System.out.println(a+" is leap-year: "+b);
	}
}