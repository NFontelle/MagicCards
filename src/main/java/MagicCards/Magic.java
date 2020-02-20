package MagicCards;

import java.util.ArrayList;
import java.util.List;

public class Magic {

	public static void main(String[] args) {

		Creature poulet = new Creature(10, "Poulet", Couleur.ROUGE, 5);
		System.out.println(poulet);
		
		Creature cre1 = new Creature(10, "rat", Couleur.BLEU, 5);
		System.out.println(cre1);
		
		Creature cre2 = new Creature(10, "chat", Couleur.VERT, 5);
		System.out.println(cre2);
		
		
		Creature cre3 = new Creature(10, "Poulet", Couleur.ROUGE, 5);
		System.out.println(cre3);
		
		Creature poule = new Creature(10, "Poule", Couleur.VERT, 6, 4);
		System.out.println(poule);

		Cartes poulailler = new Terrain(5, "poulailler", Couleur.BLEU, 50);
		/* "Couleur.VERT" façon d'appeler la ligne "vert" dans la classe d'enumeration
		 "couleur"*/
		System.out.println(poulailler);

		Cartes composte = new Terrain(15, "composte", Couleur.NOIR, 100);
		/* "Couleur.VERT" façon d'appeler la ligne "vert" dans la classe d'enumeration
		 "couleur"*/
		System.out.println(composte);

		Sort sort1 = new Sort(20, "collerette de feu",Couleur.VERT, "boule de feu");
		System.out.println(sort1);

		Sort sort2 = new Sort(15, "Ergo brulant",Couleur.BLANC, "brulure", sort1);
		System.out.println(sort2);

		Sort sort3 = new Sort(5, "Bec Ultime",Couleur.BLEU, "explosion", sort2);
		System.out.println(sort3);

		// Création d'une liste de carte
		List<Cartes> listeDeCarte = new ArrayList<Cartes>();
		// listeDeCarte.add(sort1);
		listeDeCarte.add(poulet);
		//listeDeCarte.add(cre1);
		listeDeCarte.add(cre2);
		listeDeCarte.add(cre3);
		listeDeCarte.add(poule);
		listeDeCarte.add(poulailler);
		listeDeCarte.add(sort1);
		listeDeCarte.add(composte);
		listeDeCarte.add(sort2);
		listeDeCarte.add(sort3);

		// comme exception "try"/"Catch"
		try {
			// energie par defaut
			int energie = 100;
			// utilisation de "for" pour jouer chaque cartes
			for (Cartes carte : listeDeCarte) {

				/* les différentes methodes "jouer" peuvent être appelé indépendament en
				fonction des paramètres rentré ici :
				*/
				energie = carte.jouer(energie, poule);
				System.out.println("Energie restante = " + energie + "\n" + "------"  + "\n");
			}
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		}

	}

}
