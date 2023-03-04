package com.rodrigo.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int somaMenor  = 0, quantidade = 0, somaMaior = 0;
		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o elemento do vetor A na posição " + i);
			vetorA[i] = sc.nextInt();
		}
		
		sc.close();
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] < 15) {
				somaMenor += vetorA[i];
			}
			
			if (vetorA[i] == 15) {
				quantidade++;
			}
			
			if (vetorA[i] > 15) {
				somaMaior += vetorA[i];
			}
		}
		
		System.out.print("A soma de elementos armazenados inferiores a 15 é " + somaMenor 
				+ "\nA quantidade de elementos armazenados que são iguais a 15 é " + quantidade
				+ "\nA média dos elementos armazenados no vetor que são superiores  a 15 é  de " + (somaMaior / 5));
	}

}
