class EmployeeTest{
	public static void main(String args[]){
		Employee Karen = new Employee("Karen","Grygoryan",1000,12345);
		Employee Olga = new Employee();
		Manager Gaya = new Manager("Gaya","Grygoryan",500, 98765,800);
		Manager Ashot = new Manager();

		Karen.print();
		Olga.print();
		Gaya.print();
		Ashot.print();

		Olga = new Employee("Olga","Grygoryan",800,45673);
		Ashot.setname("Ashot");
		Ashot.setsurname("Grygoryan");

		Olga.print();
		Ashot.print();

		System.out.println(Gaya.getsalary());


	}
}