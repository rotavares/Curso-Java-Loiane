package com.rodrigo.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double produtos = 1.99;
		
		System.out.println("Lojas Quase Dois - Tabela de preços");
		for (int i = 1; i <= 50; i++) {
			System.out.println(i+" - R$ "+produtos);
			produtos += 1.99 ;
		}
		
		entrada.close();	
}
}
