package entitees;

import formulaire.Formulaire;
import formulaire.FormulaireHotel;
import reserver.CalendrierAnnuel;

public abstract class EntiteReservable <F extends Formulaire>{
	protected CalendrierAnnuel calendrier;
	protected String entite;
	
	public EntiteReservable(CalendrierAnnuel calendrier,String entite) {
		this.calendrier = calendrier;
		this.entite=entite;
		}
	
	public String getEntite() {
		return entite;
	}
	
	public void setEntite(String entite) {
		this.entite = entite;
	}
	
	public boolean estLibre(F formulaire) {
		int jour=formulaire.getJour();
		int mois=formulaire.getMois();
		if (calendrier.estLibre(jour, mois)) {
			return true;
		} else {
			return false;
		}
	}
//	A FAIRE DANS TABLE, HOTEL RESTO 
	public abstract void compatible(F formulaire);
//		if ()
//			//si c une table : creer formulaire table
//	}
//	
	public abstract F reserver();
//		if (compatible()) {
//			if ({
//				
//			}
//			
//			return reservation;
//		}else {
//			return null;
//		}
//	}
}
