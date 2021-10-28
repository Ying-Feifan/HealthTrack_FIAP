package br.com.fase5cap7;

import java.util.Date;

public class Weight {
	
	 public Weight(double numberWeight, Date dateWeight) {
		
		this.numberWeight = numberWeight;
		this.dateWeight = dateWeight;
	}
	 
	 //Propriedade
	 private double numberWeight;
	 private Date dateWeight;
	
	 //------Métodos------------
	 public double getNumberWeight() {
		return numberWeight;
	}
	public void setNumberWeight(double numberWeight) {
		this.numberWeight = numberWeight;
	}
	public Date getDateWeight() {
		return dateWeight;
	}
	public void setDateWeight(Date dateWeight) {
		this.dateWeight = dateWeight;
	}
	 
	 
}
