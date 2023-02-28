package com.rodrigo.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex1 {
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.println("Digite uma nota, entre zero e dez.");
			int nota = input.nextInt();
			
			while (nota < 0 || nota >= 10) {
				System.out.println("Valor inválido.\nDigite novamente uma nota entre zero e dez. ");
				nota = input.nextInt();
			}
			System.out.println("Parabéns, a nota digitada foi "+nota);
			input.close();
		}
}
