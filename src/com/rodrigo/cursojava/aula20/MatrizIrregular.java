package com.rodrigo.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número de pessoas que serão entrevistadas");
		int numEntrevistados = scan.nextInt();
		
		String[][] nomeFilhos = new String[numEntrevistados][];
		
		for (int i = 0; i < nomeFilhos.length; i++) {
			
			System.out.println("Entre com a quantidade de filhos");
			int qtdFilhos = scan.nextInt();
			
			nomeFilhos[i] = new String[qtdFilhos];
			
			for (int j = 0; j < nomeFilhos[i].length; j++) {
				
				System.out.println("Digite o nome do " + (i+1) + " filho");
				
				nomeFilhos[i][j] = scan.next();
			}
		}
		
		scan.close();
		
		for (int i = 0; i < nomeFilhos.length; i++) {
			
			System.out.println("A " + (i+1) + " tem " + nomeFilhos.length + " filhos");
			
			for (int j = 0; j < nomeFilhos[i].length; j++) {
			
				System.out.println(nomeFilhos[i][j]);
			}
		}
	}
}
