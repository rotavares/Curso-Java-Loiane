package com.rodrigo.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
	
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
		
		System.out.println();
		
		System.out.print("Valor de B multiplicado por 2 = ");
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] * 2 + " ");
		}
	}

}
