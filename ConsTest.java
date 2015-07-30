class ConsTest{
	public static void main(String args[]){
		Consumption Lexus = new Consumption();
		
		Lexus.kmRun=Integer.parseInt(args[0]);
		Lexus.litresUsed=Integer.parseInt(args[1]);
		Lexus.fuelPrice=Integer.parseInt(args[2]);

		System.out.println("Average fuel consumption per 100km : "+Lexus.avgcons()+" lt");
		System.out.println("Average fuel price : "+Lexus.avgcost()+" UAH");


	}
}