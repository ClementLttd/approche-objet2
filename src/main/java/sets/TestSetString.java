package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestSetString {

	public static void main(String[] args) {
		
		Set<String> setSt = new HashSet <String>();
		setSt.add("USA");
		setSt.add("France");
		setSt.add("Allemagne");
		setSt.add("UK");
		setSt.add("Italie");
		setSt.add("Japon");
		setSt.add("Chine");
		setSt.add("Russie");
		setSt.add("Inde");
		
		//affiche le nombre le plus haut (alphabet) et non le plus long
		String obj = Collections.max(setSt);
		System.out.println(Collections.max(setSt));
		
		//methode affichage mot le plus long
		int max=0;
		String b=null;
		for (String a : setSt) {
			if(a.length()>max) {
				max = a.length();
				b = a;
			}
			
		}
		//suppression du mot le plus long
		System.out.println(b);
		setSt.remove(b);
		System.out.println(setSt);
		
		
	}

}
