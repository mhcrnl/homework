class N20{
	public static void main(String args[]){
		int x1=Integer.parseInt(args[0]);
		int y1=Integer.parseInt(args[1]);
		int x2=Integer.parseInt(args[2]);
		int y2=Integer.parseInt(args[3]);
		if (0<x1 && 0<y1 && 0<x2 && 0<y2 && x1<9 && y1<9 && x2<9 && y2<9){
			if ((x1+y1)%2==0 && (x2+y2)%2==0 || (x1+y1)%2!=0 && (x2+y2)%2!=0){
				System.out.println("Fields of same colour!");
			}
			else
				System.out.println("Fields of different colour!");		
		}
		else
			System.out.println("Your number is out of a range! Pls enter number from 1 to 8 !");
	}
}