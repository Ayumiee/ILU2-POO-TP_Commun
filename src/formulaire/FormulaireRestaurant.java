package formulaire;

public class FormulaireRestaurant extends Formulaire {
	private int nbPersonne;
	private int nbService;
	private int numEntite;
	
	public FormulaireRestaurant(int jour, int mois, int nbPersonne, int nbService) {
		super(jour, mois);
		this.nbPersonne=nbPersonne;
		this.nbService=nbService;
	}

	public Integer getNombrePersonnes() {
		return nbPersonne;
	}

	public Integer getNumService() {
		return nbService;
	}

	public Integer getIdentificationEntite() {
		return numEntite;
	}

	public void setIdentificationEntite(int numEntite) {
		this.numEntite=numEntite;
	}

	
	
	
}
