package fr.pizzeria.dao;

import fr.pizzeria.model.Pizza;

/**
 * Interface pour DAO Pizza
 * @author Formation
 *
 */
public interface IPizzaDao {
	/**
	 * Permet de trouver toutes les pizzas
	 * @return le tableau de pizzas
	 */
	public abstract Pizza[] findAllPizzas();
	/**
	 * Permet de sauvegarder une nouvelle pizza
	 * @param pizza la nouvelle pizza � sauvegarder
	 */
	public abstract void saveNewPizza(Pizza pizza);
	/**
	 * Permet de mettre � jour une pizza
	 * @param codePizza le code de la pizza � modifier
	 * @param pizza la nouvelle pizza
	 */
	public abstract void updatePizza(String codePizza, Pizza pizza);
	/**
	 * Permet de supprimer une pizza en fonction de son code 
	 * @param codePizza le code de la pizza � supprimer
	 */
	public abstract void deletePizza(String codePizza);
	/**
	 * Permet de trouver une pizza en fonction de son code
	 * @param codePizza le code de la pizza
	 * @return la Pizza recherch�e
	 */
	public abstract Pizza findPizzaByCode(String codePizza);
	/**
	 * Permet de savoir si une pizza existe ou non dans le tableau de pizza
	 * @param codePizza le code de la pizza
	 * @return true si elle existe, false sinon
	 */
	public abstract boolean pizzasExists(String codePizza);
	
}
