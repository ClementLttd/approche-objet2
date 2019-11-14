package essais;

import entites.Personne;
import entites.AdressePostale;

public class TestPersonne {

	public static void main(String[] args) {
		AdressePostale a = new AdressePostale(5, " rue de messidor ", 34000, " Montpellier ");

		AdressePostale b = new AdressePostale(8, " rue de la comédie ", 34000, " Montpellier ");

		Personne a1 = new Personne("Durant", "Pierre", a);
		a1.afficherIdentite();
		a1.changerNom("ocdishvj");
		a1.changerPrenom("lolo");
		a1.changerAdresse(b);
		a1.changerTout("Paul", "Vauquier", b);
		System.out.println(a1.retournerNom());
		a1.retournerPrenom();
		a1.retournerAdresse();

		Personne a2 = new Personne("Loriot", "George", b);
		a2.afficherIdentite();

		System.out.println(a1.retournerNom() + a1.retournerPrenom() + a.getAdresse());
		System.out.println(a2.retournerNom() + a2.retournerPrenom() + b.getAdresse());

	}

}
