package entitees;

import formulaire.Formulaire;
import formulaire.FormulaireRestaurant;
import reserver.CalendrierAnnuel;
import reserver.CentraleReservation;
import reserver.Reservation;
import reserver.ReservationRestaurant;

public class Restaurant {
	private CentraleReservation centrale;
	
	public Restaurant() {
		Table[] table=new Table[30];
		this.centrale = new CentraleReservation(table);
	}

	public void ajouterTable(int nbPersonne) {
		Table table = new Table(nbPersonne);
		centrale.ajouterEntite(table);
	}
	
	public int[] donnerPossibilites(Formulaire formulaire) {
		return centrale.donnerPossibilites(formulaire);
	}
	
	public Reservation reserver(int numero,Formulaire formulaire) {
		return centrale.reserver(numero, formulaire);
	}

	public class Table extends EntiteReservable {
		private int nbPersonne;
		private CalendrierAnnuel calendrierDeuxiemeService;

		public Table(int nbPersonne) {
			super(calendrier);
			this.calendrierDeuxiemeService=new CalendrierAnnuel();
			this.nbPersonne = nbPersonne;
		}

		public boolean estLibre(Formulaire formulaire) {
			int jour = formulaire.getJour();
			int mois = formulaire.getMois();
			if (((FormulaireRestaurant) formulaire).getNbService() == 1) {
				if (calendrier.estLibre(jour, mois)) {
					return true;
				} else {
					return false;
				}
			} else {
				if (calendrierDeuxiemeService.estLibre(jour, mois)) {
					return true;
				} else {
					return false;
				}
			}
		}

		public boolean compatible(Formulaire formulaire) {
			FormulaireRestaurant formulaireRestaurant = (FormulaireRestaurant) formulaire;
			if ((estLibre(formulaireRestaurant)) && ((nbPersonne == formulaireRestaurant.getNombrePersonnes())
					|| ((nbPersonne - 1) == formulaireRestaurant.getNombrePersonnes()))) {
				return true;

			} else {
				return false;
			}
		}

		public Reservation reserver(Formulaire formulaire) {
			FormulaireRestaurant formulaireRestaurant = (FormulaireRestaurant) formulaire;
			if (compatible(formulaireRestaurant)) {
				int jour = formulaireRestaurant.getJour();
				int mois = formulaireRestaurant.getMois();
				ReservationRestaurant reservationRestaurant = new ReservationRestaurant(jour, mois,formulaireRestaurant.getNumService(), this.getNumero());
				return reservationRestaurant;
			} else {
				return null;
			}
		}

	}
}
