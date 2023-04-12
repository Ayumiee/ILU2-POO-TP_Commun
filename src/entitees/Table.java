package entitees;

import formulaire.Formulaire;
import formulaire.FormulaireRestaurant;
import reserver.CalendrierAnnuel;
import reserver.Reservation;
import reserver.ReservationRestaurant;

public class Table extends EntiteReservable {
	private int nbPersonne;
	private int nbService;

	public Table(int nbPersonne, int nbService) {
		super(calendrier);
		this.nbPersonne = nbPersonne;
		this.nbService = nbService;
	}

	public boolean compatible(FormulaireRestaurant formulaire) {
		if((estLibre(formulaire))&&(nbPersonne>=formulaire.getNombrePersonnes())&&(nbService==formulaire.getNumService())) {
			return true;
		}else {
			return false;
		}
	}


	public Reservation reserver(FormulaireRestaurant formulaire) {
		if (compatible(formulaire)) {
			int jour = formulaire.getJour();
			int mois = formulaire.getMois();
			ReservationRestaurant reservationRestaurant = new ReservationRestaurant(jour,mois,nbService,numero);
			return reservationRestaurant;
		}else {
			return null;
		}	
	}


}


