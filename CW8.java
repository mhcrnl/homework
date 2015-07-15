  import java.util.Arrays;
  class CW8{
  public static void main (String args[]){
  	int []ar={1,2,3,4,5,6,7,8,9,10};
  	System.out.println(Arrays.toString(ar));
    int a =ar[ar.length-1];
  	for (int i =ar.length-1;i>=1;i--){
  		ar[i]=ar[i-1];
  	}
    ar[0]=a;
  	System.out.println(Arrays.toString(ar));
  }
  }