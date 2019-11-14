package fr.diginamic.banque.entites;

public class Compte {
	 int numeroDeCompte;
	 int soldeCompte;

	 //Constructeur
	public Compte(int numeroDeCompte, int soldeCompte) {
		
		this.numeroDeCompte = numeroDeCompte;
		this.soldeCompte = soldeCompte;
	}

	//getter
	public int getNumeroDeCompte() {
		return numeroDeCompte;
	}
	//setter
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
