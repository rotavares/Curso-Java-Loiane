package com.rodrigo.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int quantidade = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o elemento do vetor A na posicao " + i);
			vetorA[i] = sc.nextInt();
		}
		
		sc.close();
		
		for (int i = 0, j = 9; i < vetorA.length; i++, j--) {
			
			if (vetorA[i] == vetorA[j]) {
				
				quantidade++;
			}
		}
		
		if (quantidade == 10) {
			System.out.println("O vetor A é um palíndromo.");
		}
		else {
			System.out.println("O vetor A não é um palíndromo.");
		}
	}
}
