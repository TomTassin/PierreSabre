package personnages;

public class Yakuzas extends Humain{
	private String clan;
	private int reputation=0;
	
	public int getReputation() {
		return reputation;
	}

	public Yakuzas(String nom, String boissonFavorite, int quantiteArgent, String clan) {
		super(nom, boissonFavorite, quantiteArgent);
		this.clan=clan;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() +", si tu tiens à la vie donne moi ta bourse!");
		int argentVolé=victime.seFaireExtorquer();
		gagnerArgent(argentVolé);
		parler("J'ai piqué les "+ argentVolé +" sous de "+ victime.getNom() +", ce qui me fait "+ getQuantiteArgent() +" sous dans ma poche. Hi! Hi!");
	}
	
	public int perdre() {
		reputation-=1;
		int argentPerdu=getQuantiteArgent();
		perdreArgent(argentPerdu);
		parler("J'ai perdu mon duel et mes "+ argentPerdu +" sous, snif... J'ai déhonoré le clan de "+ clan);
		return argentPerdu;
	}
	
	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation+=1;
		parler("Ce ronin pensait vraiment battre "+ getNom() +" du clan de "+ clan +" ? Je l'ai dépouillé de ses "+ gain +" sous.");
	}
}
