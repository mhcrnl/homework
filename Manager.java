class Manager extends Employee{
	private int bonus;

	public Manager(){
		super();
	}
	public Manager(String name, String surname, int salary, int inn, int bonus){
		super(name,surname,salary,inn);
		this.bonus=bonus;
	}

	public int getsalary(){
		return super.getsalary()+bonus;
	}

	public void setbonus(int bonus){
		this.bonus=bonus;
	}
	public int getbonus(){
		return bonus;
	}

	public void print(){
	 	System.out.println(getname()+" "+getsurname()+" "+super.getsalary()+" "+getinn()+" "+bonus);
	 }

}