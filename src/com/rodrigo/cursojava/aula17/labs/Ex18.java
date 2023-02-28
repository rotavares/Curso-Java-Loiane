package com.rodrigo.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos números?");
		int qtdNumeros = entrada.nextInt();
		
		int numeros = 0, maiorNumero = Integer.MIN_VALUE, menorNumero = Integer.MAX_VALUE;
		int soma = 0;
		for(int i=0; i < qtdNumeros; i++) {
			System.out.println("Digite o número");
			numeros = entrada.nextInt();
			
			soma += numeros;
			
			
			if(numeros > maiorNumero) {
				maiorNumero = numeros;
			}
			
			if(numeros < menorNumero) {
				menorNumero = numeros;
			}
			
			
		}
		
		System.out.print("Menor valor: "+menorNumero+
				"\nMaior valor: "+maiorNumero+
				"\nSoma dos valores: "+soma);
		
		entrada.close();

	}

}
