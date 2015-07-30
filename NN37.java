class NN37{
	static boolean sum(int a){
		if (a>1){
			for(int i=2;i<a;i++){
			int c=a%i;
				if(c==0){
					return false;
				}	
			}
		}
		return true;
	}
	public static void main (String args[]){
		System.out.println(sum(Integer.parseInt(args[0])));
	}
}