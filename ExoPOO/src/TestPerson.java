
public class TestPerson {
   /*
	public static void main(String[] args) {
		Person manu = new Person("Macron", "Emmanuel", 43, "Elysee à Paris", new City("Amiens","France"));
		Person poutine = new Person("Poutine", "Vladimir", 68);
		Person joe = new Person("Biden", "joe");
		
		System.out.println(manu);
		System.out.println(poutine);
		System.out.println(joe);
	}
*/
	
	public static void main (String[] args) {
		Person[] person = new Person[6];
		person[0] = new Person("Macron", "Emmanuel", 43, "Elysee à Paris", new City("Amiens","France"));
		person[1]  = new Person("Sarkozy", "Nicolas", 66, "Paris", new City("Paris","France", 2000000));
		person[2]  = new Person("Johnson", "Boris", 56, "Downing street à Londres", new City("New York","Etats-unis"));
		person[3]  = new Person("Depardieu", "Gerard", 72, "Moscou", new City("Châteauroux","France"));
		person[4] = new Person("Kravitz", "Lenny", 56, "Hotel particulier à Paris", new City("New York","USA"));
		person[5] = new Person("Lawrence", "Jennifer", 30, "Louisvilles aux USA", new City("Indian Hills","USA"));
		
		for(Person p : person) {
			
			if(p.getBirthPLace().getCountry().equals("France") || p.getAdress().contains("Paris")) {
				System.out.println(p.getFirstName()+ ", " 
						+ p.getLastName() + ", " 
						+ p.getAge() +"ans, habitant  "
						+ p.getAdress()+ " ,ville de naissance " 
						+ p.getBirthPLace().getName() 
						+ ", " + p.getBirthPLace().getCountry() 
						+ " population " + p.getBirthPLace().getName() 
						+ " " + p.getBirthPLace().getNumberOfResident() + " d'habitants");
						
			}
			
		}
	
	
	}
}
