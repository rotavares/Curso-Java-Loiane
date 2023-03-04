package com.rodrigo.cursojava.aula19.labs;


public class Ex27 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			
			vetorA[i] = (int)Math.round(Math.random() * 9);
		}
		
		for (int i = 0, j = 9; i < vetorB.length && j > -1; i++, j--) {
			
			vetorB[i] = vetorA[j];
		}
		
		System.out.print("Vetor A = ");
		
		for (int i = 0; i < vetorA.length; i++) {
			
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		
		for (int i = 0; i < vetorB.length; i++) {
			
			System.out.print(vetorB[i] + " ");
		}
	}
}
