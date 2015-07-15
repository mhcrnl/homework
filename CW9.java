  import java.util.Arrays;
  class CW9{
  public static void main (String args[]){
    int n = Integer.parseInt(args[0]);
  	int []ar={1,2,3,4,5,6,7,8,9,10};
  	System.out.println(Arrays.toString(ar));
    int a=0;
    int z =ar[ar.length-1];
    for(int c=0;c<n;c++){
  	 for (int i =ar.length-1;i>=1;i--){
  		  a =ar[ar.length-1];
        ar[i]=ar[i-1];
  	 }
     ar[0]=a;
  }
  ar[0]=z;
  System.out.println(Arrays.toString(ar));
  }
  }