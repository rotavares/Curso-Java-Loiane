package com.rodrigo.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade repetição.");
		int n = entrada.nextInt();
		int cima = 0;
		int baixo = 0;
		System.out.print("S = ");
		for (int i = 1, j = 1; i <= n; i++, j += 2) {
			System.out.print(i+"/"+j);
			if(i != n) {
				System.out.print(" + ");
			}
			
			if(i == n) {
				System.out.print(".");
			}
			cima += i;
			baixo += j;
		}
		System.out.println("\nSoma = " + cima + "/" + baixo);		
		entrada.close();
	}
}
