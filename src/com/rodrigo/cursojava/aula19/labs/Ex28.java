package com.rodrigo.cursojava.aula19.labs;

public class Ex28 {

public static void main(String[] args) {
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[20];
		
		for (int i = 0; i < vetorA.length; i++) {
			
			vetorA[i] = (int)Math.round(Math.random() * 10);
			vetorB[i] = (int)Math.round(Math.random() * 10);
		}
		
		System.out.print("Vetor A = ");
		
		for (int i = 0; i < vetorA.length; i++) {
			
			System.out.print(vetorA[i]);
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		
		for (int i = 0; i < vetorB.length; i++) {
			
			System.out.print(vetorB[i]);
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			
			vetorC[i] = vetorA[i];
		}
		
		for (int i = 0, j = 10; i < vetorB.length && j < vetorC.length; i++, j++) {
			
			vetorC[j] = vetorB[i];
		}
		
		System.out.println();
		
		System.out.print("Vetor C = ");
		
		for (int i = 0; i < vetorC.length; i++) {
			
			System.out.print(vetorC[i] + " ");
		}
	}
}
