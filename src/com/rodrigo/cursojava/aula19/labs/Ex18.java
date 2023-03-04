package com.rodrigo.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex18 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int maiorIdade = Integer.MIN_VALUE, menorIdade = Integer.MAX_VALUE;
		int posicaoMenor = 0 , posicaoMaior = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			
			System.out.println("Digite a idade que vai armazenar no vetor A na posição " + i);
			vetorA[i] = sc.nextInt();
		}
		
		sc.close();
		
		for (int i = 0; i < vetorA.length; i++) {
			
			if (vetorA[i] > maiorIdade) {
				
				posicaoMaior = i;
				maiorIdade = vetorA[i];
			}
			
			if (vetorA[i] < menorIdade) {
				
				posicaoMenor = i;
				menorIdade = vetorA[i];
			}
		}
		
		System.out.print("A menor idade informada é " + menorIdade + " da posição "+ posicaoMenor 
				+  "\nA maior idade informada é  " + maiorIdade + " da posição " + posicaoMaior);
	}
}
