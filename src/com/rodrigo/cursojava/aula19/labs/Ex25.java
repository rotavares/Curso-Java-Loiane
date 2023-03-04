package com.rodrigo.cursojava.aula19.labs;


public class Ex25 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			
			vetorA[i] = (int)Math.round(Math.random() * 10);
			vetorB[i] = (int)Math.round(Math.random() * 10);
			
			if (vetorA[i] > vetorB[i]) {
				
				System.out.println("O elemento do vetor A é maior que o elemento do vetor B, vetor C recebeu 1");
				vetorC[i] = 1;
			}
			else if (vetorA[i] == vetorB[i]) {
				
				System.out.println("O elemento do vetor A é igual ao elemento do vetor B, vetor C recebeu 0");
				vetorC[i] = 0;
			} else {
				
				System.out.println("O elemento do vetor A é menor que o elemento do vetor B, vetor C recebeu -1");
				vetorC[i] = -1;
			}
		}
		
		System.out.println();
		
		System.out.print("Vetor C = ");
		
		for (int i = 0; i < vetorC.length; i++) {
			
			System.out.print(vetorC[i] + " ");
		}
	}
}
