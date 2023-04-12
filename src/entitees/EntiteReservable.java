package entitees;

import formulaire.Formulaire;
import formulaire.FormulaireHotel;
import reserver.CalendrierAnnuel;
import reserver.Reservation;

public abstract class EntiteReservable <F extends Formulaire>{
	protected static CalendrierAnnuel calendrier;
	protected int numero;
	
	public EntiteReservable(CalendrierAnnuel calendrier) {
		this.calendrier = calendrier;
		}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
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


}
