package histoire;

import personnages.Commercant;
import personnages.Ronins;
import personnages.Yakuzas;

public interface HistoireTP4 {
	
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco","thé",15);
		Ronins roro = new Ronins("Roro","shochu",60);
		roro.direBonjour();
		roro.donner(marco);
	}
}
