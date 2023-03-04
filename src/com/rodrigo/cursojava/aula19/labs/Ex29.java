package com.rodrigo.cursojava.aula19.labs;

public class Ex29 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[20];
		int[] vetorB = new int[20];
		int[] vetorC = new int[vetorB.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			
			vetorA[i] = (int)Math.round(Math.random() * 100);
		}
		
		for (int i = 0; i < vetorC.length; i++) {
			
			if (vetorA[i] % 2 == 0) {
				
				vetorB[i] = vetorA[i];
			}
			else {
				
				vetorC[i] = vetorA[i];
			}
		}
		
		System.out.print("Vetor A = ");
		
		for (int i = 0; i < vetorA.length; i++) {
			
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Elementos pares do vetor A = ");
		
		for (int i = 0; i < vetorB.length; i++) {
			
			if (vetorB[i] != 0) {
				
				System.out.print(vetorB[i] + " ");
			}
		}
		
		System.out.println();
		
		System.out.print("Elementos impares do vetor A = ");
		
		for (int i = 0; i < vetorC.length; i++) {
			
			if (vetorC[i] != 0) {
			
				System.out.print(vetorC[i] + " ");
			}
		}
	}
}
