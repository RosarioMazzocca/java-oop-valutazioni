package it.corso.valutazioni;

public class CalcolaValutazione {
	
	int idStudente;
	int percentualeAssenze;
	double mediaVoti;
	
	CalcolaValutazione(int idStudente, int percentualeAssenze, double mediaVoti) {
		this.idStudente = idStudente;
		this.percentualeAssenze = percentualeAssenze;
		this.mediaVoti = mediaVoti;
	}
	
	Boolean promossoBocciato() {
		boolean promossoBocciato;
		if (percentualeAssenze > 50) {
			promossoBocciato = false;
		} else if (percentualeAssenze >= 25 && percentualeAssenze <= 50 && mediaVoti > 2) {
			promossoBocciato = true;	
		} else if (percentualeAssenze <= 25 && mediaVoti >= 2) {
			promossoBocciato = true;
		} else {
			promossoBocciato = false;
		}
	return promossoBocciato;
	}

}
