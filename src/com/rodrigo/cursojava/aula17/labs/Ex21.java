package com.rodrigo.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite um número para descobrir se é primo ou não.");
		int numero = entrada.nextInt();
		boolean primo = true;
		
		
		for (int i = 2; i < numero ; i++) {
			if ((numero % i == 0) && i != numero)
				
				primo = false;
				break;
		}
		entrada.close();
		
		if(primo) 
			System.out.println(numero+" é primo.");
		
		else 
			System.out.println(numero+" não é primo.");
	}
}
