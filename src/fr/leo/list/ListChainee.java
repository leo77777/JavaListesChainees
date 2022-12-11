package fr.leo.list;
public class ListChainee implements IListeChainee{
	
	private Maillon debut;
	
	public ListChainee() {
	}

	public ListChainee(Maillon debut) {
		super();
		this.debut = debut;
	}

	public Maillon getDebut() {	
		return debut;
	}

	public void setDebut(Maillon debut) {
		this.debut = debut;
	}

	@Override
	public void aficherList() {
		Maillon courant = debut;
		System.out.println(courant.getValeur());
		while ( ( courant =  courant.getSuivant() ) != null) {
			System.out.println(courant.getValeur());
		}
	}

	@Override
	public boolean addMaillon(Maillon maillon) {
		Maillon courant = debut;
	
		while (   courant.getSuivant()  != null) {
				courant = courant.getSuivant();
			}
			courant.setSuivant(maillon);
		return true;
	}

	@Override
	public boolean deleteMaillon(Maillon maillon) {
		Maillon courant = debut;
		while (   courant.getSuivant()  != maillon) {
			courant = courant.getSuivant();
		}
		
		courant.setSuivant(maillon.getSuivant());
	return true;
	}

	@Override
	public Maillon chercherValeur(int valeur) {
		Maillon courant = debut;
		while (   courant.getValeur()  != valeur) {
			courant = courant.getSuivant();
		}
		return courant;
	}

	@Override
	public Maillon shift() {
		Maillon courant = debut;
		Maillon result = debut;
		debut = debut.getSuivant();
		return result;
	}
	
	@Override
	public Maillon pop() {
		Maillon courant = debut;
		while (   courant.getSuivant().getSuivant()  != null) {
			courant = courant.getSuivant();
		}
		Maillon result = courant.getSuivant();
		courant.setSuivant(null);
		return result;
	}
}
