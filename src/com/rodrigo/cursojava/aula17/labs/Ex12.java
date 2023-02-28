package com.rodrigo.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex12 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o número para ver a tabuada");
		int num = entrada.nextInt();
		
		int multiplicacao;
		
		System.out.println("Tabuda do "+num);
		
		for (int i=1; i < 10; i++) {
			
			multiplicacao = num * i;
			
			System.out.println(num+" X "+i+" = "+multiplicacao);
		} entrada.close();
	}
}
