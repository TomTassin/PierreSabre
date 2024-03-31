package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int quantiteArgent;
	
	public Humain(String nom, String boissonFavorite, int quantiteArgent) {
		assert quantiteArgent>=0;
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.quantiteArgent = quantiteArgent;
	}
	
	public void parler(String texte) {
		System.out.println("("+ nom +")- " + texte);
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
		assert prix>=0;
		if (quantiteArgent>=prix) {
			parler("J'ai "+ quantiteArgent +" sous en poche. Je vais pouvoir m'offrir "+ bien +" à "+ prix +" sous");
			perdreArgent(prix);
		}else {
			parler("Je n'ai plus que "+ quantiteArgent +" sous en poche. Je ne peux même pas m'offrir "+ bien +" à "+ prix +" sous");
		}
		
	}
	
	public void perdreArgent(int perte) {
		quantiteArgent-=perte;
	}
	
	public void gagnerArgent(int gain) {
		quantiteArgent-=gain;
	}
	
}
