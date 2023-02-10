package fr.fms.entities;

public class SalesPerson extends Employe {

	private double turnoverPercentage; // pourcentage du du chiffre d 'affaire
	final double MIN_CA = 2.5;
	final double TURNOVER = 50000;

	public SalesPerson(String lastName, String firstName, int age, String adress, City cityOfBirth, String company,
			double turnoverPercentage) {
		super(lastName, firstName, age, adress, cityOfBirth, company);
		setTurnover(turnoverPercentage);
	}

	public double getTurnover() {
		return turnoverPercentage;
	}

	public void setTurnover(double turnoverPercentage) {
		if (turnoverPercentage < MIN_CA) {
			System.out.println("le pourcentage du  chiffre d'affaire ne peut pas être inferieur à " + MIN_CA);
		} else {
			this.turnoverPercentage = turnoverPercentage;
		}

	}

	@Override
	public double salary() {
		// calculer le salaire d'un commercial
		double salary = (turnoverPercentage * TURNOVER) / 100;
		return salary;
	}

	@Override
	public String toString() {

		return super.toString() + ", % CA : " + turnoverPercentage;
	}

}
