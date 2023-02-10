package fr.fms.entities;

import java.util.ArrayList;
import java.util.List;

public class TestEntities {

	public static void main(String[] args) {
		// exo 3.6 employees salesPerson tab
		List<Employe> listEmpl = new ArrayList<Employe>();
		List<SalesPerson> listSales = new ArrayList<SalesPerson>();

		Capital washington = new Capital("Washington", "USA", 7600000, "W-M");
		City pretoria = new City("Pretoria", "Afrique du sud", 800000);

		Employe bill = new Employe("Gate", "Bill", 65, "USA", washington, "Fondation B&M", 100000);
		Employe musk = new Employe("Musk", "Elon", 49, "palo alto", pretoria, "Tesla", 150000);

		listEmpl.add(bill);
		listEmpl.add(musk);

		SalesPerson doe = new SalesPerson("Doe", "John", 35, "rue de la cata", new City("Toulouse", "France", 533000),
				"macdo", 3.0);
		SalesPerson dupont = new SalesPerson("Dupont", "Robert", 55, "rue des rosiers",
				new City("Limoges", "France", 133000), "brico", 5.0);

		listSales.add(doe);
		listSales.add(dupont);

		System.out.println("\nListe des employés :");
		listEmpl.forEach((employe) -> System.out.println(employe));

		System.out.println("\nListe des commerciaux :");
		listSales.forEach((salesMan) -> System.out.println(salesMan));

		List<Employe> listMixte = new ArrayList<Employe>();
		listMixte.add(bill);
		listMixte.add(musk);
		listMixte.add(doe);
		listMixte.add(dupont);
		System.out.println("\nListe mixte :");
		listMixte.forEach((person) -> System.out.println(person));
		System.out.println("\n-----------------------------------");
		listMixte.forEach((employe) -> employe.display());

	}

}
