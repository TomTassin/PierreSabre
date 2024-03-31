package histoire;

import personnages.Commercant;
import personnages.Yakuzas;

public interface HistoireTP4 {
	
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco","thé",15);
		Yakuzas yakuLeNoir = new Yakuzas("Yaku Le Noir", "whisky", 30, "Warsong");
		yakuLeNoir.direBonjour();
		yakuLeNoir.extorquer(marco);
	}
}
