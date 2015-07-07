class N28{
	public static void main(String args[]){
		int d =Integer.parseInt(args[0]);
		int m =Integer.parseInt(args[1]);
		String zodiac="";
		if(m==1 && d>19 && d<32 || m==2 && d>0 && d<19){
			zodiac = "Aquarius";
		}
		else if (m==2 && d>18 && d<28 || m==3 && d>0&&d<21){
			zodiac = "Pisces";
		}
		else if (m==3 && d>20 && d<32 || m==4 && d>0&&d<20){
			zodiac = "Aries";
		}
		else if (m==4 && d>19 && d<31 || m==5 && d>0&&d<21){
			zodiac = "Taurus";
		}
		else if (m==5 && d>20 && d<32 || m==6 && d>0&&d<22){
			zodiac = "Gemini";
		}
		else if (m==6 && d>21 && d<31 || m==7 && d>0&&d<23){
			zodiac = "Cancer";
		}
		else if (m==7 && d>22 && d<32 || m==8 && d>0&&d<23){
			zodiac = "Leo";
		}
		else if (m==8 && d>22 && d<32 || m==9 && d>0&&d<23){
			zodiac = "Virgo";
		}
		else if (m==9 && d>22 && d<31 || m==10 && d>0&&d<23){
			zodiac = "Libra";
		}
		else if (m==10 && d>22 && d<32 || m==11 && d>0&&d<23){
			zodiac = "Scorpio";
		}
		else if (m==11 && d>22 && d<31 || m==12 && d>0&&d<22){
			zodiac = "Sagittarius";
		}
		else if (m==12 && d>21 && d<32 || m==1 && d>0&&d<20){
			zodiac = "Capricorn";
		}
		else{
		System.out.println("Your dates are out of range");
		}
		System.out.println(zodiac);
	}
}