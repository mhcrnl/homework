class Employee{
	private String name;
	private String surname;
	private int salary;
	private int inn;

	 public Employee(){

	 }

	 public Employee(String name, String surname, int salary, int inn){
	 	this.name=name;
	 	this.surname=surname;
	 	this.salary=salary;
	 	this.inn=inn;
	 }

	public void print(){
	 	System.out.println(name+" "+surname+" "+salary+" "+inn);
	 }

	public void setname(String name){
		this.name = name;
	}
	public String getname(){
		return name;
	}

	public void setsurname(String surname){
		this.surname = surname;
	}
	public String getsurname(){
		return surname;
	}

	public void setsalary(int salary){
		this.salary = salary;
	}
	public int getsalary(){
		return salary;
	}

	public void setinn(int inn){
		this.inn = inn;
	}
	public int getinn(){
		return inn;
	}
}