class CustomerTest{
	public static void main(String[] args) {
		Customer Karen = new Customer(1,"Grygoryan","Karen","Ashot","Odessa",5000,12345,77777);
		Karen.Info();
		Karen.setid(2);
		Karen.setname("Olga");
		Karen.setsurname("Lamzaki");
		Karen.setfathersname("Vitalievna");
		Karen.setaddress("Kyiv");
		Karen.setsumpurchase(999999);
		Karen.setcreditcardno(545789);
		Karen.setbankacc(194521);
		Karen.Info();

		Customer Vasya = new Customer();
		Vasya.setbankacc(48938);
		Vasya.setid(55);
		Vasya.Info();
	}
}