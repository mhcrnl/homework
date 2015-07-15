import java.util.Arrays;
class N45{
	public static void main(String args[]){
		int b = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		int ars[]=new int [n+1];
		for(int i =1; i<=n;i++){
			ars[i-1] = Integer.parseInt(args[i+1]);
		}
		ars[ars.length-1]=b;		
		System.out.println(Arrays.toString(ars));		
		for(int i =ars.length-1;i>0;i--){
			if(ars[i]<ars[i-1]){
				int a = ars[i-1];
				ars[i-1]=ars[i];
				ars[i]=a;
				System.out.println(Arrays.toString(ars));
			}
		}	
	}
}