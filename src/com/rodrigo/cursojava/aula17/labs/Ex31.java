package com.rodrigo.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double produto, total = 0, dinheiro, troco;
		int contagem = 1;
		System.out.println("Lojas Tabajara");
		
		do {
			System.out.print("Produto "+contagem+": R$ ");
			produto = entrada.nextDouble();
			total += produto;
			contagem++;
			
		} while (produto > 0);

		System.out.println("Total: R$"+total);
		
		System.out.print("Dinheiro: R$ ");
		dinheiro = entrada.nextDouble();
		entrada.close();
		troco = dinheiro - total;
		System.out.println("Troco: R$ "+troco);
		System.out.println(" ");
		System.out.println("Abrindo caixa...");
		System.out.println("Caixa aberto!");
	}
}
