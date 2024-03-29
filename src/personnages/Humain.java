package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int quantiteArgent;
	
	public Humain(String nom, String boissonFavorite, int quantiteArgent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.quantiteArgent = quantiteArgent;
		assert quantiteArgent>0;
	}
	
	public void parler(String texte) {
		System.out.println("<< " + texte + ">>");
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
		
	}
	
	public void perdreArgent(int perte) {
		
	}
	
	
}
