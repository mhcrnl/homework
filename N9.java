class N9{
	public static void main(String args[]){
		float avgconsEU,avgconsUSA;
		avgconsEU=Float.parseFloat(args[0]);
		if (avgconsEU >0){
		avgconsUSA=62.137119f/(avgconsEU/3.785412f);
		System.out.println(avgconsUSA+" miles per gallon");}
		else
			System.out.println("Wrong number!");
	
	}
}