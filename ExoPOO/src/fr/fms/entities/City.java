package fr.fms.entities;

public class City {

	private String name;
	private String country;
	private int numberOfResident = 0;
	private static int nbr;
	
	public City (String name, String country, int numberOfResident) {
		setName( name);
		setCountry(country);
		setNumberOfResident(numberOfResident);
		nbr ++;
	}
	public City(String name, int numberOfResident) {
		setName(name);
		setCountry("unknow");
		setNumberOfResident(numberOfResident);
	}
	public City(String name, String country) {
		setName(name);
		setCountry(country);
	
	}
	
	
	public static int getNumber() {
		return nbr;
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
	
	/*public  String display1() {
		return"[name : " + name +", "+"state : " + country + ", "+"nbInHabitants : " + numberOfResident +" ]";
		}*/
	
	public void display() {
		System.out.println("ville de " + name + " en "+ country + " ayant " + numberOfResident);
	}
	/*
	@Override
	public String toString() {
		return "ville de " + name + " en "+ country + " ayant " + numberOfResident  ;
	}*/
	@Override
	public String toString() {
		return"name = " + name +", "+"state = " + country + ", "+"nbInHabitants = " + numberOfResident ;
	}
							
	
	
}
