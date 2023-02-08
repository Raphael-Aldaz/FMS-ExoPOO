package fr.fms.entities;

public class Capitale extends City  {
	private String monument = null;
	
	
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
		if (monument.equals(null) ) {
			return super.toString();
		}else {
			return super.toString()+" monument : " + monument;
		}
		 
	}
	
}
