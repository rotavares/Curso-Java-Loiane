package com.rodrigo.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos números?");
		int qtdNumeros = entrada.nextInt();
		
		int numeros, maiorNumero = Integer.MIN_VALUE, menorNumero = Integer.MAX_VALUE;
		int soma = 0;
		
		
		for(int i=0; i < qtdNumeros; i++) {
		
			System.out.println("Digite um número entre 0 e 1000");
			numeros = entrada.nextInt();
			
			while(numeros < 0 || numeros > 1000) {
				System.out.println("Número inválido, digite novamente um número entre 0 e 1000");
				numeros = entrada.nextInt();	
			}
			
			soma += numeros;
			
			
			if(numeros > maiorNumero) 
				maiorNumero = numeros;
			
			
			if(numeros < menorNumero) 
				menorNumero = numeros;
		}
		
		System.out.print("Menor valor: "+menorNumero+
				"\nMaior valor: "+maiorNumero+
				"\nSoma dos valores: "+soma);
		
		entrada.close();

	}
}
