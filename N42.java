class N42{
	public static void main (String args[]){
	int ars[]=new int [10];
		int sum=0;
		for(int i =0; i<10;i++){
		int a = Integer.parseInt(args[i]);
		ars[i]=a;
		sum +=ars[i];
			}
			System.out.println(sum/10.0);
	}
}