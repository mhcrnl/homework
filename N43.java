class N43{
	public static void main(String args[]){
		int ars[]=new int [10];
		int k = Integer.parseInt(args[0]);
		for(int i =1; i<11;i++){
		ars[i-1]=Integer.parseInt(args[i]);
		if (ars[i-1]>k){
			System.out.println(ars[i-1]+" > "+k);
			break;
		}
		else if(i==10){
			System.out.println(0);
		}
	}
	}
}