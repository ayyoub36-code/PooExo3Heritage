package fr.fms.entities;

public class TestCapital {

	public static void main(String[] args) {
		// add capital and show
		Capital paris = new Capital("Paris", "France", 2000000, "Tour Eiffel");
		Capital london = new Capital("Londres", "GB", 9000000, "Bigben ");

		System.out.println(paris);
		System.out.println(london);
	}

}
