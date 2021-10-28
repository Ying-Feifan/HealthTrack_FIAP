package br.com.fase5cap7;

import java.util.Date;

public class Meal {
	
	public Meal(int quantityMeal, double quantityCalories, Date dateConsumed) {
	
	this.quantityMeal = quantityMeal;
	this.quantityCalories = quantityCalories;
	this.dateConsumed = dateConsumed;
	
	}
	//Propriedades
	private int quantityMeal;
	private double quantityCalories;
	private Date dateConsumed;
	
	
	//-----Métodos-----
	public int getQuantityMeal() {
		return quantityMeal;
	}
	
	public void setQuantityMeal(int quantityMeal) {
		this.quantityMeal = quantityMeal;
	}
	
	public double getQuantityCalories() {
		return quantityCalories;
	}
	
	public void setQuantityCalories(double quantityCalories) {
		this.quantityCalories = quantityCalories;
	}
	
	public Date getDateConsumed() {
		return dateConsumed;
	}
	
	public void setDateConsumed(Date dateConsumed) {
		this.dateConsumed = dateConsumed;
	}
	
	
}
