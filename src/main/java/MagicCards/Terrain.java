package MagicCards;

public class Terrain extends Cartes {
	int valeur;
	
	
	
	public Terrain(int cout, String nomCarte, Couleur couleur, int valeur) {
		super(cout, nomCarte, couleur);
		this.valeur = valeur;
	}

	/*
	 * @Override// surhcarge de la methode jeu pour Terrain afin de la spécialiser
	 * public int jouer(int energie) throws UnsupportedOperationException {
	 * 
	 * if (energie >= cout)
	 * 
	 * return energie - cout + valeur;
	 * 
	 * throw new UnsupportedOperationException("Pas assez d'énergie");
	 * 
	 * }
	 */

	@Override
	public String toString() {
		return "Terrain : " + super.toString() + "\n" + "Valeur = " + valeur + "\n" + "-------------";
	}

	@Override // optenu par "clikD" "source" "overide"
	public int jouer(int energie) throws UnsupportedOperationException {

		return super.jouer(energie) + valeur;
		/*
		 * comme "super" si la methode de la classe mere est modifié, cette méthode est
		 * automatiquement modifiée
		 */
	}

}
