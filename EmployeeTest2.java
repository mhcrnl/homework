class EmployeeTest2{
	public static void main(String args[]){

		Employee fabrika[] = new Employee[10];

		fabrika[0] = new Employee("Vasya","Pipko",500,12345);
		fabrika[1] = new Employee("Petya","Butko",450,54321);
		fabrika[2] = new Employee("Igor","Gaika",490,84321);
		fabrika[3] = new Employee("Fedya","Kok",550,94321);
		fabrika[4] = new Employee("Ivan","Makdonald",600,50021);
		fabrika[5] = new Employee("Andrey","Shevchenko",520,76401);
		fabrika[6] = new Employee("Mikhail","Struchko",420,90871);
		fabrika[7] = new Employee("Egor","Loshkin",480,33441);
		fabrika[8] = new Manager("Olga","Karapatko",950,70431,150);
		fabrika[9] = new Manager("Stas","Fedorenko",800,67892,100);

		int b =0;
		for (int i=0;i<fabrika.length;i++){			
			b =b+fabrika[i].getsalary();			
		}
		System.out.println("Monthly summary of salary : "+b+" UAH");

		int min=fabrika[0].getsalary();
		int max=fabrika[0].getsalary();
		int indexmin=0;
		int indexmax=0;
		for(int i=1;i<fabrika.length;i++){
			if (max<fabrika[i].getsalary()){
				max=fabrika[i].getsalary();
				indexmax=i;
			}
			if (min>=fabrika[i].getsalary()){
				min=fabrika[i].getsalary();
				indexmin=i;
			}
		}
		System.out.print("Min salary: ");
		fabrika[indexmin].print();
		System.out.print("Max salary: ");
		fabrika[indexmax].print();
	}
}