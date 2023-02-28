package com.rodrigo.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int primeiroNumeroInteiro, segundoNumeroInteiro;
		System.out.println("Digite o primeiro número");
		primeiroNumeroInteiro = entrada.nextInt();
		
		System.out.println("Digite o segundo numero");
		segundoNumeroInteiro = entrada.nextInt();
		
		for (int i=primeiroNumeroInteiro; i < segundoNumeroInteiro; i++) {
			System.out.println(i);
		}
	entrada.close();
	}
}
