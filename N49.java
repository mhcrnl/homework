class N49{
	static int summAr(int ar[]){
		int y=0;
		for(int i =0;i<ar.length;i++){
			y += ar[i];
		}
		return y;
	}
	public static void main(String args[]){
		int ars[]={1,2,3,4,5,6,7,8,9,10};
		System.out.println(summAr(ars));
	}
}