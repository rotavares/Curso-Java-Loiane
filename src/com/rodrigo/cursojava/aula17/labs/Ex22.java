package com.rodrigo.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex22 {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite um número para descobrir se é primo ou não.");
		int numero = entrada.nextInt();
		boolean primo = true;
		int divisao = 0;
		
		
		for (int i = 2; i < numero ; i++) {
			if ((numero % i == 0) && i != numero)
				
				primo = false;
				break;
		}
		
		entrada.close();
		
		if (primo) {
			System.out.println(numero+" é primo.");
		} else {
			System.out.println(numero+" não é primo.");
				for (int i = 1; i <= numero; i++) {
					divisao = numero / i;
					if (numero % i == 0)
						System.out.println("o "+numero+" é divisível por "+divisao);
				}
		} 
		
	}
}
