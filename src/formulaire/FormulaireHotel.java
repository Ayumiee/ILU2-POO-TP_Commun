package formulaire;

public class FormulaireHotel extends Formulaire{
	private int nbLitSimple;
	private int nbLitDouble;
	private int numEntite;
	
	public FormulaireHotel(int jour, int mois,int nbLitSimple,int nbLitDouble) {
		super(jour, mois);
		this.nbLitDouble=nbLitDouble;
		this.nbLitSimple=nbLitSimple;
	}


	public int getNbLitSimple() {
		return nbLitSimple;
	}

	public int getNbLitDouble() {
		return nbLitDouble;
	}

	public Integer getIdentificationEntite() {
		return numEntite;
	}

	public void setIdentificationEntite(int numEntite) {
		this.numEntite=numEntite;
	}
	
}
