package br.com.fase5cap7;

import java.util.Date;

public class Excercise {
	
	public Excercise(double lostCalories, Date dateActivity, int repetition, int duration) {
		
		this.lostCalories = lostCalories;
		this.dateActivity = dateActivity;
		this.repetition = repetition;
		this.duration = duration;
		
	}
	
	//Propriedades
	private double lostCalories;
	private Date dateActivity;
	private int repetition;
	private int duration;
	
	//-----Métodos------
	public double getLostCalories() {
		return lostCalories;
	}
	
	public void setLostCalories(double lostCalories) {
		this.lostCalories = lostCalories;
	}
	
	public Date getDateActivity() {
		return dateActivity;
	}
	
	public void setDateActivity(Date dateActivity) {
		this.dateActivity = dateActivity;
	}
	
	public int getRepetition() {
		return repetition;
	}
	
	public void setRepetition(int repetition) {
		this.repetition = repetition;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}

}
