class N15{
	public static void main(String args[]){
		int a=Integer.parseInt(args[0]);
		if (a>=0 && a<=86399){
		int sec=a%60;//seconds
		a/=60;
		int min=a;//minutes
		int hrs=0;//hours
			if(a>60){
				min=a%60;//minutes
				hrs=a/60;//hours
				}
		System.out.println("Time in 24h format: "+hrs+"hours "+min+"minutes "+sec+"seconds ");
		System.out.println("Time past from last hour : "+min+"minutes "+sec+"seconds ");
		}
		else
			System.out.println("Your number is out of range!");
		
		
	}
}