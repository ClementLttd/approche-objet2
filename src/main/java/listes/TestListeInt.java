package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {

		List<Integer> listInt = new ArrayList<>();
		
		listInt.add(-1);
		listInt.add(5);
		listInt.add(7);
		listInt.add(3);
		listInt.add(-2);
		listInt.add(4);
		listInt.add(8);
		listInt.add(5);

		System.out.println(listInt);
		System.out.println(listInt.size());

		Integer obj = Collections.max(listInt);
		System.out.println(Collections.max(listInt));

		listInt.remove(Collections.min(listInt));
		System.out.println(listInt);

		for (int i = 0; i < listInt.size(); i++) {
			if (listInt.get(i) < 0) {
				
				System.out.println(listInt.get(i));
				listInt.set(i, -1*listInt.get(i));
				System.out.println(listInt.get(i));
			}
		
		}
		System.out.println(listInt);
	}

}
