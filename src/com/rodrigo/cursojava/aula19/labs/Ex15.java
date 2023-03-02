package com.rodrigo.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int par = 0, impar = 0;
		int total;
		double porcentagemPar, porcentagemImpar;
		
		for (int i = 0; i < vetorA.length; i++) {
			
			System.out.println("Digite o elemento do vetor A na posição " + i);
			vetorA[i] = sc.nextInt();
		}
		
		sc.close();
		
		for (int i = 0; i < vetorA.length; i++) {
			
			if(vetorA[i] % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
			
		}
		
		sc.close();
		
		total = par + impar;
		porcentagemPar = (par * 100) / total;
		porcentagemImpar = (impar * 100) / total;
		System.out.println();
		
		System.out.println("Total de elementos pares e impares do vetor A = " + total);
		System.out.println("Porcentagem de pares = " + porcentagemPar + "%");
		System.out.println("Porcentagem de impares = " + porcentagemImpar+ "%");
	}

}
