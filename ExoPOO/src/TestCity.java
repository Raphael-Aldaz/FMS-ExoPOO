
public class TestCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City city1 = new City("Toulouse", "France", 450000);
		City city2 = new City("Pau", "France", 100000);
		City city3 = new City("Bayonne", "France", 50000);
		City city4 = new City("Bordeaux", "France", 250000);
	
		city1.display();
		System.out.println("##############");
		city2.display();
		System.out.println("##############");
		city3.display();
		System.out.println("##############");
		city4.display();
		
		city1.numberOfResident += 2000;
		city1.display();
	}

}
