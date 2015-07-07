class N35{
	public static void main(String args[]){
		float p = Float.parseFloat(args[0]);
		float vklad=1000;
		int i=0;
		if(p>0&&p<25){
			while(vklad<=1100){
				vklad=vklad*(p/100+1);
				i++;
				System.out.println(vklad);
			}
			System.out.println(vklad+" UAH on bank deposit, reached in "+i+"months");
		}			
		else
			System.out.println("Entered number should be 0 < X < 25!");
	}
}