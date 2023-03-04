package com.rodrigo.cursojava.aula19.labs;


public class Ex30 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			
			vetorA[i] = (int)Math.round(Math.random() * 9);
		}
		
		for (int i = 0; i < vetorB.length; i++) {
			
			if (vetorA[i] % 2 == 0) {
				
				vetorB[i] = vetorA[i];
			}
		}
		
		for (int i = 0; i < vetorB.length; i++) {
			
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < vetorA.length; i++) {
			
			System.out.print(vetorA[i] + " ");
		}
	}
}
