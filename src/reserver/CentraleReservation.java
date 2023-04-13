package reserver;

import entitees.Chambre;
import entitees.EntiteReservable;
import entitees.PlaceSpectacle;

import formulaire.Formulaire;
import formulaire.FormulaireRestaurant;

public class CentraleReservation {
	private int nbEntite;
	private EntiteReservable[] tableau;

	public CentraleReservation(EntiteReservable[] tableau) {
		this.nbEntite = 0;
		this.tableau = tableau;
	}

	public int ajouterEntite(EntiteReservable entite) {
		tableau[nbEntite] = entite;
		nbEntite++;
		entite.setNumero(nbEntite);
		return entite.getNumero();

	}

	public int[] donnerPossibilites(Formulaire formulaire) {
		FormulaireRestaurant formulaireRestaurant=(FormulaireRestaurant) formulaire;
		int[] dispo = new int[nbEntite];
		for (int i = 0; i < nbEntite; i++) {
			if (tableau[i].compatible(formulaireRestaurant)) {
				dispo[i] = tableau[i].getNumero();
			} else {
				dispo[i] = 0;
			}
		}
		return dispo;
	}
	
	public Reservation reserver(int numero,Formulaire formulaire) {
		for(int i=0;i<30;i++) {
			if (tableau[i]!=null) {
				if(tableau[i].getNumero()==numero) {
					formulaire.setNumEntite(tableau[i].getNumero());
					Reservation reservation=tableau[i].reserver(formulaire);
					return reservation;
				}
			}
		}
		return null;
		
	}

}
