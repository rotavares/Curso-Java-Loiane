package com.rodrigo.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex5 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("habitantes e taxa de crescimento da primeira população: ");
		int populacaoA = entrada.nextInt();
		double taxaCresimentoA = entrada.nextDouble();
		
		System.out.print("habitantes e taxa de crescimento da segunda população: ");
		int populacaoB = entrada.nextInt();
		double taxaCresimentoB = entrada.nextDouble();
		entrada.close();
		
		int contagem = 0;
		if (populacaoA <= populacaoB) {
			while(populacaoA <= populacaoB) {
				populacaoA += (populacaoA/100) * taxaCresimentoA;
				populacaoB += (populacaoB/100) * taxaCresimentoB;
				contagem++;
			}
		} else if (populacaoB <= populacaoA) {
			while(populacaoB <= populacaoA) {
				populacaoA += (populacaoA/100) * taxaCresimentoA;
				populacaoB += (populacaoB/100) * taxaCresimentoB;
				contagem++;
			}
		} else {
			System.out.println("Valor inválido, encerrando programa...");
		}
		
		System.out.println("Populacao A: "+ populacaoA);
		
		System.out.println("Populacao B: "+ populacaoB);
		
		System.out.println("Quantidade anos: "+ contagem);
		
	}
}
