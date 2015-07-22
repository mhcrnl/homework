class NN35{
	static float sum(int p){
		float vklad=1000;
		int i=0;
		if(p>0&&p<25){
			while(vklad<1100){
				vklad=vklad*(p/100f+1);
				i++;
			}
			System.out.println(vklad+" UAH on bank deposit, reached in "+i+"months");
		}
		return vklad;		
	}
	public static void main (String args[]){
		sum(Integer.parseInt(args[0]));
	}
}