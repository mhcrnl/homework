class NN20{
	static boolean chess(int x1, int y1, int x2, int y2){
			if ((x1+y1)%2==0 && (x2+y2)%2==0 || (x1+y1)%2!=0 && (x2+y2)%2!=0) return true;
			else 
				return false;	
	}
	public static void main(String args[]){
		System.out.println(chess(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]),Integer.parseInt(args[3])));
	}
}