package reserver;

public class ReservationHotel extends Reservation{
	private int nbLitSimple;
	private int nbLitDouble;
	private int numChambre;
	
	
	public ReservationHotel(int jour, int mois, int nbLitSimple, int nbLitDouble, int numChambre) {
		super(jour, mois);
		this.nbLitSimple = nbLitSimple;
		this.nbLitDouble = nbLitDouble;
		this.numChambre = numChambre;
	}
	
	public String toString() {
		return "Le"+jour+"/"+mois+": chambre n�"+numChambre+" avec "+nbLitSimple+" lits simples et "+nbLitDouble+" lits doubles";
	}



}
