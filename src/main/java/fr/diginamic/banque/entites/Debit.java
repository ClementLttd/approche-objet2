package fr.diginamic.banque.entites;

//classe fille
public class Debit extends Operation {

	//constructeur fille
	public Debit(String dateOperation, int montantOperation) {
		super(dateOperation, montantOperation);

	}

	
	public String getType() {
		return "Debit";
	}
	

}
