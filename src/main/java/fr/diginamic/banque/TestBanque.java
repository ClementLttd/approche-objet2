package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {

	public static void main(String[] args) {
		Compte c1 = new Compte(153, 140);
		c1.setSoldeCompte(150);
		
		System.out.println(c1.getNumeroDeCompte() + " " + c1.getSoldeCompte());
		System.out.println(c1.toString());
	}
	
}
