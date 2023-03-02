package com.rodrigo.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int soma = 0;
		for (int i = 0; i < vetorA.length; i++) {
			
			System.out.println("Digite o elemento do vetor A da posição " + i);
			vetorA[i] = sc.nextInt();
			
			if(vetorA[i] % 5 == 0) {
				soma += vetorA[i];
			}
		}
		
		sc.close();
		
		System.out.println("A soma dos elementos múlitplos de cinco armazenados é " + soma);
	}

}
