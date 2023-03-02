package com.rodrigo.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int pares = 0;
		
		
		for (int i = 0; i < vetorA.length; i++) {
			
			System.out.println("Digite o elemento do vetor A na posição " + i);
			vetorA[i] = sc.nextInt(); 
			
			if (vetorA[i] % 2 == 0) {
				pares++;
			}
		}
		
		sc.close();
		
		System.out.println("No vetor A de " + vetorA.length  + " elementos " + pares + " são números pares.");
		
	}

}
