package fr.pizzeria.services;

import fr.pizzeria.dao.PizzaMemDao;
import fr.pizzeria.model.Pizza;

public class ListerPizzasService extends MenuService {

	
	public ListerPizzasService(PizzaMemDao daoPizza) {
		super(daoPizza);
	}
	@Override
	public void executeUC() {
		System.out.println("LISTE DES DIFFERENTES PIZZAS");
		Pizza[] lesPizzas = getDaoPizza().findAllPizzas();
		for(int i = 0; i < lesPizzas.length; i++) {
			System.out.println(lesPizzas[i].getCode()+" -> "+ lesPizzas[i].getLibelle()+" ("+lesPizzas[i].getPrix()+"€)");
		}
	}

}
