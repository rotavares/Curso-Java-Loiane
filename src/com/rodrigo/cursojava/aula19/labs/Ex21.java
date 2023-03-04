package com.rodrigo.cursojava.aula19.labs;

public class Ex21 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[10];
		int porcentagemUm, porcentagemZero, total;
		int um = 0, zero = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			
			vetorA[i] = (int) Math.round(Math.random() * 1);
			
			if (vetorA[i] == 1) {
				um++;
			}
			
			if (vetorA[i] == 0) {
				zero++;
			}
		}
		
		total = zero + um;
		porcentagemUm = (um * 100) / total;
		porcentagemZero = (zero * 100) / total;
		
		System.out.println(porcentagemUm  + "% de 1 no vetor A");
		System.out.println(porcentagemZero + "% de 0 no vetor A");
	}
}
