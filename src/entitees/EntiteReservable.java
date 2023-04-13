package entitees;

import formulaire.Formulaire;
import formulaire.FormulaireHotel;
import formulaire.FormulaireRestaurant;
import reserver.CalendrierAnnuel;
import reserver.Reservation;

public abstract class EntiteReservable{
	protected static CalendrierAnnuel calendrier;
	protected int numero=0;
	
	public EntiteReservable(CalendrierAnnuel calendrier) {
		this.calendrier = new CalendrierAnnuel();
		}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public boolean estLibre(Formulaire formulaire) {
		int jour=formulaire.getJour();
		int mois=formulaire.getMois();
		if (calendrier.estLibre(jour, mois)) {
			return true;
		} else {
			return false;
		}
	}
	
	

	public abstract Reservation reserver(Formulaire formulaire);

	public abstract boolean compatible(Formulaire formulaire);


}
