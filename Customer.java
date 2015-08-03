import java.util.Arrays;
class Customer{	

	private int id;
	private String surname;
	private String name;
	private String fathersname;
	private String address;
	private int sumpurchase;
	private int creditcardno;
	private int bankacc;

	public Customer(int id,String surname,String name,String fathersname,String address,int sumpurchase,int creditcardno,int bankacc){
		this.id=id;
		this.surname=surname;
		this.name=name;
		this.fathersname=fathersname;
		this.address=address;
		this.sumpurchase=sumpurchase;
		this.creditcardno=creditcardno;
		this.bankacc=bankacc;
	}

	public Customer(){

	}

	public void setid(int id){
		this.id=id;
	}
	public int getid(){
		return id;
	}
	
	public void setsurname(String surname){
		this.surname=surname;
	}
	public String getsurname(){
		return surname;
	}

	public void setname(String name){
		this.name=name;
	}
	public String getname(){
		return name;
	}

	public void setfathersname(String fathersname){
		this.fathersname=fathersname;
	}
	public String getfathersname(){
		return fathersname;
	}

	public void setaddress(String address){
		this.address=address;
	}
	public String getaddress(){
		return address;
	}

	public void setsumpurchase(int sumpurchase){
		this.sumpurchase=sumpurchase;
	}
	public int getsumpurchase(){
		return sumpurchase;
	}

	public void setcreditcardno(int creditcardno){
		this.creditcardno=creditcardno;
	}
	public int getcreditcardno(){
		return creditcardno;
	}

	public void setbankacc(int bankacc){
		this.bankacc=bankacc;
	}
	public int getbankacc(){
		return bankacc;
	}

	public void Info(){
		System.out.println(id+" "+surname+" "+name+" "+fathersname+" "+address+" "+sumpurchase+" "+creditcardno+" "+bankacc+"\n");
	}

}