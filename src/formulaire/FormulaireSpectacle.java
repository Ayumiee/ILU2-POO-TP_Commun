package formulaire;

public class FormulaireSpectacle extends Formulaire{
	private int numChaise;
	private int numEntite;

	public FormulaireSpectacle(int jour, int mois,int numChaise) {
		super(jour, mois);
		this.numChaise=numChaise;
	}
	
	public Integer getNumChaise() {
		return numChaise;
	}

	public Integer getIdentificationEntite() {
		return numEntite;
	}

	public void setIdentificationEntite(int numEntite) {
		this.numEntite=numEntite;
	}

	
}
