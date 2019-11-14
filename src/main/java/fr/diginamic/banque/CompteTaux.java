package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

//création d'un lien avec la class super Compte (extends)
public class CompteTaux extends Compte {

	private int tauxRem;

	// constructeur class fille pour importer les données de la classe comptr
	public CompteTaux(int numeroDeCompte, int soldeCompte, int tauxRem) {
		super(numeroDeCompte, soldeCompte);
		this.tauxRem = tauxRem;

	}

	// recuperation de la methode toString avec tauxRem en plus
	public String toString() {
		String infos = super.toString();
		return infos + " " + tauxRem;

	}

}
