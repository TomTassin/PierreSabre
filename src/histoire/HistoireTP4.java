package histoire;

import personnages.Commercant;
import personnages.Ronins;
import personnages.Yakuzas;

public interface HistoireTP4 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", "th�", 20);
		Commercant chonin = new Commercant("Chonin", "th�", 40);
		Commercant kumi = new Commercant("Kumi", "th�", 10);
		Yakuzas yaku = new Yakuzas("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronins roro = new Ronins("Roro", "shochu", 60);
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
	}
}
