package fr.pizzeria.services;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaMemDao;

public class SupprimerPizzaService extends MenuService {


	public SupprimerPizzaService(PizzaMemDao daoPizza, Scanner scanner,  MenuService menu) {
		super(daoPizza, scanner, menu);
	}
	
	@Override
	public void executeUC() {
		// Déclarations et Initialisations des variables locales
		String code = "";

		System.out.println("SUPPRESSION D'UNE PIZZA");
		//Affichage de la liste des pizzas
		getMenu().executeUC();
		while(!getDaoPizza().pizzasExists(code)) {
			System.out.println("Veuillez choisir le code de la pizza à supprimer : ");
			code = getScanner().next();
			
			if(!getDaoPizza().pizzasExists(code)) {
				System.out.println("Le Code Pizza saisi n'existe pas");
			}
		}
		// Suppression via Dao
		getDaoPizza().deletePizza(code);

	}

}
