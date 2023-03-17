package com.rodrigo.cursojava.aula19.labs;

public class Ex35 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[15];
		
		for (int i = 0; i < vetorA.length; i++) {
			
			vetorA[i] = (int)Math.round(Math.random() * 10);
		}
		
		for (int i = 0; i < vetorB.length; i++) {
			
			vetorB[i] = vetorA[i];
			
			for (int j = 1; j < vetorA[i]; j++) {
				
				vetorB[i] *= j;
			}
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < vetorB.length; i++) {
			
			System.out.print(vetorB[i] + " ");
		}
		
	}
}
