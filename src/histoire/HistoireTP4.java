package histoire;

import personnages.Ronins;
import personnages.Yakuzas;

public interface HistoireTP4 {
	
	public static void main(String[] args) {
		Yakuzas yakuLeNoir = new Yakuzas("Yaku Le Noir","thé",45,"Warsong");
		Ronins roro = new Ronins("Roro","shochu",54);
		roro.provoquer(yakuLeNoir);
	}
}
