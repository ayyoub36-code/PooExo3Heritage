package fr.fms.entities;

public class Employe extends Person {

	private String company;
	private double salary;
	final double FEE = 0.2;

	public Employe(String lastName, String firstName, int age, String adress, City cityOfBirth, String company,
			double salary) {
		super(lastName, firstName, age, adress, cityOfBirth);
		setCompany(company);
		setSalary(salary);
	}

	public Employe(String lastName, String firstName, int age, String adress, City cityOfBirth, String company) {
		super(lastName, firstName, age, adress, cityOfBirth);
		setCompany(company);

	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary < 0) {
			System.out.println("vous ne pouvez pas entrer de valeur négatif !");
		} else
			this.salary = salary;
	}

	@Override
	public String toString() {
		if (salary == 0) {
			return super.toString() + " Entreprise :  " + company;
		} else
			return super.toString() + " Entreprise :  " + company + ", salaire : " + salary;
	}

	@Override
	public double salary() {
		// salaire d'un employe (salaire - charges)
		salary = salary - (salary * FEE);
		return salary;
	}

	public void display() {
		System.out.println("salaire mensuel de " + getFirstName() + " " + getLastName() + " : " + this.salary());
	}

}
