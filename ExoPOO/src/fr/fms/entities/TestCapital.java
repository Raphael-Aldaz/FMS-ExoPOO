package fr.fms.entities;

public class TestCapital {

	public static void main(String[] args) {
		Capitale paris = new Capitale("Paris", "France", 2000000, "Tour Eiffel");
		Capitale london = new Capitale("Londres", "GB", 94000000, "Bigben");
		System.out.println(paris);
		System.out.println(london);
	}

}
