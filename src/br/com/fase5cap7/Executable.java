package br.com.fase5cap7;

import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Executable {



	public static void main(String[] args) throws ParseException {
				
		//Criando instacias de classe User
		Date date = new SimpleDateFormat("dd-MM-yyyy").parse("10-10-2000");
//		User fulano = new User("Fulano", "123.123.123-12", date, 1.80, 100, "fulano@gmail.com");
//
//		double IMC = fulano.calculateIMC();
		
		 String newString = new SimpleDateFormat("dd-MM-yyyy").format(date);
		 
		
		 
		 /*
		System.out.println(String.format("Usuário: %s, CPF: %s, DataNasc: %s", fulano.getName(), fulano.getCpf(), fulano.getDateOfBirth()));
		System.out.println(String.format("Altura: %s, PesoKg: %s, email: %s", fulano.getHeight(), fulano.getWeight(), fulano.getEmail()));
		System.out.println("Seu IMC é: " +IMC);
		*/
	}

}
