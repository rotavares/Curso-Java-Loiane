package com.rodrigo.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex7 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num;
		int maiorNum = Integer.MIN_VALUE;
		
		for (int i=0; i < 5; i++) {
			
			System.out.println("Digite um número");
			num = entrada.nextInt();
			
			if (num > maiorNum) {
				maiorNum = num;
				System.out.println("O maior número mudou: "+maiorNum);
			}
		}
		System.out.println("O maior número mudou: "+maiorNum);
		entrada.close();
	}
}
