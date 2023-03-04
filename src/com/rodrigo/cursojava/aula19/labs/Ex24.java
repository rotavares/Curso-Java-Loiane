package com.rodrigo.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			
			System.out.println("Digite o elemento do vetor A na posição " + i);
			vetorA[i] = sc.nextInt();
			
			if (vetorA[i] % 2 == 0) {
				
				System.out.println("o elemento é Par o Vetor B recebeu 1");
				vetorB[i] = 1;
			}
			else {
				
				System.out.println("o elemento é Impar o Vetor B recebeu 0");
				vetorB[i] = 0;
			}
		}
		
		sc.close();
		
		System.out.println();
		
		
		System.out.print("Vetor B = ");
		
		for (int i = 0; i < vetorB.length; i++) {
			
			System.out.print(vetorB[i] + " ");
		}
	}
}
