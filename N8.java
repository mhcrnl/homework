class N8{
	public static void main(String args[]){
		float km,litre,price,avgcons,avgcost;
		km=Float.parseFloat(args[0]);
		litre=Float.parseFloat(args[1]);
		price=Float.parseFloat(args[2]);
		avgcons=(100*litre)/km;
		System.out.println("Average consumption per 100km="+avgcons+"ltrs");
		avgcost=(avgcons/100)*price;
		System.out.println("Average price for 1km run="+avgcost+"UAH");
	}
}