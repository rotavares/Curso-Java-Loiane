package com.rodrigo.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex8 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num, soma = 0, media, contagem = 0;
		
		do {
			System.out.println("Digite o número");
			num = entrada.nextInt();
			
			soma += num;
			contagem++;
			
		} while (contagem < 5);
		
		media = soma/5;
		entrada.close();
		
		System.out.print("A soma é "+soma+"\n");
		
		System.out.println("A media é "+media);
	}
}
