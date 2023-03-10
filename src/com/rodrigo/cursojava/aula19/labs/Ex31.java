package com.rodrigo.cursojava.aula19.labs;

public class Ex31 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[5];
		int resultadoTabuada = 0, quantidadeTabuada = 0, j = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			
			vetorA[i] = (int)Math.round(Math.random() * 10);
		}
		
		while (quantidadeTabuada < 5) {
			
			System.out.println("Tabuada do vetor A elemento: " + vetorA[j]);
			
			for (int i = 0; i < 10; i++) {
				
				resultadoTabuada = vetorA[j] * i;
				System.out.println(vetorA[j] + " x " + (i+1) + " = " + resultadoTabuada);
			}

			System.out.println();
			
			j++;
			quantidadeTabuada++;
		}		
	}
}
