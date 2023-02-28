package com.rodrigo.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex20 {

		public static void main(String[] args) {
			
			try (Scanner entrada = new Scanner(System.in)) {
				for (; ;) {
					System.out.println("Digite um fatorial com números positivos e menor que 16.");
					int numero = entrada.nextInt();
					if (numero < 0 || numero < 16) {
						
						int resultado = numero;
						int fatorial = numero;
						
						for(int i=1; i < numero; i++) {
							resultado *= (--fatorial);
							
						} System.out.println("Fatorial de "+numero+"! : "+resultado);
					} else {
						System.out.println("Valor inválido, digite novamente (números inteiros positivos menor que 16)");
					}
				}
			}
		}
}
