class CustomerTest2{
	public static void main(String[] args){
		
		Customer clients[] = new Customer[3];
		clients[0]=new Customer(1,"Pypkin","Vasya","Konstantinovich","Lviv",3333,64537,928365);
		clients[1]=new Customer(2,"Dobkin","Kolya","Viktorovich","Kharkiv",3480,45873,105768);
		clients[2]=new Customer(3,"Detochkin","Petya","Ivanovich","Odessa",8975,98712,384910);
		

		for(int i=0;i<clients.length;i++){			
			if (clients[i].getcreditcardno()>1 && 77777>clients[i].getcreditcardno() ){
				 clients[i].Info();
			}
		}

		for(int i=0;i<clients.length;i++){			
			if (clients[i].getsumpurchase()>555){
				 clients[i].Info();
			}
		}
	}
}