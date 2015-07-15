import java.util.Arrays;
class CW10{
	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);//Shift of array by n
		int q = n;
  		int []ar={1,2,3,4,5,6,7,8,9,10};
  		System.out.println(Arrays.toString(ar));
  		for (int i =ar.length-1;i>=ar.length/2;i--){
  			int a=ar[i];
  			ar[i]=ar[ar.length-i-1];
  			ar[ar.length-i-1]=a;
  		}
  		System.out.println(Arrays.toString(ar));
  		for (int i =ar.length-1;i>=n;i--){
  			int a=ar[i];
  			ar[i]=ar[n];
  			ar[n]=a;
  			n++;
  		}
  		System.out.println(Arrays.toString(ar));
  		n=q;
  		for (int i =0;i<n-1;i++){
  			int a=ar[i];
  			ar[i]=ar[n-1];
  			ar[n-1]=a;
  			n--;
  		}
  		System.out.println(Arrays.toString(ar));
	}
}