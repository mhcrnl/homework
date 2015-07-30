class ArraySearch{
	static int arrsearch(int [] a, int b){//this method returns first index number of searched element
		int l=a[0];
		int r=a.length;
		int m=0;
		while(l!=r){
			m=(l+r)/2;
			if (b==a[m]){
				while(a[m]==a[m-1]){
					m=m-1;
					if(m==0) return m;
				}
				return m;
			}
			if (b>a[m]){
				l=m+1;
			}
			else r=m;

			if(l==r) return 10101010;//error "message" occured, if searched element is not in array
		}
		return m;
	}
	public static void main(String args[]){
		int a[]= {2,2,2,3,4,5,6,7,7,7,8,9,10,10,10,10,10,11,11,11,11,11,11,12,13,14,15,16};
		System.out.println(arrsearch(a,Integer.parseInt(args[0])));
	}
}