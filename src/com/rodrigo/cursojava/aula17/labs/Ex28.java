package com.rodrigo.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double valor, soma = 0, media;
			
		System.out.print("Digite a quantidade de CDs: ");
		int qtdCDs = entrada.nextInt();
		
		
		for (int i = 1; i <= qtdCDs; i++) {
		
			System.out.print("Digite o preço do "+i+" CD: R$");
			valor = entrada.nextDouble();
			soma += valor;
			
		} media = soma/qtdCDs;
		
		System.out.println("O valor médio gasto em CDs: R$"+media);
		
			entrada.close();

	}
}
