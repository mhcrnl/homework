class N16{
	public static void main(String args[]){
		int k=Integer.parseInt(args[0]);
		if (k>=1 && k<=365){
			k=(k+2)%7;
			switch(k){
				case 3:
				System.out.println("Wednesday - "+k);
				break;
				case 4:
				System.out.println("Thursday - "+k);
				break;
				case 5:
				System.out.println("Friday - "+k);
				break;
				case 6:
				System.out.println("Saturday - "+k);
				break;
				case 7:
				System.out.println("Sunday - "+k);
				break;
				case 1:
				System.out.println("Monday - "+k);
				break;
				case 2:
				System.out.println("Tuesday - "+k);
				break;
			}
		}
		else
			System.out.println("Your Number is out of range: 1 to 365");
	}
}