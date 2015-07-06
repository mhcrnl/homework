class CW3{
	public static void main(String args[]){
		String name = "Richard M. Nixon";
		boolean startWord = true;
		for(int i=0; i < name.length(); i++){
			if (startWord){
				System.out.println(name.charAt(i));
			}
      		startWord=name.charAt(i)==' ';  		


		}
	}
}