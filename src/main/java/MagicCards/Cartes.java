package MagicCards;

import java.util.ArrayList;
import java.util.List;

public abstract class Cartes {

	int cout;
	String nomCarte;
	Couleur couleur;
	static List<Cartes> listCartesJouees;

	
	// constructeur obligatoire
	public Cartes(int cout, String nomCarte,Couleur couleur) {
		super();
		this.couleur = couleur;
		this.cout = cout;
		this.nomCarte = nomCarte;
	}

	/*
	 * creation d'un autre constructeur mais comme signature différentes Java saura
	 * ou chercher l'info
	 */
	public Cartes(String nomCarte) {
		// ici "this" appel à un autre constructeur
		this(0, nomCarte, null);
	}

	@Override
	public String toString() {
		return nomCarte + "\n" + "Cout = " + cout + "\n" + "Couleur : " + couleur;
	}

	// toujours spécifier le type retrour de la merthode par "type" "methode()"
	public int jouer(int energie) throws UnsupportedOperationException {

		if (energie >= cout) {
			if (listCartesJouees == null) {
				/* List<Cartes> pas necessaire ici, déja déclaré */ listCartesJouees = new ArrayList<Cartes>();
			}

			if (listCartesJouees.contains(this))
			/*
			 * /!\ risque de necessiter la redefinition de "equals" et "hashCode pour eviter
			 * les erreurs
			 */
			{
				throw new UnsupportedOperationException("Carte déjà jouée");
			}

			else {

				System.out.println("la carte jouée est " + nomCarte);

				listCartesJouees.add(this);
				/*
				 * "this" c'est l'instance de la methode dans laquel on est ici ici on veut
				 * ajouter une "Carte" donc "this" utilisé
				 */

				return energie - cout;
			}
		}
		throw new UnsupportedOperationException("Pas assez d'énergie");

	}

	public int jouer(int energie, Cartes carteCible) {

		/*
		 * appel de l'autre methode "jouer", comme appelé 1 fois directement dans le
		 * return
		 */
		return jouer(energie);
	}

	public int jouer(int energie, String insulte) {

		// indispensable pour que l'insulte apparaisse dans system.out
		System.out.println(insulte);

		/*
		 * appel de l'autre methode "jouer", comme appelé 1 fois directement dans le
		 * return
		 */
		return jouer(energie);
	}

}
