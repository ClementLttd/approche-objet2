package sets;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Pays {

	String nom;
	double nbHab;
	double pibHab;
	
	public Pays(String nom, double nbHab, double pibHab) {
		this.nbHab = nbHab;
		this.nom = nom;
		this.pibHab = pibHab;
	}

	public static void main(String[] args) {

		Set<Pays> pays = new HashSet<>();
		Pays p1 = new Pays("USA", 2500000, 1200);
		pays.add(p1);
		Pays p2 = new Pays("France", 150000, 2500);
		pays.add(p2);
		Pays p3 = new Pays("Allemagne", 350000, 2800);
		pays.add(p3);
		Pays p4 = new Pays("UK", 850000, 2900);
		pays.add(p4);
		Pays p5 = new Pays("Italie", 650000, 5500);
		pays.add(p5);
		Pays p6 = new Pays("Japon", 450000, 4500);
		pays.add(p6);
		Pays p7 = new Pays("Chine", 130000, 6500);
		pays.add(p7);
		Pays p8 = new Pays("Russie", 120000, 4500);
		pays.add(p8);
		Pays p9 = new Pays("Inde", 1500, 3200);
		pays.add(p9);
		
		
		//faire une boucle et comparer les differents resultats pour trouver le plus grand
		for(int i=0 ; i<pays.size() ; i++) {
		
		}
		
		//rechercher boucle objet
		
	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getNbHab() {
		return nbHab;
	}

	public void setNbHab(double nbHab) {
		this.nbHab = nbHab;
	}

	public double getPibHab() {
		return pibHab;
	}

	public void setPibHab(double pibHab) {
		this.pibHab = pibHab;
	}
}
