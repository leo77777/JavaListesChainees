package fr.leo.list;

public class Maillon {
	private int valeur;
	private Maillon suivant;
	
	public Maillon(int valeur, Maillon suivant) {
		super();
		this.valeur = valeur;
		this.suivant = suivant;
	}

	public Maillon() {
		super();
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	public Maillon getSuivant() {
		return suivant;
	}

	public void setSuivant(Maillon suivant) {
		this.suivant = suivant;
	}	
}
