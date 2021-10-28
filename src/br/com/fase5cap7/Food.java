package br.com.fase5cap7;

import java.util.Date;

public class Food {
	
	public Food(String mealName, int idMeal) {
		
		this.mealName = mealName;
		this.idMeal = idMeal;
	}

	//Propriedades
	private String mealName;
	private int idMeal;

	//---------------Métodos------------------
	public void registerMeal(String mealName, int idMeal) {

		this.mealName = mealName;
		this.idMeal = idMeal;

	}
	
public String getMealName() {
		
		return this.mealName;
	}
	
	public int getIdMeal() {
		
		return this.idMeal;
	}
	
}
