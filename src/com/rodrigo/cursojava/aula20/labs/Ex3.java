package com.rodrigo.cursojava.aula20.labs;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] M = new int[3][3];
		int impares = 0, pares = 0;
		
		for (int i = 0; i < M.length; i++) {
			
			for (int j = 0; j < M[i].length; j++) {
				
				System.out.println("Entre com o valor da linha " + i + " coluna " + j);
				M[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
		
		for (int i = 0; i < M.length; i++) {
			
			for (int j = 0; j < M.length; j++) {
				
				System.out.print(M[i][j]);
			}
			
			System.out.println();	
		}
		
		for (int i = 0; i < M.length; i++) {
			
			for (int j = 0; j < M[i].length; j++) {
				
				if (M[i][j] % 2 == 0) {
					
					pares++;
					
				} else {
					
					impares++;
				}
			}
		}
		
		System.out.println("Quantidade de impares na matriz = " + impares);
		System.out.println("Quantidade de pares na matriz = " + pares);
		
	}
}
