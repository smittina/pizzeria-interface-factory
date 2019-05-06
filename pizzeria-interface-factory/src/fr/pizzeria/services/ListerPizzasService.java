package fr.pizzeria.services;

import fr.pizzeria.dao.PizzaMemDao;
import fr.pizzeria.model.Pizza;

/**
 * Service permettant de Lister l'intégralité des Pizzas
 * @author Formation
 *
 */
public class ListerPizzasService extends MenuService {

	/**
	 * Constructeur
	 * @param daoPizza Dao Pizza
	 */
	public ListerPizzasService(PizzaMemDao daoPizza) {
		super(daoPizza);
	}
	
	/**
	 * Permet d'afficher la liste de l'ensemble des pizzas
	 */
	@Override
	public void executeUC() {
		System.out.println("LISTE DES DIFFERENTES PIZZAS");
		Pizza[] lesPizzas = getDaoPizza().findAllPizzas();
		for(int i = 0; i < lesPizzas.length; i++) {
			System.out.println(lesPizzas[i].getCode()+" -> "+ lesPizzas[i].getLibelle()+" ("+lesPizzas[i].getPrix()+"€)");
		}
	}

}
