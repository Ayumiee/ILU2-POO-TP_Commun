package entitees;

import formulaire.Formulaire;
import formulaire.FormulaireHotel;
import formulaire.FormulaireRestaurant;
import reserver.CalendrierAnnuel;
import reserver.Reservation;
import reserver.ReservationHotel;
import reserver.ReservationRestaurant;

public class Chambre extends EntiteReservable{
	private int nbLitSimple;
	private int nbLitDouble;
	
	public Chambre(int nbLitSimple, int nbLitDouble) {
		super(calendrier);
		this.nbLitSimple = nbLitSimple;
		this.nbLitDouble = nbLitDouble;
	}

	public boolean compatible(FormulaireHotel formulaire) {
		if((estLibre(formulaire))&&(nbLitDouble>=formulaire.getNbLitDouble())&&(nbLitSimple>=formulaire.getNbLitSimple())) {
			return true;
		}else {
			return false;
		}
	}


	public Reservation reserver(FormulaireHotel formulaire) {
		if (compatible(formulaire)) {
			int jour = formulaire.getJour();
			int mois = formulaire.getMois();
			ReservationHotel reservationHotel = new ReservationHotel(jour,mois,nbLitSimple,nbLitDouble,numero);
			return reservationHotel;
		}else {
			return null;
		}	
	}
	
	
}

