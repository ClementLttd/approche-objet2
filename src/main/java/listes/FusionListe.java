package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

	public static void main(String[] args) {
		
		List<String> liste1 = new ArrayList<String>();
		liste1.add("rouge");
		liste1.add("vert");
		liste1.add("orange");
		
		List<String> liste2 = new ArrayList <String>();
		liste2.add("blanc");
		liste2.add("bleu");
		liste2.add("orange");

		
		List<String> liste3 = new ArrayList<String>();
		liste3.addAll(liste1);
		liste3.addAll(liste2);
		
		System.out.println(liste3);
		}

}
