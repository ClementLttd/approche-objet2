package entites;

import entites.AdressePostale;

public class Personne {

	//Variables d'instance
	String nom;
	String prenom;
	AdressePostale adresse;

	public Personne(String nom, String prenom, AdressePostale adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	// construction d'une méthode  d'instance qui affiche le nom + prenom
	public void afficherIdentite() {
		System.out.println(prenom + " " + nom.toUpperCase());
	}

	public void changerNom(String nom) {
		this.nom = nom;
	}

	public void changerPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void changerAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}

	public void changerTout(String nom, String prenom, AdressePostale adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	public String retournerNom() {
		return nom;
	}

	public String retournerPrenom() {
		return prenom;
	}

	public AdressePostale retournerAdresse() {
		return adresse;
	}
}
