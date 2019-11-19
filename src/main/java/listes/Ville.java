package listes;

import java.util.ArrayList;
import java.util.List;

public class Ville {
	
	public String nom;
	public int nbHab;

	public Ville(String nom, int nbHab) {
		this.nom=nom;
		this.nbHab=nbHab;
	}

	public static void main(String[] args) {
		List<Ville> listVille = new ArrayList<Ville>();
		
		listVille.add("Nice", 343000);
		listVille.add("Carcassonne", 47800);
		listVille.add("Narbonne", 53400);
		listVille.add("Lyon", 484000);
		listVille.add("Foix", 9700);
		listVille.add("Pau", 77200);
		listVille.add("Marseille", 850700);
		listVille.add("Tarbes", 40600);
		
	}

}
