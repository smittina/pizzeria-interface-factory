package fr.pizzeria.services;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaMemDao;

/**
 * Classe abstraite représentant un service de Menu
 * @author Formation
 *
 */
public abstract class MenuService {
	private PizzaMemDao daoPizza;
	private Scanner scanner;
	private MenuService menu;
	
	public MenuService(PizzaMemDao daoPizza) {
		this.daoPizza = daoPizza;
		scanner = null;
		menu = null;
	}
	public MenuService(PizzaMemDao daoPizza, Scanner scanner) {
		this.daoPizza = daoPizza;
		this.scanner = scanner;
		menu = null;
	}
	
	public MenuService(PizzaMemDao daoPizza, Scanner scanner, MenuService menu) {
		this.daoPizza = daoPizza;
		this.scanner = scanner;
		this.menu = menu;
	}
	/**
	 * Permet d'exécuter des actions en fonction du MenuService
	 */
	public abstract void executeUC();

	public PizzaMemDao getDaoPizza() {
		return daoPizza;
	}

	public void setDaoPizza(PizzaMemDao daoPizza) {
		this.daoPizza = daoPizza;
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public MenuService getMenu() {
		return menu;
	}

	public void setMenu(MenuService menu) {
		this.menu = menu;
	}
	
	
}
