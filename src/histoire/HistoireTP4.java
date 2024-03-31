package histoire;

import personnages.Commercant;

public interface HistoireTP4 {
	
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco","thé",54);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
	}
}
