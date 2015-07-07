class N26{
	public static void main(String args[]){
		int a =Integer.parseInt(args[0]);
		if(a>99 || a<1000){
			int b=a/100;
			int c=(a/10)%10;
			int d=a%10;
			switch (b){
				case 1:
				System.out.print("One hundred ");
				break;
				case 2:
				System.out.print("Two hundred ");
				break;
				case 3:
				System.out.print("Three hundred ");
				break;
				case 4:
				System.out.print("Four hundred ");
				break;
				case 5:
				System.out.print("Five hundred ");
				break;
				case 6:
				System.out.print("Six hundred ");
				break;
				case 7:
				System.out.print("Seven hundred ");
				break;
				case 8:
				System.out.print("Eight hundred ");
				break;
				case 9:
				System.out.print("Nine hundred ");
				break;
			}
			switch(c){
				case 1:
				switch(d){
					case 1:
					System.out.println("eleven");
					break;
					case 2:
					System.out.println("twelve");
					break;
					case 3:
					System.out.println("thirteen");
					break;
					case 4:
					System.out.println("fourteen");
					break;
					case 5:
					System.out.println("fifteen");
					break;
					case 6:
					System.out.println("sixteen");
					break;
					case 7:
					System.out.println("seventeen");
					break;
					case 8:
					System.out.println("eighteen");
					break;
					case 9:
					System.out.println("nineteen");
					break;
					case 0:
					System.out.println("ten");
					break;
				}
				break;
				case 2:
				System.out.print("twenty ");
				break;
				case 3:
				System.out.print("thirty ");
				break;
				case 4:
				System.out.print("fourty ");
				break;
				case 5:
				System.out.print("fifty ");
				break;
				case 6:
				System.out.print("sixty ");
				break;
				case 7:
				System.out.print("seventy ");
				break;
				case 8:
				System.out.print("eighty ");
				break;
				case 9:
				System.out.print("ninety ");
				break;
			}
			if(c>1 || c==0){
			switch(d){
				case 1:
				System.out.println("one");
				break;
				case 2:
				System.out.println("two");
				break;
				case 3:
				System.out.println("three");
				break;
				case 4:
				System.out.println("four");
				break;
				case 5:
				System.out.println("five");
				break;
				case 6:
				System.out.println("six");
				break;
				case 7:
				System.out.println("seven");
				break;
				case 8:
				System.out.println("eight");
				break;
				case 9:
				System.out.println("nine");
				break;
			}
		}
		}
	}
	
}