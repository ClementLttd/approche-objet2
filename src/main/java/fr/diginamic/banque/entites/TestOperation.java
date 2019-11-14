package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {

		Operation[] operation = new Operation[4];
		operation[0] = new Debit("12/05/2014", 55);
		operation[1] = new Credit("13/08/2018", 150);
		operation[2] = new Debit("21/07/2019", 420);
		operation[3] = new Credit("30/12/2018", 10);
		
		//creation d'un solde global
		double soldeGlobal = 0.0;

		// Boucle sur le tableau operation
		for (int i = 0; i < operation.length; i++) {
			System.out.println(operation[i]);

			if (operation[i].getType().equals("Credit")) {
				soldeGlobal += operation[i].getMontantOperation();
			} else {
				soldeGlobal -= operation[i].getMontantOperation();
			}
		}
		System.out.println("Solde Global = " + soldeGlobal);
	}
}
