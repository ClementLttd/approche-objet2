package fr.diginamic.banque.entites;

import fr.diginamic.banque.*;

public class Compte {
	private int numeroDeCompte;
	private int soldeCompte;

	// Constructeur
	public Compte(int numeroDeCompte, int soldeCompte) {

		this.numeroDeCompte = numeroDeCompte;
		this.soldeCompte = soldeCompte;
	}
	// méthode file toString

	public String toString() {
		return numeroDeCompte + " " + soldeCompte;

	}

	// getter
	public int getNumeroDeCompte() {
		return numeroDeCompte;
	}

	// setter
	public void setNumeroDeCompte(int numeroDeCompte) {
		this.numeroDeCompte = numeroDeCompte;
	}

	public int getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(int soldeCompte) {
		this.soldeCompte = soldeCompte;
	}
}
