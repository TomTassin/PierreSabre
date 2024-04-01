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
	
	public void provoquer(Yakuzas adversaire) {
		int force=honneur*2;
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (force>=adversaire.getReputation()) {
			parler("Je t’ai eu petit yakusa!");
			int gain=adversaire.perdre();
			honneur+=1;
			gagnerArgent(gain);
		}else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			honneur-=1;
			adversaire.gagner(getQuantiteArgent());
			perdreArgent(getQuantiteArgent());
		}
	}
}
