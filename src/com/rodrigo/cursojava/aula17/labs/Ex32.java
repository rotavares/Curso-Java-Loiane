package com.rodrigo.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		boolean encerrar = true;
		int cod;
		double qtd;
		double total = 0;
		String saida = "";
		
		System.out.println("Especificação       Código   Preço");
		System.out.println("Cachorro Quente     100      R$ 1,20");
		System.out.println("Bauru Simples       101      R$ 1,30");
		System.out.println("Bauru com ovo       102      R$ 1,50");
		System.out.println("Hambúrguer          103      R$ 1,20");
		System.out.println("Cheeseburguer       104      R$ 1,30");
		System.out.println("Refrigerante        105      R$ 1,00");
		System.out.println(" ");
		
		
		do {
			System.out.println("Digite o código e a quantidade. Digite 0 para a código e quantidade para sair.");
			cod = entrada.nextInt();
			qtd = entrada.nextDouble();
			
			if(cod == 0 && qtd == 0) {
				encerrar = false;
				saida += "Total a pagar = R$" + total;
			} else {
				switch(cod) {
				
				case 100 :
				saida += "Cachorro Quente -> R$1,20 * " + qtd;
				saida += " = R$" + (1.2*qtd)+ "\n";
				total += 1.2*qtd;
				break;
				
				case 101 :
					saida += "Bauru Simples -> R$1,30 * " + qtd;
					saida += " = R$" + (1.3*qtd)+ "\n";
					total += 1.3*qtd;
					break;
					
				case 102 :
					saida += "Bauru com ovo -> R$1,50 * " + qtd;
					saida += " = R$" + (1.5*qtd)+ "\n";
					total += 1.5*qtd;
					break;
					
				case 103 :
					saida += "Hambúrguer -> R$1,20 * " + qtd;
					saida += " = R$" + (1.2*qtd)+ "\n";
					total += 1.2*qtd;
					break;
					
				case 104 :
					saida += "Cheeseburguer -> R$1,30 * " + qtd;
					saida += " = R$" + (1.3*qtd)+ "\n";
					total += 1.3*qtd;
					break;
					
				case 105 :
					saida += "Refrigerante -> R$1,00 * " + qtd;
					saida += " = R$" + (1*qtd)+ "\n";
					total += 1*qtd;
					break;
				
				default : System.out.println("Código inválido");
				 
				 
				}
			}
			
		}
			while(encerrar);
		System.out.println(saida);
		entrada.close();
	}
}
