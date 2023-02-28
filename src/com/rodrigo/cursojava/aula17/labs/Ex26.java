package com.rodrigo.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int eleitores, candidato1 = 0, candidato2 = 0, candidato3 = 0, voto = 0;
		
		System.out.print("Digite a quantidade de eleitores: ");
		eleitores = entrada.nextInt();
		for (int i = 0; i < eleitores; i++) {
			System.out.print("Informe o número do candidato para a votação.\n"
					+ " \n"
					+ "Primeiro canditado digite o número \"1\"\n"
					+ "Segundo canditado digite o número \"2\"\n"
					+ "Terceiro canditado digite o número \"3\"\n"
					+ " \n"
					+ "Número do candidato: ");
			
			voto = entrada.nextInt();
			while(voto < 1 || voto > 3) {
				System.out.print("Número do Candidato válido: ");
				voto = entrada.nextInt();
			}
			
			switch(voto) {
			case 1:
				candidato1++;
				System.out.println("FIM");
				break;
			case 2:
				candidato2++;
				System.out.println("FIM");
				break;
			case 3:
				candidato3++;
				System.out.println("FIM");
				break;
			default:
				System.out.println(" ");
				System.out.println("***Digite um código do candidato válido por favor.***");
				System.out.println(" ");
			}
			System.out.println(" ");
			System.out.print("Número de votos\n"
					+ "\n"
					+ "Primeiro Candidato = "+candidato1+"\n"
					+ "Segundo Candidato = "+candidato2+"\n"
					+ "Terceiro Candidato = "+candidato3+"\n");
			System.out.println(" ");
			
		} if (candidato1 > candidato2) {
			System.out.println("O Primeiro Candidato ganhou a eleição!");
		} else if (candidato2 > candidato1) {
			System.out.println("O Segundo Candidato ganhou a eleição!");
		} else {
			System.out.println("O Terceiro Candidato ganhou a eleição!");
		}
		entrada.close();
	}
}
