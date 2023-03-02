package com.rodrigo.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o elemento do vetor A da posição " + i);
			vetorA[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Digite o elemento do vetor B da posição " + i);
			vetorB[i] = sc.nextInt();
		}
		
		sc.close();
		
		System.out.print("Valor de A = ");
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.print("Valor de B = ");
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println();

		System.out.print("Valor de C que é a divisão dos elementos de A e B = ");
		
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print((vetorC[i] = vetorA[i] / vetorB[i]) + " ");
		}
	}

}
