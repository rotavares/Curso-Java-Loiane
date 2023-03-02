package com.rodrigo.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int soma = 0, divisao = 0;
		for (int i = 0; i < vetorA.length; i++) {
			
			System.out.println("Digite o elemento do vetor A da posição " + i);
			vetorA[i] = sc.nextInt();
			
			if(vetorA[i] % 2 != 0) {
				soma += vetorA[i];
				divisao++;
			}
		}
		
		
		sc.close();
		
		System.out.println("A média aritmética simples dos elementos ímpares armazenados no vetor A é " + (soma / divisao));
	}

}
