class N21{
	public static void main(String args[]){
		int x1=Integer.parseInt(args[0]);
		int y1=Integer.parseInt(args[1]);
		int x2=Integer.parseInt(args[2]);
		int y2=Integer.parseInt(args[3]);
		if (0<x1 && 0<y1 && 0<x2 && 0<y2 && x1<9 && y1<9 && x2<9 && y2<9){
			if(x1==x2||y1==y2){
				System.out.println("Rook can move that way !:)");
			}
			else
				System.out.println("Rook can't move that way !:)");	
		}
		else
			System.out.println("Your number is out of a range! Pls enter number from 1 to 8 !");
	}
}