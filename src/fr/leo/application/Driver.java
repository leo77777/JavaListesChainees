package fr.leo.application;

import fr.leo.list.ListChainee;
import fr.leo.list.Maillon;

public class Driver {

	public static void main(String[] args) {
		
		Maillon debut = new Maillon( 10, null);		
		ListChainee lc1 = new ListChainee(debut);
		lc1.addMaillon(new Maillon(20, null));
		lc1.addMaillon(new Maillon(30, null));
		Maillon m1 = new Maillon(40, null);
		lc1.addMaillon(m1);
		lc1.addMaillon(new Maillon(50, null));
		lc1.addMaillon(new Maillon(60, null));
		lc1.addMaillon(new Maillon(70, null));
		
		lc1.deleteMaillon(m1);		
		lc1.aficherList();
		
	 	Maillon m2 = lc1.chercherValeur(50);
		System.out.println("Resultat : " + m2.getValeur());
		
		Maillon m3 = lc1.shift();
		System.out.println("J'ai récupéré : " + m3.getValeur());
		System.out.println("Nouvelle liste : ");
		lc1.aficherList();
		
		System.out.println("Maintenant pop :");
		Maillon m4 = lc1.pop();
		System.out.println("J'ai récupéré : " + m4.getValeur());
		System.out.println("Nouvelle liste : ");
		lc1.aficherList();		
	}
}
