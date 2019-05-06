package fr.pizzeria.services;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaMemDao;
import fr.pizzeria.model.Pizza;

public class ModifierPizzaService extends MenuService {

	
	public ModifierPizzaService(PizzaMemDao daoPizza, Scanner scanner, MenuService menu) {
		super(daoPizza, scanner, menu );
	}
	
	@Override
	public void executeUC() {
		String code = "";
		String newCode;
		String newLibelle;
		double newPrix;
		
		// Saisies utilisateurs
		System.out.println("MISE A JOUR D'UNE PIZZA");
		getMenu().executeUC();
		while(!getDaoPizza().pizzasExists(code)) {
			System.out.println("Veuillez choisir le code de la pizza à modifier : ");
			code = getScanner().next();
			if(!getDaoPizza().pizzasExists(code)) {
				System.out.println("Le Code Pizza saisi n'existe pas");
			}
		}
		System.out.println("Veuillez saisir le nouveau code :");
		newCode = getScanner().next();
		System.out.println("Veuillez saisir le nouveau Nom (sans espaces)");
		newLibelle = getScanner().next();
		System.out.println("Veuillez saisir le nouveau prix");
		newPrix = getScanner().nextDouble();
		
		// Modification via Dao
		Pizza p = new Pizza(newCode, newLibelle, newPrix);
		getDaoPizza().updatePizza(code, p);

	}

}
