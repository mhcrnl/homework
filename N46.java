import java.util.Arrays;
class N46{
	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);
		int ars[]=new int [n];
		int y =0;
		for(int i =1; i<=n;i++){
			int a = Integer.parseInt(args[i]);
			ars[i-1]=a;
		}
		System.out.println(Arrays.toString(ars));
		for(int i =1; i<n;i++){
			if (ars[i]==ars[i-1]){
				y++;
			}
		}
		int ars2[]=new int[n-y];
		int z =ars2.length-1;
		ars2[ars2.length-1]=ars[ars.length-1];		
		for(int i =ars.length-1;i>0;i--){
			if(ars2[z]!=ars[i-1]){
				ars2[z-1]=ars[i-1];
				z--;
			}
		}
		System.out.println(Arrays.toString(ars2));
	}
}