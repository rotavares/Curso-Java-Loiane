package com.rodrigo.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double produtos = 0.18;
		
		System.out.println("Lojas Quase Dois - Tabela de preços");
		for (int i = 1; i <= 50; i++) {
			System.out.println(i+" - R$ "+produtos);
			produtos += 0.18;
		}
		
		entrada.close();	


	}
}
