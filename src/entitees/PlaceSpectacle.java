package entitees;

import formulaire.Formulaire;
import formulaire.FormulaireHotel;
import formulaire.FormulaireRestaurant;
import formulaire.FormulaireSpectacle;
import reserver.Reservation;
import reserver.ReservationHotel;
import reserver.ReservationSpectacle;

public class PlaceSpectacle extends EntiteReservable {

	public PlaceSpectacle() {
		super(calendrier);
	}

	public boolean compatible(Formulaire formulaire) {
		FormulaireSpectacle formulaireSpectacle= (FormulaireSpectacle) formulaire;
		if((estLibre(formulaireSpectacle))&&(getNumero()==formulaireSpectacle.getNumChaise())){
			return true;
		}else {
			return false;
		}
	}


	public Reservation reserver(Formulaire formulaire) {
		if (compatible(formulaire)) {
			int jour = formulaire.getJour();
			int mois = formulaire.getMois();
			ReservationSpectacle reservationSpectacle = new ReservationSpectacle(jour,mois,getNumero());
			return reservationSpectacle;
		}else {
			return null;
		}	
	}
	
	
}
