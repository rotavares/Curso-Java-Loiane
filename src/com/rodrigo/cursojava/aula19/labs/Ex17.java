package com.rodrigo.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int quantidade = 0;
		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o elemento do vetor A na posição " + i);
			vetorA[i] = sc.nextInt();
		}
		
		sc.close();
		
		for (int i = 0; i < vetorA.length; i++) {
			
			if (vetorA[i] > 35) {
				quantidade++;
			}
		}
		
		System.out.println("A quantidade de pessoas que possuem a idade superior de 35 anos é de "
		+ quantidade + " pessoas");
	}
}
