package br.com.fase5cap7;

import java.util.Date;

public class Activity {

	public Activity(int idActivity, double lostCalories) {
		this.idActivity = idActivity;
		this.lostCalories = lostCalories;
	}

	public Activity(int idActivity) {
		this.idActivity = idActivity;
	}

	private int idActivity;
	private double lostCalories;
	private Date registerDate = new Date();

	/**
	 * Registra a atividade praticada pelo usuário
	 * @param idActivity = código interno da atividade
	 */
	public void setActivity(int idActivity) {
		this.idActivity = idActivity;
	}

	/**
	 * Registra a quantidade (em gramas) das calorias perdidas durante a atividade
	 * @param lostCalories = quantidade de calorias
	 */
	public void setLostCalories(double lostCalories) {
		this.lostCalories = lostCalories;
	}

	/**
	 * Retorna a atividade registrada pelo usuário
	 * @return Id da Atividade registrada pelo usuário
	 * @see setActivity
	 */
	public int getActivity() {
		return this.idActivity;
	}

	/**
	 * Retorna a quantidade (em gramas) das calorias perdidas durante a atividade
	 * @return lostCalories = quantidade de calorias
	 * @see setLostCalories
	 */
	public double getLostCalories() {
		return this.lostCalories;
	}
	
	/**
	 * Retorna a data que a atividade foi registrada
	 * @return data de registro da atividade
	 */
	public Date getRegisterDate() {
		return this.registerDate;
	}

}
