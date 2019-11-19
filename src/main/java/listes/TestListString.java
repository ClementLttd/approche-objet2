package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.List;

public class TestListString {

	public static void main(String[] args) {
		
		List<String> listSt = new ArrayList<String>();
		
		listSt.add("Nice");
		listSt.add("Carcassonne");
		listSt.add("Narbonne");
		listSt.add("Lyon");
		listSt.add("Foix");
		listSt.add("Pau");
		listSt.add("Marseille");
		listSt.add("Tarbes");
		
		//boucle pour trouver le nom le plus long
		int max=0;
		String b=null;
		for (String a : listSt) {
			if(a.length()>max) {
				max = a.length();
				b = a;
			}
			//mettre tous les noms de ville en majuscules
			System.out.println(a.toUpperCase());
		}
			//affichage du nom le plus long
			System.out.println(b);
			
			//suppression des villes commençant par "n"
			String start = "N";
			for (String s: listSt) {
				
				if(s.startsWith(start)) {
					listSt.remove(s.startsWith(start));
					
				} 
				
				System.out.println(listSt);
			}
			
			
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
