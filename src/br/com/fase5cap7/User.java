package br.com.fase5cap7;

import java.util.Date;


public class User {
	
	public User(int idUser,String name, String cpf, Date dateOfBirth, double height, String email) {
		this.idUser = idUser;
		this.name = name;
		this.cpf = cpf;
		this.dateOfBirth = dateOfBirth;
		this.height = height;
		this.email = email;
	}
	
	//Propriedades
	private int idUser;
	private String name;
	private String cpf;
	private Date dateOfBirth;
	private double height;
	private String email;
	private Date changeDate;

	//---------------Métodos------------------
//	public void setWeight(double weight) {
//		
//		this.weight = weight;
//	}
//	
//	public double calculateIMC() {
//		return this.weight / (this.height * this.height);
//	}
	
	public int getIdUser() {
		return this.idUser;
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public String getCpf() {
		
		return this.cpf;
	}
	
	public Date getDateOfBirth() {
		
		return this.dateOfBirth;
	}
	
	public double getHeight() {
		
		return this.height;
	}
		
	public String getEmail() {
		
		return this.email;
	}
}
