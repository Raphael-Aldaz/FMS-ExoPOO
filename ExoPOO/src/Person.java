
public class Person {
	private String firstName = "unknow";
	private String lastName= "unknow";
	private int age =0;
	private String adress= "unknow";
	private City birthPlace;
	
	
	public Person(String firstName, String lastName, int age, String adress, City birthPlace) {
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setAdress(adress );
		setBirthPlace(birthPlace);
	}
	public Person(String firstName, String lastName, int age) {
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		
	}
	public Person(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
		
	}
	public Person(String firstName) {
		setFirstName(firstName);
		
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public City getBirthPLace() {
		return birthPlace;
	}
	public void setBirthPlace( City birthPlace) {
		this.birthPlace = birthPlace;
	}
	
	
	@Override
	public String toString() {
	return "Person [lastName = " + lastName +", "+"firstName = " + firstName + ", "+"age = " + age +", "+"adress = " + adress +"] BornCity [ " + birthPlace + " ]";  
	
	
	}

}
