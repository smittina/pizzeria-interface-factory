package fr.pizzeria.dao;

import fr.pizzeria.model.Pizza;

/**
 * Classe représentant le Dao des Pizzas
 * @author Formation
 *
 */
public class PizzaMemDao implements IPizzaDao {
	
	/**
	 * Le tableau des différentes pizzas
	 */
	private Pizza[] lesPizzas;	
	

	/**
	 * Constructeur par défaut qui initialise le tableau de pizzas
	 */
	public PizzaMemDao() {
		// Initialisations du tableau de pizzas
		lesPizzas = new Pizza[8];
		lesPizzas[0] = new Pizza(0,"PEP", "Pépéroni",12.50);
		lesPizzas[1] = new Pizza(1,"MAR", "Margherita",14.00);
		lesPizzas[2] = new Pizza(2,"REIN", "La Reine",11.50);
		lesPizzas[3] = new Pizza(3,"FRO", "La 4 Fromages",12.00);
		lesPizzas[4] = new Pizza(4,"CAN", "La cannibale",12.50);
		lesPizzas[5] = new Pizza(5,"SAV", "La Savoyarde",13.00);
		lesPizzas[6] = new Pizza(6,"ORI", "L'Orientale",13.50);
		lesPizzas[7] = new Pizza(7,"IND", "L'indienne",14.00);
	}

	/**
	 * Permet d'obtenir l'ensemble des pizzas
	 */
	@Override
	public Pizza[] findAllPizzas() {
		return lesPizzas;
	}

	/**
	 * Permet d'enregistrer une nouvelle Pizza
	 * @param pizza la nouvelle pizza
	 */
	@Override
	public void saveNewPizza(Pizza pizza) {
		Pizza[] pizzasTemp = new Pizza[lesPizzas.length+1];
		for(int i = 0; i<lesPizzas.length;i++) {
			pizzasTemp[i] = lesPizzas[i];
		}
		pizzasTemp[lesPizzas.length] = pizza;
		lesPizzas = pizzasTemp;

	}

	/**
	 * Permet de mettre à jour une pizza
	 */
	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		if(pizzasExists(codePizza)) {
			int index = rechercherIndexPizza(codePizza);
			lesPizzas[index] = pizza;
		}

	}

	/**
	 * Permet de supprimer une pizza
	 */
	@Override
	public void deletePizza(String codePizza) {
		if(pizzasExists(codePizza)) {
			int index = rechercherIndexPizza(codePizza);
			Pizza[] pizzasTemp = new Pizza[lesPizzas.length-1];
			for(int i =0; i<index;i++) {
				pizzasTemp[i] = lesPizzas[i];
			}
			for(int i=index+1; i<lesPizzas.length;i++) {
				pizzasTemp[i-1] = lesPizzas[i];
			}
			lesPizzas = pizzasTemp;
		}
		

	}

	/**
	 * Permet de trouver une pizza en fonction de son code
	 */
	@Override
	public Pizza findPizzaByCode(String codePizza) {
		int index = -1;
		for(int i=0; i<lesPizzas.length;i++) {
			if(lesPizzas[i].getCode().compareTo(codePizza) == 0) {
				index = i;
			}
		}
		return lesPizzas[index];
	}

	/**
	 * Permet de vérifier qu'une pizza existe en fonction de son code
	 */
	@Override
	public boolean pizzasExists(String codePizza) {
		for(int i = 0; i<lesPizzas.length; i++) {
			if(lesPizzas[i].getCode().compareTo(codePizza)==0) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Permet de trouver l'index d'une pizza en fonction de son code
	 * @param codePizza le code de la pizza
	 * @return l'index de la pizza dans le tableau
	 */
	public int rechercherIndexPizza(String codePizza) {
		int index = -1;
		for(int i=0; i<lesPizzas.length;i++) {
			if(lesPizzas[i].getCode().compareTo(codePizza)==0) {
				index = i;
				break;
			}
		}
		return index;
	}

	/**
	 * Permet d'obtenir le tableau de pizzas
	 * @return le tableau de pizza
	 */
	public Pizza[] getLesPizzas() {
		return lesPizzas;
	}

	/**
	 * Permet de modifier le tableau de pizza
	 * @param lesPizzas le nouveau tableau de pizzas
	 */
	public void setLesPizzas(Pizza[] lesPizzas) {
		this.lesPizzas = lesPizzas;
	}
	
	
}
