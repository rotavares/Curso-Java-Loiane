package com.rodrigo.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota, soma = 0, media;
			
		System.out.print("Digite a quantidade de notas: ");
		int n = entrada.nextInt();
		
		
		for (int i = 1; i <= n; i++) {
		
			System.out.print("Digite a "+i+" nota: ");
			nota = entrada.nextDouble();
			soma += nota;
			
		} media = soma/n;
		System.out.println("A média é "+media);
		entrada.close();
	}
}
