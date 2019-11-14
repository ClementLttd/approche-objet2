package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.*;

public class TestBanque {

	public static void main(String[] args) {
		Compte c1 = new Compte(153, 140);
		c1.setSoldeCompte(150);


		//Création d'un tableau de comptes
		Compte[] comptes = new Compte[2];
		comptes[0] = new Compte(12, 150);
		comptes[1] = new CompteTaux(12, 250, 15);
		
		//Boucle sur le tableau de comptes
		for(int i=0 ; i<comptes.length ; i++) {
			System.out.println(comptes[i]);
		}
		
	}

}
