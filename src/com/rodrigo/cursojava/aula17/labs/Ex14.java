package com.rodrigo.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numeros, impares = 0, pares = 0;
		
		for(int i=0; i < 10; i++) {
			System.out.println("Digite o número");
			numeros = entrada.nextInt();
			
			if(numeros % 2 != 0) {
				pares++; 
			} else {
				impares++;
			}
		} entrada.close();
		System.out.println("Quantidade de números pares: "+pares);
		System.out.println("Quantidade de números impares: "+impares);

	}
}
