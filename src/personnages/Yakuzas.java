package personnages;

public class Yakuzas extends Humain{
	private String clan;
	private int reputation=0;
	
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
}
