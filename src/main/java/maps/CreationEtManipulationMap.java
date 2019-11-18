package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		
		Map<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		Iterator<Integer> keysIte = mapVilles.keySet().iterator();
		while (keysIte.hasNext()) {
			Integer iterator = keysIte.next();
			System.out.println(iterator);
		}
		Iterator<String> valuesIte = mapVilles.values().iterator();
		while (valuesIte.hasNext()) {
			String iterator = valuesIte.next();
			System.out.println(iterator);
		}
		
		System.out.println(mapVilles.size());
	}

}
