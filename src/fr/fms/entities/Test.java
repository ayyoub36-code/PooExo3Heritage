package fr.fms.entities;

public class Test {

	public static void main(String[] args) {
		// Employes instance and show
		Capital washington = new Capital("Washington", "USA", 7600000, "W-M");
		City pretoria = new City("Pretoria", "Afrique du sud", 800000);

		Employe bill = new Employe("Gate", "Bill", 65, "USA", washington, "Fondation B&M", 100000);
		Employe musk = new Employe("Musk", "Elon", 49, "palo alto", pretoria, "Tesla", 150000);

		System.out.println(bill);
		System.out.println(musk);

		System.out.println("---------------------------3.3----------------------------");
		SalesPerson doe = new SalesPerson("Dupont", "Robert", 55, "rue des rosiers",
				new City("Limoges", "France", 133000), "brico", 5.0);
		System.out.println(doe);

		System.out.println("---------------------------3.4----------------------------");
		doe.setTurnover(1.5);
		System.out.println(doe);

		System.out.println("---------------------------3.5----------------------------");
		System.out.println(bill);

	}

}
