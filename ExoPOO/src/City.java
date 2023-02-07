
public class City {

	private String name;
	private String country;
	private int numberOfResident;
	
	public City (String name, String country, int numberOfResident) {
		setName( name);
		setCountry(country);
		setNumberOfResident(numberOfResident);
	}
	public City(String name, int numberOfResident) {
		setName(name);
		setCountry("unknow");
		setNumberOfResident(numberOfResident);
	}

	
	public String getName() {
		return name;
	}
	public void setName( String name) {
		this.name = name;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		 this.country= country;
		
	}
	
	public int getNumberOfResident() {
		return numberOfResident;
	}
	
	public void setNumberOfResident(int numberOfResident) {
		if(numberOfResident >= 0) {
			this.numberOfResident = numberOfResident;
		} else {
			System.out.println("Il ne peux pas y avoir un nombre negatif d'habitant");
		}
		
			
			
		
	}
	
	/*public  void display() {
		System.out.println("[ville : " + name +"] "+"[pays : " + country + "] "+"[nombre d'habitans : " + numberOfResident +" ]");
		}*/
	
	public void display() {
		System.out.println("ville de " + name + " en "+ country + " ayant " + numberOfResident);
	}
							
	
	
}
