package entitees;

import formulaire.Formulaire;
import reserver.CalendrierAnnuel;

public class Table extends EntiteReservable {
	private int numTable;
	private static CalendrierAnnuel calendrier;

	public Table(int numTable) {
		super(calendrier, "Table");
		//pourquoi ca me demande de mettre static?
		this.numTable = numTable;
	}

	@Override
	public void compatible(Formulaire formulaire) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Formulaire reserver() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}


