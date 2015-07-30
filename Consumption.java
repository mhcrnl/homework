class Consumption{
	float kmRun;
	float litresUsed;
	float fuelPrice;

	float avgcons(){
		return ((100*litresUsed)/kmRun);
	}

	float avgcost(){
		return ((((100*litresUsed)/kmRun)/100)*fuelPrice);
	}
}