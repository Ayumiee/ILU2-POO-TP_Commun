package reserver;

public class ReservationRestaurant extends Reservation{
	private int numS;
	private int numTable;
	
	public ReservationRestaurant(int jour, int mois, int numS, int numTable) {
		super(jour, mois);
		this.numS = numS;
		this.numTable = numTable;
	}
	
	public String toString() {
		if (numS==1) {
			return "Le "+jour+"/"+mois+"\nTable "+numTable+" pour le premier service.";
		}
		return "Le "+jour+"/"+mois+" Table "+numTable+" pour le deuxieme service.";
	}
	
}
