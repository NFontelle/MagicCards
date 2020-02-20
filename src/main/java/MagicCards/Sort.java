package MagicCards;

public class Sort extends Cartes {

	// Effet primaire
	private String effetPrim;

	// Effet imitation de carte; effet secondaire
	private Sort effetSecond;

	public Sort(int cout, String nomCarte, Couleur couleur, String effetPrim, Sort effetSecond) {
		super(cout, nomCarte, couleur);
		this.effetPrim = effetPrim;
		this.effetSecond = effetSecond;
	}

	// Permet de creer la première carte sans effet secondaire
	public Sort(int cout, String nomCarte, Couleur couleur, String effetPrim) {
		// "sort" = objet donc "Sort effetSecond" = null
		this(cout, nomCarte, couleur, effetPrim, null);

	}

//Creation cu'ne fonction recursive pour eviter les problèmes lié au toString()

	public String getEffet() {

		if (effetSecond != null) {

			return effetPrim + "\n" + "\t" + " " + effetSecond.getEffet();

		}

		return effetPrim;
	}

	@Override
	public String toString() {

		return "Sort : " + super.toString() + "\n" + "Effets : " + this.getEffet() + "\n" + "-------------";

	}

}
