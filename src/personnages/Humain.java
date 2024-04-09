package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int quantiteArgent;
	protected int nbConnaissance = 0;
	private static final int NBCONNAISSANCE_MAX = 30;
	private Humain[] memoire = new Humain[NBCONNAISSANCE_MAX];

	public Humain(String nom, String boissonFavorite, int quantiteArgent) {
		assert quantiteArgent >= 0;
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.quantiteArgent = quantiteArgent;
	}

	protected void parler(String texte) {
		System.out.println("(" + nom + ")- " + texte);
	}

	public String getNom() {
		return nom;
	}

	public int getQuantiteArgent() {
		return quantiteArgent;
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite);
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		assert prix >= 0;
		if (quantiteArgent >= prix) {
			parler("J'ai " + quantiteArgent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix
					+ " sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + quantiteArgent + " sous en poche. Je ne peux même pas m'offrir " + bien
					+ " à " + prix + " sous");
		}

	}

	protected void perdreArgent(int perte) {
		quantiteArgent -= perte;
	}

	protected void gagnerArgent(int gain) {
		quantiteArgent += gain;
	}

	public void faireConnaissanceAvec(Humain humain) {
		direBonjour();
		humain.repondre(this);
		memoriser(humain);
	}

	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}

	private void memoriser(Humain humain) {
		if (nbConnaissance == NBCONNAISSANCE_MAX) {
			memoire[0] = null;
			for (int i = 0; i < nbConnaissance - 1; i++) {
				memoire[i] = memoire[i + 1];
			}
			memoire[nbConnaissance - 1] = humain;
		} else {
			memoire[nbConnaissance] = humain;
			nbConnaissance += 1;
		}
	}

	public void listerConnaissance() {
		StringBuilder bld = new StringBuilder();
		for (int i = 0; i < nbConnaissance; i++) {
			if (i != nbConnaissance - 1) {
				bld.append(memoire[i].getNom() + ", ");
			} else {
				bld.append(memoire[i].getNom());
			}
		}
		String connaissance = bld.toString();
		parler("Je connais beaucoup de monde dont: " + connaissance);
	}

}
