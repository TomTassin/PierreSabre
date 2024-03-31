package personnages;

public class Ronins extends Humain{
	private int honneur=1;
	
	public Ronins(String nom, String boissonFavorite, int quantiteArgent) {
		super(nom, boissonFavorite, quantiteArgent);
	}
	public void donner(Commercant beneficiaire) {
		assert getQuantiteArgent()>10;
		int don=(int) (getQuantiteArgent()*(0.1));
		perdreArgent(don);
		parler(beneficiaire.getNom() +" prend ces "+ don +" sous.");
		beneficiaire.recevoir(don);
	}
}
