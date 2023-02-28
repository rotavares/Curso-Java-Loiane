package com.rodrigo.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor, para ver todos os números primos até o valor digitado.");
		int numero = entrada.nextInt();

		for (int i = 2; i <= numero; i++) {
			boolean primo = true;
			for (int j = 2; j < i; j++) {
				if(i % j == 0) {
					primo = false;
				}
			}
			if(primo) {
				System.out.println(i);
			}
		}	entrada.close();
	}

}
