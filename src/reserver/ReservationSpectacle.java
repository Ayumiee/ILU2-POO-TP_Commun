package reserver;

public class ReservationSpectacle extends Reservation {
	private int numChaise;
	
	public ReservationSpectacle(int jour, int mois, int numChaise) {
		super(jour, mois);
		this.numChaise = numChaise;
	}
	public String toString() {
		return "Le"+jour+"/"+mois+": à la chaise n°"+numChaise;
	}
}
