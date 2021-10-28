package br.com.fase5cap7;

import java.util.Date;

public class Meals {

	public Meals(String mealName, int consumedQuantity, double consumedCalories) {
		this.mealName = mealName;
		this.consumedQuantity = consumedQuantity;
		this.consumedCalories = consumedCalories;
	}

	private String mealName;
	private int consumedQuantity;
	private Date consumedDate = new Date();
	private double consumedCalories;

	/**
	 * Registrar alimento consumido
	 * @param mealName = nome do alimento
	 * @param consumedQuantity = quantidade consumida em gramas
	 * @param consumedCalories = calorias consumidas em gramas
	 */
	public void registerMeal(String mealName, int consumedQuantity, double consumedCalories) {
		this.mealName = mealName;
		this.consumedQuantity = consumedQuantity;
		this.consumedCalories = consumedCalories;
	}

	/**
	 * Retorna o nome do alimento registrado
	 * @return Nome do alimento
	 */
	public String getMealName() {
		return this.mealName;
	}

	/**
	 * Retorna a quantidade consumida do alimento registrado
	 * @return Quantidade consumida do alimento
	 */
	public int getConsumedQuantity() {
		return this.consumedQuantity;
	}

	/**
	 * Retorna a quantidade consumida de calorias registrado
	 * @return Quantidade consumida de calorias
	 */
	public double getConsumedCalories() {
		return this.consumedCalories;
	}

	/**
	 * Retorna a data em que foi consumido o alimento registrado
	 * @return Data em que foi consumido o alimento 
	 */
	public Date getConsumedDate() {
		return this.consumedDate;
	}
}
