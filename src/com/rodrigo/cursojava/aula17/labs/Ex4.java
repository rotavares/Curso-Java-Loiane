package com.rodrigo.cursojava.aula17.labs;

public class Ex4 {

	public static void main(String[] args) {
		
		int populacaoA = 80000;
		int populacaoB = 200000;
		int contagem = 0;
		
		while(populacaoA <= populacaoB) {
			populacaoA += (populacaoA/100) * 3;
			populacaoB += (populacaoB/100) * 1.5;
			contagem++;
		}
		System.out.println("Populacao A: "+ populacaoA);
		System.out.println("Populacao B: "+ populacaoB);
		System.out.println("Quantidade anos: "+ contagem);
	}
}
