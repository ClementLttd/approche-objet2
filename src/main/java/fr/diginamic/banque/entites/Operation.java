package fr.diginamic.banque.entites;

//classe mere
public abstract class Operation {

	//variables d'instance
	private String dateOperation;
	private int montantOperation;

	//methodes abstraites
	public abstract String getType();
	

	//Constructeur
	public Operation(String dateOperation, int montantOperation) {
		this.dateOperation = dateOperation;
		this.montantOperation = montantOperation;
	}

	//methode string toString mere
	public String toString() {
		return getType() + " " + dateOperation + " " + montantOperation;
	}

	//getters setters
	public String getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}

	public int getMontantOperation() {
		return montantOperation;
	}

	public void setMontantOperation(int montantOperation) {
		this.montantOperation = montantOperation;
	}
}
