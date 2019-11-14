package fr.diginamic.banque.entites;

//classe fille
public class Credit extends Operation {

	//constructeur fille
	public Credit(String dateOperation, int montantOperation) {
		super(dateOperation, montantOperation);
	}

	public String getType() {
		return "Credit";
	}
	

}
