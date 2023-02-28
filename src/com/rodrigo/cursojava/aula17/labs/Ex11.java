package com.rodrigo.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int primeiroNumeroInteiro, segundoNumeroInteiro, soma = 0;
		System.out.println("Digite o primeiro número");
		primeiroNumeroInteiro = entrada.nextInt();
		
		System.out.println("Digite o segundo numero");
		segundoNumeroInteiro = entrada.nextInt();
		
		if (primeiroNumeroInteiro < segundoNumeroInteiro) {
			for (int i=primeiroNumeroInteiro; i < segundoNumeroInteiro; i++) {
				System.out.println(i);
				soma += i;
			}
		} else if (primeiroNumeroInteiro > segundoNumeroInteiro){
			for (int i=segundoNumeroInteiro; i < primeiroNumeroInteiro; i++) {
				System.out.println(i);
				soma += i;
			}
		} 		
		 System.out.println("Soma dos números é, "+soma);
	entrada.close();

	}
}
