package MagicCards;

public class Creature extends Cartes {

	int attaque;
	int defense;

	public Creature(int cout, String nomCarte, Couleur couleur, int attaque, int defense) {
		super(cout, nomCarte, couleur);
		this.attaque = attaque;
		this.defense = defense;
	}

	public Creature(int cout, String nomCarte, Couleur couleur, int force) {

		// constructeur ou attaque = defense; attribuer "force" à "attaque" ET "defense"
		this(cout, nomCarte, couleur, force, force);

	}

	@Override
	public String toString() {
		return "Créature : " + super.toString() + "\n" + "Points d'attaque = " + attaque + "\n" + "Points de défense = "
				+ defense + "\n" + "-------------";
	}

	@Override
	public int jouer(int energie, Cartes carteCible) {

		if (carteCible instanceof Creature) {
			
			System.out.println(nomCarte + " attaque " + carteCible.nomCarte);

			// Couleur.comparerForce(Couleur opposant)
			switch (couleur) {
			case BLEU:
				if (carteCible.couleur == Couleur.ROUGE) {
					System.out.println("Pus fort");
				}
				if (carteCible.couleur == Couleur.VERT) {
					System.out.println("Moins fort");
				}
				break;

			case VERT:
				if (carteCible.couleur == Couleur.BLEU) {
					System.out.println("Pus fort");
				}
				if (carteCible.couleur == Couleur.ROUGE) {
					System.out.println("Moins fort");
				}
				break;

			default:
				System.out.println("Combat stop");
				break;

			}
			

		}

		else {

			throw new UnsupportedOperationException("La carte n'est pas une créature");
		}

		return super.jouer(energie, carteCible);
	}

}
