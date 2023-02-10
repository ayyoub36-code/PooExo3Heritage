package fr.fms.entities;

public class Capital extends City {

	private String monument;

	public Capital(String name, String country, int nbInhabitants, String monument) {
		super(name, country, nbInhabitants);
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
		return super.toString() + " monument : " + monument;
	}

}
