package com.rodrigo.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor da posição " + i);
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
		
		System.out.println();
	
		System.out.println("Valor do vetor B multiplicado por o respectivo elemento de A e por sua posição = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print((vetorB[i] = vetorA[i] * i) + " ");
		}
	}

}
