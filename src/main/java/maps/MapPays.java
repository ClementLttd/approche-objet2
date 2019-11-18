package maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapPays {

	public static void main(String[] args) {
		
		Map<String, Integer> mapPays = new HashMap<>();
		mapPays.put("USA", 3272000 );
		mapPays.put("France", 669900);
		mapPays.put("Allemagne", 827900);
		mapPays.put("UK", 664400);
		mapPays.put("Italie", 604800);
		mapPays.put("Japon", 1268000);
		mapPays.put("Chine", 13860000);
		mapPays.put("Russie", 1445000);
		mapPays.put("Inde", 13390000);
		
		Iterator<String> keysIte = mapPays.keySet().iterator();
		while (keysIte.hasNext()) {
			String key = keysIte.next();
			System.out.println(key);
			
			System.out.println(mapPays.get(key));
			
		}
		
		System.out.println(mapPays);
		
	}
/*
 * comparator
 * public class VilleComparator implements Comparator<Ville> {
 * public int compare(Ville v1, Ville v2) {
 * if (v1.getPopulation() > v2.getPopulation()){
 * return-1;
 * }else if (v1.getPopulation() < v2.getPopulation()){
 * return 1;
 * }
 * return 0;
 * 
 * 
 * List <Ville>...
 * 
 * Collections.sort(villes, new VilleComparator());
 */
}
