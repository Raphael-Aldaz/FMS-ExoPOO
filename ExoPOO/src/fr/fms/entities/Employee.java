package fr.fms.entities;

public class Employee extends Person  {
	private String company;
	private int salary;
	
	public Employee(String firstName, String lastName, int age, String adress, City birthPlace, String company, int salary  ) {
		super(firstName, lastName, age, adress, birthPlace);
		setCompany(company);
		setSalary(salary);
	}

	

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public  String toString() {
		return super.toString() + " , Entrptise : " + getCompany() + " , salire : " + getSalary();
	}
	
}
