
public class City {

	public String name;
	public String country;
	public int numberOfResident;
	
	public City (String name, String country, int numberOfResident) {
		this.name = name;
		this.country=country;
		this.numberOfResident = numberOfResident;
	}
	
	public  void display() {
		System.out.println("Name : " + name +"\n"
							+"Country : " + country + "\n"
							+"Number of residents : " + numberOfResident);
	}
	
}
