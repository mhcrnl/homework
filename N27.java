class N27{
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		a=(a-4)%60;
		System.out.print("god ");
		switch(a%12){
			case 0:
			System.out.print("krisa");
			break;
			case 1:
			System.out.print("korova");
			break;
			case 2:
			System.out.print("tigr");
			break;
			case 3:
			System.out.print("zaic");
			break;
			case 4:
			System.out.print("drakon");
			break;
			case 5:
			System.out.print("zmeia");
			break;
			case 6:
			System.out.print("loshad");
			break;
			case 7:
			System.out.print("ovca");
			break;
			case 8:
			System.out.print("obeziana");
			break;
			case 9:
			System.out.print("kyritsa");
			break;
			case 10:
			System.out.print("sobaka");
			break;
			case 11:
			System.out.print("svinia");
			break;
		}
		switch(a/12){
			case 0:
			System.out.println(" zelenii");
			break;
			case 1:
			System.out.println(" krasnii");
			break;
			case 2:
			System.out.println(" zeltii");
			break;
			case 3:
			System.out.println(" belii");
			break;
			case 4:
			System.out.println(" chernii");
			break;
		}
	}
}