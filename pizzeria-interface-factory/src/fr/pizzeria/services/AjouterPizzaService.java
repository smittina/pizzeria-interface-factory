package fr.pizzeria.services;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaMemDao;
import fr.pizzeria.model.Pizza;

/**
 * Service permettant d'ajouter une pizza dans le Menu
 * @author Formation
 *
 */
public class AjouterPizzaService extends MenuService {
	
	
	/**
	 * Constructeur 
	 * @param daoPizza Dao Pizza
	 * @param scanner Scanner pour que l'utilisateur puisse donner ses choix
	 */
	public AjouterPizzaService(PizzaMemDao daoPizza, Scanner scanner) {
		super(daoPizza, scanner);
	}
	
	
	@Override
	public void executeUC() {
		// R�cup�ration des donn�es aupr�s de l'utilisateur
		String code;
		String nom;
		double prix;
		System.out.println("AJOUTER UNE NOUVELLE PIZZA");
		System.out.println("Veuillez saisir le code : ");
		code = getScanner().next();
		System.out.println("Veuillez saisir le nom (sans Espace)");
		nom = getScanner().next();
		System.out.println("Veuillez saisir son prix (�)");
		prix = getScanner().nextDouble();
		// Ajout via Dao
		Pizza p = new Pizza(code, nom, prix);
		getDaoPizza().saveNewPizza(p);

	}

}
