package fr.fms.entities;

public class Capitale extends City {
	private String monument;
	
	
	public Capitale(String name, String country, int numberOfResident, String monument) {
		super(name, country ,numberOfResident);
		
		setMonument(monument);
	}


	public String getMonument() {
		return monument;
	}


	public void setMonument(String monument) {
		this.monument = monument;
	}
	
	
	@Override
	public String toString() {
		return super.toString() +" monument : " + monument;
	}
	
}
