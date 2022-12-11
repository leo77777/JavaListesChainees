package fr.leo.list;

import java.util.List;

public interface IListeChainee {
	void aficherList();
	boolean addMaillon(Maillon maillon );
	boolean deleteMaillon(Maillon maillon);
	Maillon chercherValeur(int valeur);
	Maillon shift();
	Maillon pop();
}
