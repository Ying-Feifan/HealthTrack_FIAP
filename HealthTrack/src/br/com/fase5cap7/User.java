package br.com.fase5cap7;

import java.util.Date;

public class User {

	public User(String name, String cpf, Date dateOfBirth, double height, double weight, String email) {
		this.name = name;
		this.cpf = cpf;
		this.dateOfBirth = dateOfBirth;
		this.height = height;
		this.weight = weight;
		this.email = email;
		this.changeDate = new Date();
	}

	private String name;
	private String cpf;
	private Date dateOfBirth;
	private double height;
	private double weight;
	private String email;
	private Date changeDate;

	/**
	 * Registra Peso do usuário
	 * 
	 * @param weight = peso em kg
	 */
	public void setWeight(double weight) {
		this.weight = weight;
		this.changeDate = new Date();
	}

	/**
	 * Calcula o IMC do usuario
	 * 
	 * @return número IMC
	 */
	public double calculateIMC() {
		return this.weight / (this.height * this.height);
	}

	/**
	 * Retorna o nome do usuario
	 * 
	 * @return nome do usuario
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Retorna o CPF do usuario
	 * 
	 * @return CPF do usuario
	 */
	public String getCpf() {
		return this.cpf;
	}

	/**
	 * Retorna a Data de Nascimento do usuario
	 * 
	 * @return Data de Nascimento do usuario
	 */
	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	/**
	 * Retorna o Altura do usuario
	 * 
	 * @return Altura do usuario
	 */
	public double getHeight() {
		return this.height;
	}

	/**
	 * Retorna o Peso do usuario
	 * 
	 * @return Peso do usuario
	 */
	public double getWeight() {
		return this.weight;
	}

	/**
	 * Retorna o Email do usuario
	 * 
	 * @return Email do usuario
	 */
	public String getEmail() {
		return this.email;
	}
	
	/**
	 * Retorna a data de alteração do usuario
	 * 
	 * @return Data de alteração do usuario
	 */
	public Date getChangeDate() {
		return this.changeDate;
	}
}
