  import java.util.Arrays;
  class CW7{
  public static void main (String args[]){
  	int []ar={1,2,3,4,5,6,7,8,9,10};
  	System.out.println(Arrays.toString(ar));
  	for (int i =ar.length-1;i>=ar.length/2;i--){//ИНВЕРСИЯ МАССИВА ПО СЕРЕДИНЕ
  		int a=ar[i];
  		ar[i]=ar[ar.length-i-1];
  		ar[ar.length-i-1]=a;
  	}
  	System.out.println(Arrays.toString(ar));
  }
  }