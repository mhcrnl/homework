class N25{
	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		if(n>5&&n<15){
			switch(n){
			case 6:
			System.out.print("six");
			break;
			case 7:
			System.out.print("seven");
			break;
			case 8:
			System.out.print("eight");
			break;
			case 9:
			System.out.print("nine");
			break;
			case 10:
			System.out.print("ten");
			break;
			case 11:
			System.out.print("jack");
			break;
			case 12:
			System.out.print("queen");
			break;
			case 13:
			System.out.print("king");
			break;
			case 14:
			System.out.print("ace");
			break;
		}
		}
		if(m>0&&m<5){
			switch(m){
			case 1:
			System.out.println(" spades");
			break;
			case 2:
			System.out.println(" clubs");
			break;
			case 3:
			System.out.println(" diamonds");
			break;
			case 4:
			System.out.println(" hearts");
			break;
		}
		}
	}
}