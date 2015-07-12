class N44{
	public static void main(String args[]){
		int ars[]=new int [10];
		int k = Integer.parseInt(args[0]);
		one : for(int i =10; i>0;i--){
		ars[i-1]= Integer.parseInt(args[i]);
		if (ars[i-1]>k){
			System.out.println(ars[i-1]+" > "+k);
			break one;
		}
		else if(i==1){
			System.out.println(0);
		}
	}
	}
}