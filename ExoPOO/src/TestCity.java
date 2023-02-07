
public class TestCity {

	public static void main(String[] args) {
		
		City city1 = new City("Rabat", 577000);
		City city2 = new City("Rabat", "Maroc", 577000);
		
		city1.display();
		city2.display();
		/* 1-1
		City city2 = new City("Pau", "France", 100000);
		City city3 = new City("Bayonne", "France", 50000);
		City city4 = new City("Bordeaux", "France", 250000);
	
		city1.display();
		System.out.println("##############");
		city2.display();
		System.out.println("##############");
		city3.display();
		System.out.println("##############");
		city4.display();*/
		
		
		/* 1-2
		System.out.println(city1.getName() + " : " + city1.getCountry() + " : " + city1.getNumberOfResident() );
		city1.setNumberOfResident( city1.getNumberOfResident() + 200);
		System.out.println(city1.getName() + " : " + city1.getCountry() + " : " + city1.getNumberOfResident() );
		*/
		
		
	}

}
