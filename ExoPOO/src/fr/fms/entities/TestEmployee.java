package fr.fms.entities;

public class TestEmployee {

	public static void main(String[] args) {
		Employee bill = new Employee("Gate", "Bill", 65, "USA",new Capitale("Washington" ,"USA", 7600000, "W-M"), "Fondation B&M", 100000);
		Employee melonMusk = new Employee("Musk", "Melon", 49, "palo alto",new City("Pretoria" ,"Afrique du sud", 800000), "Tesla", 150000);
		System.out.println(bill);
		System.out.println(melonMusk);
	}

}
