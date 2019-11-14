package essais;

import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {

		AdressePostale a = new AdressePostale(5, "rue de messidor", 34000, "Montpellier");

		AdressePostale b = new AdressePostale(8, "rue de la comédie", 34000, "Montpellier");

		System.out.println(a.getAdresse());
		System.out.println(b.nbDepartements);
		System.out.println(a.nbDepartements);

	}

}
