package com.rodrigo.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a base e expoente.");
		int base = entrada.nextInt();
		int expoente = entrada.nextInt();
		
		int resultado = base;
		
		for(int i=1; i < expoente; i++) {
			resultado *= base;
		}
		System.out.println(resultado);
		
		entrada.close();
	}
}
