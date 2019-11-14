package fr.diginamic.banque.entites;

public class TestObjetGeometrique {

	public static void main(String[] args) {

		ObjetGeometrique[] objet = new ObjetGeometrique[2];
		objet[0] = new Rectangle();
		objet[1] = new Cercle();

		// boucle d'affichage du perimetre et de la surface des objets
		for (int i = 0; i < objet.length; i++) {
			System.out.println(objet[i]);
		}

	}

}
